/*package com.todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.connection.MySession;
import com.todo.model.Note;

*//**
 * Servlet implementation class ViewNoteServlet
 *//*
public class ViewNoteServlet extends HttpServlet {
	
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			int noteId=Integer.parseInt(request.getParameter("noteId"));
			Session session=new MySession().getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
		Note note=(Note)session.get(Note.class, noteId);
		response.sendRedirect("view.jsp");
			
		
			
		
			session.close();
			
		}
		catch( Exception e) {
			e.printStackTrace();
			
			
		}
		
	}

}
*/