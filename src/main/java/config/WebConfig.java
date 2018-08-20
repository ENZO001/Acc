package config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@EnableTransactionManagement // add this
@ComponentScan(value = { "com.ctbc.model.**", "com.ctbc.controller.**" })
public class WebConfig {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	@Profile("PROD")
	public JndiObjectFactoryBean prodataSource() {
		JndiObjectFactoryBean jndiObjectFB = new JndiObjectFactoryBean();
		jndiObjectFB.setJndiName("jdbc/pcmsDB");
		jndiObjectFB.setResourceRef(true);
		jndiObjectFB.setProxyInterface(javax.sql.DataSource.class);
		return jndiObjectFB;
	}
	
//	@Bean // 如果是使用jdbc的話
//	public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
//		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//		transactionManager.setDataSource(dataSource);
//		return transactionManager;
//	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);

		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.transaction.factory_class",
				"org.hibernate.transaction.JDBCTransactionFactory");
//		properties.setProperty("hibernate.current_session_context_class", "thread"); // remove this
		sessionFactory.setHibernateProperties(properties);
		
		sessionFactory.setPackagesToScan("com.ctbc.model.vo");

		return sessionFactory;
	}
	
	@Bean	// add this
	public HibernateTransactionManager hibernateTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
	}
	
}
