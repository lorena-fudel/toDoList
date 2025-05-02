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

  <div class="titulo-pagina">
    <div>
      <img src="img/logo-toDoList.jpg">
    </div>
    <div>
      <h1 class="titulo-principal"><%= "Lista de Tareas" %></h1>
    </div>
  </div>

  <h2>b i e n v e n i d @ s</h2>
  <div class="container-principal-index">
    <nav class="nav-pagina">
      <a class="enlaces" href="obtenerListas">IMPRIMIR LISTAS</a>
    </nav>
  </div>




<footer>
  <p>Lorena Fumero Delgado - Poryecto Intermodular - 2025 &copy;</p>
</footer>

  <%

    BBDDConector.GetInstance();

  %>
</div>


</body>
</html>