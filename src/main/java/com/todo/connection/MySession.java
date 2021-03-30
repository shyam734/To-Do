package com.todo.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

public class MySession {

	public  SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		
		return sessionFactory;
		
	}
	
	public void closeFactory() {
		
		
		this.sessionFactory.close();
	}
}
