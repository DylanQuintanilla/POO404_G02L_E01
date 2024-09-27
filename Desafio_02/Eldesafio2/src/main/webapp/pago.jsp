<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Pagar</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container">
<h1 class="text-center">Proceso de Pago</h1>
<%
  String total = request.getParameter("total");
%>
<h3>Total a Pagar: $<%= total %></h3>
<p>Gracias por su compra.</p>
<a href="index.jsp" class="btn btn-secondary">Volver a Iniciar Sesión</a>
</body>
</html>

