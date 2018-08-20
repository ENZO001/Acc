package com.ctbc.model.dao;

import java.util.List;

import com.ctbc.model.vo.ACC_ACCOUNT_VO;
import com.ctbc.model.vo.ACC_CONSUMPTION_PATTERN_VO;
import com.ctbc.model.vo.ACC_CONSUMPTION_TYPE_VO;

public interface MaintainSystemParameterDao {

	public List<ACC_CONSUMPTION_TYPE_VO> getAccConsumptionTypes();
	
	public List<ACC_CONSUMPTION_PATTERN_VO> getAccConsumptionPatterns();
	
	public List<ACC_ACCOUNT_VO> getAccAccounts();
}
