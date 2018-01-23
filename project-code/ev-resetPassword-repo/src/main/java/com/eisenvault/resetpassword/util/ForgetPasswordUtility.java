package com.eisenvault.resetpassword.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

public class ForgetPasswordUtility extends DeclarativeWebScript{

	private boolean authenticationChain;

	public void setAuthenticationChain(boolean authenticationChain) {
		this.authenticationChain = authenticationChain;
	}
	
	@Override
	protected Map<String, Object> executeImpl(WebScriptRequest req, Status status) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		if(authenticationChain == true)
			model.put("returnStatus", Boolean.TRUE);
		else
			model.put("returnStatus", Boolean.FALSE);
						
		return model;
	}
}
