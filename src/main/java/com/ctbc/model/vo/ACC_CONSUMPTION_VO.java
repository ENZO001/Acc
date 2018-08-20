package com.ctbc.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ACC_CONSUMPTION")
public class ACC_CONSUMPTION_VO extends ACC_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "ACCOUNT_SEQ")
	private Integer accountSeq;
	
	@Column(name = "CONSUMPTION_NAME")
	private Integer consumptionName;
	
	@Column(name = "TYPE_SEQ")
	private Integer typeSeq;
	
	@Column(name = "DETAIL_SEQ")
	private Integer detailSeq;
	
	@Column(name = "PATTERNS_SEQ")
	private Integer patternsSeq;
	
	@Column(name = "CONSUMPTION_AMOUNT")
	private Integer consumptionAccount;

	public Integer getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(Integer accountSeq) {
		this.accountSeq = accountSeq;
	}

	public Integer getConsumptionName() {
		return consumptionName;
	}

	public void setConsumptionName(Integer consumptionName) {
		this.consumptionName = consumptionName;
	}

	public Integer getTypeSeq() {
		return typeSeq;
	}

	public void setTypeSeq(Integer typeSeq) {
		this.typeSeq = typeSeq;
	}

	public Integer getDetailSeq() {
		return detailSeq;
	}

	public void setDetailSeq(Integer detailSeq) {
		this.detailSeq = detailSeq;
	}

	public Integer getPatternsSeq() {
		return patternsSeq;
	}

	public void setPatternsSeq(Integer patternsSeq) {
		this.patternsSeq = patternsSeq;
	}

	public Integer getConsumptionAccount() {
		return consumptionAccount;
	}

	public void setConsumptionAccount(Integer consumptionAccount) {
		this.consumptionAccount = consumptionAccount;
	}

}
