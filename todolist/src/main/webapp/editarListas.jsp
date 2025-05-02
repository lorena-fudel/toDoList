<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>editar</title>
  <link rel="stylesheet" href="styles/style.css">
</head>
<body>

  <div class="body">
    <h1>editar esta lista</h1>

    <div >
      <form action="updateProducto" method="post">
        <input type="hidden" name="idLista" value="<%=request.getAttribute("idListas")%>">
        <label>
          <span>NOMBRE DE LA LISTA:</span>
          <input type="text" name="nombreLista" placeholder=" NUEVO nombre de la lista">
        </label>
        <label>
          <span>PRODUCTO:</span>
          <input type="text" name="producto" placeholder=" NUEVO producto">
        </label>
        <label>
          <span>CANTIDAD:</span>
          <input type="text" name="cantidad" placeholder="NUEVO cantidad">
        </label>
        <label>
          <span>OBSERVACIONES:</span>
          <input type="text" name="observaciones" placeholder=" NUEVO observaciones">
        </label>
        <label>
          <span>NOMBRE DEL USUARIO DE LA LISTA:</span>
          <input type="text" name="nombreUsuario" placeholder="nombre del usuario">
        </label>
        <input type="submit" value="EDITAR">

      </form>
    </div>
  </div>
</body>
</html>
