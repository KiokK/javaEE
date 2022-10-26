package com.kihtenko.javaee.command.impl;

import com.kihtenko.javaee.command.Command;
import com.kihtenko.javaee.command.exception.CommandException;
import com.kihtenko.javaee.controller.PageName;
import com.kihtenko.javaee.entity.User;
import com.kihtenko.javaee.service.UserService;
import com.kihtenko.javaee.service.exception.ServiceException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements Command{
	
	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";

	@Override
	public String execute(HttpServletRequest request) throws CommandException {
		String page;
		
		try {
			User user = UserService.checkLogin(request.getParameter(LOGIN), request.getParameter(PASSWORD));
			if (user != null){
				request.getSession(true).setAttribute("UserData", user);
				//request.setAttribute("userData", user);
				page = PageName.USER_PAGE;
			}else{
				page = PageName.ERROR_PAGE;
			}
		} catch (ServiceException e) {
			throw new CommandException(e);
		}
		
		return page;
	}

}
