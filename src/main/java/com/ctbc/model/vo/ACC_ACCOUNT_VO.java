package com.ctbc.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ACC_ACCOUNT")
public class ACC_ACCOUNT_VO extends ACC_BASIC_VO {

	private static final long serialVersionUID = 1L;

	@Column(name = "ACCOUNT_BANK")
	private String accountBank;
	
	@Column(name = "ACCOUNT_BALANCE")
	private Integer accountBalance;

	public String getAccountBank() {
		return accountBank;
	}

	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}

	public Integer getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}

}
