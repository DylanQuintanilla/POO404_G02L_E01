<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
  <title>Pedidos Pendientes</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
  <h1 class="text-center">Pedidos Pendientes</h1>

  <table class="table">
    <thead>
    <tr>
      <th>Plato</th>
      <th>Precio</th>
      <th>Status</th>
    </tr>
    </thead>
    <tbody>
    <%
      // Recuperar la lista de nombres y precios de la sesión
      ArrayList<String> nombres = (ArrayList<String>) session.getAttribute("nombres");
      ArrayList<Double> precios = (ArrayList<Double>) session.getAttribute("precios");

      // Verificar si las listas están vacías o nulas
      if (nombres == null || precios == null || nombres.isEmpty() || precios.isEmpty()) {
        out.println("<tr><td colspan='3' class='text-center'>No hay pedidos pendientes.</td></tr>");
      } else {
        // Mostrar los pedidos pendientes
        for (int i = 0; i < nombres.size(); i++) {
          String nombrePlato = nombres.get(i);
          Double precioPlato = precios.get(i);

          out.println("<tr>");
          out.println("<td>" + (nombrePlato != null ? nombrePlato : "N/A") + "</td>");
          out.println("<td>$" + (precioPlato != null ? precioPlato : "0.00") + "</td>");
          out.println("<td>Pendiente</td>");
          out.println("</tr>");
        }
      }
    %>
    </tbody>
  </table>

  <a href="index.jsp" class="btn btn-secondary">Cerrar Sesión</a>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>




