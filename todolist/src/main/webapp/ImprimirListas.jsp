        <%@ page import="java.util.ArrayList" %>
<%@ page import="com.todolist.todolist.models.Listas" %><%--
  Created by IntelliJ IDEA.
  User: fmrlo
  Date: 27/04/2025
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado de Listas</title>
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>

  <h1>Listado de Listas</h1>

  <div class="container">

      <%
          ArrayList<Listas> lista = (ArrayList<Listas>) request.getAttribute("lista");

          if (lista!=null){
              for (int i=0; i< lista.size(); i++) {
      %>

    <div>
      <p>nombre de la lista: <%=lista.get(i).getNombreLista() %></p>
      <p>producto: <%=lista.get(i).getProducto() %></p>
      <p>cantidad: <%=lista.get(i).getCantidad() %></p>
      <p>observaciones: <%=lista.get(i).getObservaciones() %></p>
      <p>nombreUsuario: <%=lista.get(i).getNombreUsuario() %></p>
    </div>

      <%
              }
          }
      %>

  </div>

</body>
</html>
