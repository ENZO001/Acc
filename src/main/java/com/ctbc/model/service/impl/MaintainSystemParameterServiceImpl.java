package com.ctbc.model.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctbc.model.dao.MaintainSystemParameterDao;
import com.ctbc.model.service.MaintainSystemParameterService;
import com.ctbc.model.vo.ACC_ACCOUNT_VO;
import com.ctbc.model.vo.ACC_CONSUMPTION_PATTERN_VO;
import com.ctbc.model.vo.ACC_CONSUMPTION_TYPE_VO;

@Service
public class MaintainSystemParameterServiceImpl implements MaintainSystemParameterService {

	@Autowired
	private MaintainSystemParameterDao maintainSystemParameterDao;
	
	@Override
	@Transactional
	public Map<String, Object> getMaintainInfo() {
		Map<String, Object> maintainInfoMap = new HashMap<String, Object>();
		List<ACC_CONSUMPTION_TYPE_VO> accConsumptionTypesList = maintainSystemParameterDao.getAccConsumptionTypes();
		List<ACC_CONSUMPTION_PATTERN_VO>  accConsumptionPatternsList = maintainSystemParameterDao.getAccConsumptionPatterns();
		List<ACC_ACCOUNT_VO>  accAccountsList = maintainSystemParameterDao.getAccAccounts();
		
		maintainInfoMap.put("accConsumptionTypesList", accConsumptionTypesList);
		maintainInfoMap.put("accConsumptionPatternsList", accConsumptionPatternsList);
		maintainInfoMap.put("accAccountsList", accAccountsList);
		
		return maintainInfoMap;
	}
	
}
