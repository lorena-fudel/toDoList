<%@ page import="com.todolist.todolist.BBDDConector" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>TO DO LIST</title>
  <link rel="stylesheet" href="styles/style.css">
</head>

<body>

<div class="body">

  <h1 class="titulo-principal"><%= "Lista de Tareas" %></h1>
  <h2>b i e n v e n i d @ s</h2>

  <br/>

  <a class="enlaces" href="obtenerListas">IMPRMIR LISTAS</a>



<footer>
  <p>Lorena Fumero Delgado - Poryecto Intermodular - 2025 &copy;</p>
</footer>

  <%

    BBDDConector.GetInstance();

  %>
</div>


</body>
</html>