<%@ page import="org.hibernate.Session" %>
<%@ page import="com.helper.factoryProvided" %>
<%@ page import="org.hibernate.Query" %>
<%@ page import="java.util.List" %>
<%@ page import="com.entities.*" %>
<%@ page import="java.util.ArrayList" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   
     
  <title>Hello, world!</title>
  <%@include file="allnOne.jsp" %>
  </head>
  <body>
 <h1 align="center">This is a Show Note Page</h1>
 <%
 Session s = factoryProvided.getFactory().openSession();
 Query q = s.createQuery("form note");
 List<Note> list = q.list();
 for(Note note:list)
 {
	 out.println(note.get);
 }
 s.close();
 %>
  </body>
</html>