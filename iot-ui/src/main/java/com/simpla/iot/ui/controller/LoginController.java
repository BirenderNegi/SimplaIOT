package com.simpla.iot.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simpla.iot.ui.common.Messages;
import com.simpla.iot.ui.common.UIConstants;

/**
 * Handles and retrieves the login or denied page depending on the URI template
 */
@Controller
public class LoginController {

	protected static Logger logger = Logger.getLogger(LoginController.class);
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(HttpServletRequest request,
			@RequestParam(value = "error", required = false) String error, ModelMap model) {
		logger.debug("Received request to show login page");
		if (error != null) {
			model.put(UIConstants.ERROR, getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
			model.put(UIConstants.USERNAME, obtainUsername(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		}
		return "login";
	}
	

	private String getErrorMessage(HttpServletRequest request, String key) {

		Exception exception = (Exception) request.getSession().getAttribute(key);
		String error = "";
		
		if (exception instanceof BadCredentialsException) {
			error = Messages.ERR_MSG_INVALID_USER_AND_PASSWORD;
		} else if (exception instanceof LockedException) {
			error = exception.getMessage();
		} else if (exception instanceof DisabledException) {
			error = exception.getMessage();
		} else {
			error = Messages.ERR_MSG_INVALID_USER_AND_PASSWORD;
		}
		return error;
	}

	protected String obtainUsername(HttpServletRequest request, String key) {
		Exception exception = (Exception) request.getSession().getAttribute(key);
		String username = null;
		if (exception instanceof AuthenticationException) {
			Authentication authentication = ((AuthenticationException) exception).getAuthentication();
			if (authentication != null) {
				username = authentication.getName();
			}
		}
		return username;
	}

	/**
	 * Handles and retrieves the denied JSP page.
	 * 
	 * @return the name of the JSP page
	 */
	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	public String getDeniedPage() {
		logger.debug("Received request to show denied page");
		return "deniedpage";
	}
}