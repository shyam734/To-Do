package com.todo.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.todo.connection.MySession;
import com.todo.model.Note;

public class UpdateNoteServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside Update Servlet");
		
		int noteId=Integer.parseInt(request.getParameter("noteId"));
		System.out.println("NoteId: "+noteId);
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		
		Session session=new MySession().getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Note note=(Note)session.get(Note.class,noteId);
		note.setNoteContent(content);
		note.setNoteTitle(title);
		note.setLastUpdated(new Date());
		session.update(note);
		
		
		tx.commit();
		session.close();
		response.sendRedirect("notes.jsp");
		
		
		
		
		
	}

}
