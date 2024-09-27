<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Carrito de Compras</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center">Carrito de Compras</h1>

    <table class="table">
        <thead>
        <tr>
            <th>Plato</th>
            <th>Precio</th>
        </tr>
        </thead>
        <tbody>
        <%
            ArrayList<String> nombres = (ArrayList<String>) session.getAttribute("nombres");
            ArrayList<Double> precios = (ArrayList<Double>) session.getAttribute("precios");

            if (nombres == null) {
                nombres = new ArrayList<>();
            }
            if (precios == null) {
                precios = new ArrayList<>();
            }

            String nombre = request.getParameter("nombre");
            String precioStr = request.getParameter("precio");
            if (nombre != null && precioStr != null) {
                nombres.add(nombre);
                precios.add(Double.parseDouble(precioStr));
                session.setAttribute("nombres", nombres);
                session.setAttribute("precios", precios);
            }

            double total = 0;

            for (int i = 0; i < nombres.size(); i++) {
                out.println("<tr>");
                out.println("<td>" + nombres.get(i) + "</td>");
                out.println("<td>$" + precios.get(i) + "</td>");
                out.println("</tr>");
                total += precios.get(i);
            }

            if (nombres.isEmpty()) {
                out.println("<tr><td colspan='2' class='text-center'>No hay productos en el carrito.</td></tr>");
            }
        %>
        </tbody>
    </table>

    <h3>Total a Pagar: $<%= total %></h3>

    <% if (!nombres.isEmpty()) { %>
    <form action="pago.jsp" method="post">
        <input type="hidden" name="total" value="<%= total %>">
        <button class="btn btn-success mt-4">Pagar</button>
    </form>
    <% } %>

    <a href="menu.jsp" class="btn btn-secondary">Volver al Menú</a>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>



