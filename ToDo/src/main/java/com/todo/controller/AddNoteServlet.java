package com.todo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.connection.MySession;
import com.todo.model.Note;



public class AddNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String title=request.getParameter("title");
			String desc=request.getParameter("desc");
			
			Note note=new Note(title,desc,new Date(),new Date());
			
			
			//System.out.println(note.getId()+"  "+note.getNoteTitle());
			
			
			Session session= new MySession().getSessionFactory().openSession(); 
			Transaction tx=session.beginTransaction();
			session.save(note);
			
			
			tx.commit();
			session.close();
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			out.println("<center>");
			out.println("<h1>"+"Note Titled As "+"\""+title+"\""+" Added Successfully."+"</h1>");
		
			out.println("<a href='notes.jsp'>View Notes</a>");
			out.println("</center>");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
