package com.gotprint.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.gotprint.dao.UserHibernateDao;
import com.gotprint.domain.User;
import com.gotprint.impl.UserHibernateDaoImpl;

public class UserValidator {
	
	UserHibernateDao userDao = new UserHibernateDaoImpl();

	public boolean validate(String userEmail) throws Exception {
		if(userEmail.isEmpty()){
			return false;
		}

		if(isValidEmailFormat(userEmail)){
			User user = userDao.getUserDetails(userEmail);
			if(user == null){
				throw new Exception("User details not found in database");
			}
		}
		
		return false;
	}

	private boolean isValidEmailFormat(String userEmail) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(userEmail);
	    if(!matcher.matches()){
	    	return false;
	    }
		return true;
	}

}
