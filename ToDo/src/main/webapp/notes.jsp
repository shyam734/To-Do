<%@page import="com.todo.model.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.todo.connection.MySession"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
<%@include file="navbar.jsp" %>
<br>

<h3><center><b style=color:green>All Notes:</b></center></h3>



<center>
<%

Session session1=new MySession().getSessionFactory().openSession();
Query q=session1.createQuery("from Note");
List<Note> list=q.list();

for(Note note: list){
	
	%>
	<br>
	<div class="card" style="width: 40rem ;height:17rem;border-style: solid;border-width:3px;">
 <center> <img class="card-img-top" src="img/note.jpg" alt="Card image cap" style="width:80px; height:75px "></center>
  <div class="card-body">
     <%-- <h5 class="card-title"><% out.println(note.getId()); %></h5>  --%>
    <p class="card-text"><% out.println(note.getNoteTitle()); %></p>
   <%--  <p class="card-text"><% out.println(note.getNoteContent()); %></p> --%>
   <a href="viewNote.jsp?noteId=<%=note.getId() %>" class="btn btn-success" >View Note</a><br><br>
    <a href="updateForm.jsp?noteId=<%=note.getId() %>" class="btn btn-primary" >Update</a> &nbsp; &nbsp; &nbsp; &nbsp; <a href="delete?noteId=<%=note.getId()%>" class="btn btn-danger" id=<%=note.getId()%>>Delete </a>
  </div>
</div>
	
	<%
	System.out.println(note.getId()+"  "+note.getNoteTitle());
	
	out.println("<br>");
	
	
	/* out.println(note.getId()+"  "+note.getNoteTitle()); */
	
}

session1.close();
%>
</center>
</div>
</body>
</html>