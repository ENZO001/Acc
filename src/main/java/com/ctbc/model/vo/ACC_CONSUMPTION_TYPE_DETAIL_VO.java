package com.ctbc.model.vo;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "ACC_CONSUMPTION_TYPE_DETAIL")
public class ACC_CONSUMPTION_TYPE_DETAIL_VO extends ACC_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "TYPE_SEQ")
	private Integer typeSeq;

	@Column(name = "TYPE_DETAIL_NAME")
	private String typeDetailName;

	public Integer getTypeSeq() {
		return typeSeq;
	}

	public void setTypeSeq(Integer typeSeq) {
		this.typeSeq = typeSeq;
	}

	public String getTypeDetailName() {
		return typeDetailName;
	}

	public void setTypeDetailName(String typeDetailName) {
		this.typeDetailName = typeDetailName;
	}

}
