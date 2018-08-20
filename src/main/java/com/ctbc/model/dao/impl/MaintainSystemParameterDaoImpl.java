package com.ctbc.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctbc.model.dao.MaintainSystemParameterDao;
import com.ctbc.model.vo.ACC_ACCOUNT_VO;
import com.ctbc.model.vo.ACC_CONSUMPTION_PATTERN_VO;
import com.ctbc.model.vo.ACC_CONSUMPTION_TYPE_VO;

@Repository
public class MaintainSystemParameterDaoImpl implements MaintainSystemParameterDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ACC_CONSUMPTION_TYPE_VO> getAccConsumptionTypes() {
		Session session = sessionFactory.getCurrentSession();
		List<ACC_CONSUMPTION_TYPE_VO> accConsumptionTypesList = session.createCriteria(ACC_CONSUMPTION_TYPE_VO.class).list();
		return accConsumptionTypesList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ACC_CONSUMPTION_PATTERN_VO> getAccConsumptionPatterns() {
		Session session = sessionFactory.getCurrentSession();
		List<ACC_CONSUMPTION_PATTERN_VO>  accConsumptionPatternsList = session.createCriteria(ACC_CONSUMPTION_PATTERN_VO.class).list();
		return accConsumptionPatternsList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ACC_ACCOUNT_VO> getAccAccounts() {
		Session session = sessionFactory.getCurrentSession();
		List<ACC_ACCOUNT_VO>  accAccountsList = session.createCriteria(ACC_ACCOUNT_VO.class).list();
		return accAccountsList;
	}
}
