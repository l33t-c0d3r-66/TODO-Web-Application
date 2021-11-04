package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	public static SessionFactory sessionFactory = null;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public void closeSessionFactory() {
		if (sessionFactory.isOpen()) {
			sessionFactory.close();
		}
	}
}
