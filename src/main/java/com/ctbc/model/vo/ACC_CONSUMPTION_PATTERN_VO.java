package com.ctbc.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ACC_CONSUMPTION_PATTERN")
public class ACC_CONSUMPTION_PATTERN_VO extends ACC_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "PATTERN_NAME")
	private String patternName;

	public String getPatternName() {
		return patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

}
