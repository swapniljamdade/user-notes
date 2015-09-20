package com.gotprint.dao;

import com.gotprint.domain.User;


public interface UserHibernateDao {

	User getUserDetails(String userEmail);

}
