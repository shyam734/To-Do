package com.todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.connection.MySession;
import com.todo.model.Note;

public class DeleteNoteServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("Inside Delete Servlet.");
			Session session=new MySession().getSessionFactory().openSession();
			System.out.println("1st Test");
			int id=Integer.parseInt(request.getParameter("noteId"));
			System.out.println(id);
			Transaction tx=session.beginTransaction();
			Note note=(Note)session.get(Note.class,id);
			session.delete(note);
			
			tx.commit();
			session.close();
			response.sendRedirect("notes.jsp");
		}
		catch(Exception e) {e.printStackTrace();}
		
		
	}

}
