package com.todo.main;

import org.hibernate.SessionFactory;

import com.todo.connection.MySession;

public class Runner{

	
	public static void main(String[] args) {
		MySession mySession=new MySession();
		SessionFactory session=mySession.getSessionFactory();
		System.out.println(session);
		
		
		
		
		
		
		
		
	}
	
}
