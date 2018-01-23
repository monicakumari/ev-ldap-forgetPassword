package com.eisenvault.resetpassword.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.extensions.webscripts.DeclarativeWebScript;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

public class ForgetPasswordUtility extends DeclarativeWebScript{

	private boolean authenticationChain;

	private static Logger logger = Logger.getLogger(ForgetPasswordUtility.class); 
	
	public void setAuthenticationChain(boolean authenticationChain) {
		this.authenticationChain = authenticationChain;
	}
	
	@Override
	protected Map<String, Object> executeImpl(WebScriptRequest req, Status status) {
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		logger.debug("\n\n******************************************* authenticationChain : " + authenticationChain +"\n\n");
		
		if(authenticationChain == true) {
			logger.debug("------------------------------------------------------------------------------------------------------");
			model.put("returnStatus", Boolean.TRUE);}
		else {
			logger.debug("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			model.put("returnStatus", Boolean.FALSE);}
						
		return model;
	}
}