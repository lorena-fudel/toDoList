<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AÑADIR LISTA NUEVA</title>
  <link rel="stylesheet" href="styles/style.css">
</head>
<body>

  <div class="body">

    <h1>AÑADIR LISTA NUEVA</h1>


      <form action="addLista" method="post">
        <label>
          <span>NOMBRE DE LA LISTA:</span>
          <input type="text" name="nombreLista" placeholder="nombre de la lista">
        </label>
        <label>
          <span>PRODUCTO:</span>
          <input type="text" name="producto" placeholder="producto">
        </label>
        <label>
          <span>CANTIDAD:</span>
          <input type="text" name="cantidad" placeholder="cantidad">
        </label>
        <label>
          <span>OBSERVACIONES:</span>
          <input type="text" name="observaciones" placeholder="observaciones">
        </label>
        <label>
          <span>NOMBRE DEL USUARIO DE LA LISTA:</span>
          <input type="text" name="nombreUsuario" placeholder="nombre del usuario de la lista">
        </label>
        <input type="submit" value="AÑADIR LISTA">

      </form>
  </div>
</body>
</html>
