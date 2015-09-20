package com.gotprint.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gotprint.dao.UserHibernateDao;
import com.gotprint.domain.User;
import com.gotprint.util.HibernateUtil;

public class UserHibernateDaoImpl implements UserHibernateDao {

	public User getUserDetails(String userEmail) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        User user = (User) session.get(User.class, userEmail);
        tx.commit();
        sessionFactory.close();
		return user;
	}
}
