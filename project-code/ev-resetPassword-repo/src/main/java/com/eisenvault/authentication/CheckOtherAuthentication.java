package com.eisenvault.authentication;

import java.util.HashMap;
import java.util.Map;

import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

public class CheckOtherAuthentication extends DeclarativeWebScript{

	private boolean checkOtherAuthentication;

	public void setCheckOtherAuthentication(boolean checkOtherAuthentication) {
		this.checkOtherAuthentication = checkOtherAuthentication;
	}
	
	@Override
	protected Map<String, Object> executeImpl(WebScriptRequest req, Status status) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		if(checkOtherAuthentication == true)
			model.put("returnStatus", Boolean.TRUE);
		else
			model.put("returnStatus", Boolean.FALSE);
						
		return model;
	}
}
