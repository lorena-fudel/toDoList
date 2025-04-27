<%@ page import="com.todolist.todolist.BBDDConector" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
  <h1><%= "TO DO LIST" %></h1>

<br/>

  <a href="obtenerListas">IMPRMIR LISTAS</a>

<%

  BBDDConector.GetInstance();

%>



</body>
</html>