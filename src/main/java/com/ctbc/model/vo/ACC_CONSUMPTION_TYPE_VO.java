package com.ctbc.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ACC_CONSUMPTION_TYPE")
public class ACC_CONSUMPTION_TYPE_VO extends ACC_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "TYPE_NAME")
	private String typeName;

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
