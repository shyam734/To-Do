
<%@page import="com.todo.connection.*,org.hibernate.*,com.todo.model.*" %>
<%

int noteId=Integer.parseInt(request.getParameter("noteId"));
Session s=new MySession().getSessionFactory().openSession();
Note note=(Note)s.get(Note.class,noteId);
%>

<Center><h4><u>Edit Form</u></h4></Center>
<form  style=text-align:center action="update" method="post">
<br><br><br>
  <div class="form-group">
   <b>Add Title</b>
   <input type="hidden" name="noteId" value=<%=note.getId()%>>
    <center><input type="text" class="form-control" id="title"  placeholder="Enter Title" style=width:390px name="title" required value="<%=note.getNoteTitle() %>" ></center>
   
  </div>
  <br>
  
 <div>
<b>Description</b>
 <center><textarea class="form-control" id="exampleFormControlTextarea1" rows="3" style=width:390px placeholder="Enter Description" name="content" required  ><%= note.getNoteContent() %></textarea></center>
 </div>
  <br>
  <button type="submit" class="btn btn-primary">UPDATE</button>
</form>