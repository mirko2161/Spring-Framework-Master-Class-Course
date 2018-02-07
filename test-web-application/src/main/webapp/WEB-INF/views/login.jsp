<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Yahoo from JSP</title>
  </head>
  <!-- a scriptlet - embedded Java-code -->
<%
System.out.println("blabla");
System.out.println(request.getParameter("name"));
Date date = new Date();
%>
  <!-- a scriptlet expression -->
  <div>Current date is <%=date %></div>
  <body>
      My first JSP by ${name}
  </body>
</html>
