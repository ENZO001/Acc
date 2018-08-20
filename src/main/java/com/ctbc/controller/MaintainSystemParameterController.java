package com.ctbc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctbc.model.service.MaintainSystemParameterService;
import com.google.gson.Gson;

@Controller
public class MaintainSystemParameterController {

	@Autowired
	private MaintainSystemParameterService maintainSystemParameterService;
	
	@RequestMapping(value = "/ACCOUNT/MAINTAIN_SYSTEM_PARAMETER/getMaintainInfo", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Map<String, Object> getMaintainInfo() {
		Map<String, Object> responseMap = maintainSystemParameterService.getMaintainInfo();
		Gson gson = new Gson();
		String responseString = gson.toJson(responseMap);
		responseMap.put("tota", responseString);
		return responseMap;
	}

}
