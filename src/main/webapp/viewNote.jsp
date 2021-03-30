<%@page import="com.todo.model.Note"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.todo.connection.MySession"%>
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


<%
int noteId=Integer.parseInt(request.getParameter("noteId"));
Session session2=new MySession().getSessionFactory().openSession();
Note note=(Note)session2.get(Note.class, noteId);
%>

<br>
<center>
<div class="card w-50" text-align:center>
  <div class="card-body">
    <h5 class="card-title"><%=note.getNoteTitle() %></h5>
    <p class="card-text"><%=note.getNoteContent() %></p>
    <a href="notes.jsp" class="btn btn-primary">Back</a>
  </div>
</div>
</center>
</body>
</html>