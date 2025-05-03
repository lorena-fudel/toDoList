<%@ page import="java.util.ArrayList" %>
<%@ page import="com.todolist.todolist.models.Listas" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado de Listas</title>
    <link rel="stylesheet" href="styles/style.css">
    <script src="js/main.js" defer></script>
</head>
<body>
    <div class="body">
        <h1>Listado de Listas</h1>

        <div class="div-enlace-aniadir-lista">
            <a href="anadirProducto.jsp" class="add">AÑADIR LISTA</a>
      <%--<a href="obtenerListas.jsp" class="add">listado de listas</a>     HAY QUE HACER BIEN ESTE ENLACE--%>
        </div>

        <div class="container">

              <%
                  ArrayList<Listas> lista = (ArrayList<Listas>) request.getAttribute("lista");

                  if (lista!=null){
                      for (int i=0; i< lista.size(); i++) {
              %>

        <div class="carta-individual">
          <p>nombre de la lista: <%=lista.get(i).getNombreLista() %></p>
          <p>producto: <%=lista.get(i).getProducto() %></p>
          <p>cantidad: <%=lista.get(i).getCantidad() %></p>
          <p>observaciones: <%=lista.get(i).getObservaciones() %></p>
          <p>nombreUsuario: <%=lista.get(i).getNombreUsuario() %></p>
            <a href="borrarLista?idListas=<%= lista.get(i).getIdListas()%>">
                <button class="borrar-lista" onclick="borrar()">BORRAR LISTA</button>
            </a>
            <a href="editarLista?idListas=<%= lista.get(i).getIdListas()%>">
                <button class="editar-lista" onclick="editar()">EDITAR LISTA</button>
            </a>
        </div>

              <%
                      }
                  }
              %>

        </div>
    </div>
</body>
</html>
