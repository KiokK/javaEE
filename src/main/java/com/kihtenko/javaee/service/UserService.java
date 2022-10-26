package com.kihtenko.javaee.service;

import com.kihtenko.javaee.dao.UserDAO;
import com.kihtenko.javaee.entity.User;
import com.kihtenko.javaee.service.exception.ServiceException;

public final class UserService {

	private static UserDAO userDAO = new UserDAO();
	public final static User checkLogin(String login, String password) throws ServiceException{
		if (!Validator.loginValidator(login, password)){
			throw new ServiceException("Invalid login or password");
		}
		
		//dao
		return userDAO.findByLoginAndPassword(login, password);
		//return null;
	}

	public final static User save(String login, String password) throws ServiceException{
		return userDAO.update(new User(password, login));
	}

	public final static User findByLogin(String login) {
		return userDAO.findByLogin(login);
	}
	
	static class Validator{
		public static boolean loginValidator(String login, String password){
			if(login.isEmpty()){
				return false;
			}
			if(password.isEmpty()){
				return false;
			}
			return true;
		}		
	}
}
