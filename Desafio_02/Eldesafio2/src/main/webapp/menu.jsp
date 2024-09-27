<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    boolean isEmpleado = email != null && email.equals("empleado@gmail.com") && password != null && password.equals("Empleado12");

    if (isEmpleado) {
        response.sendRedirect("pedidos.jsp");
        return;
    }
%>
<html>
<head>
    <title>Menú de Platos</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .card img {
            height: 200px;
            object-fit: cover;
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center">Menú de Platos</h1>
    <div class="row">
        <div class="col-md-4">
            <div class="card">
                <img src="img/hamburguesa.png" class="card-img-top" alt="Plato 1">
                <div class="card-body">
                    <h5 class="card-title">Hamburguesa</h5>
                    <p class="card-text">Precio: $10.00</p>
                    <form action="carrito.jsp" method="post">
                        <input type="hidden" name="nombre" value="Hamburguesa">
                        <input type="hidden" name="precio" value="10.00">
                        <button class="btn btn-primary">Seleccionar</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card">
                <img src="img/pizza.jpeg" class="card-img-top" alt="Plato 2">
                <div class="card-body">
                    <h5 class="card-title">Pizza con jamón y pepperoni</h5>
                    <p class="card-text">Precio: $15.00</p>
                    <form action="carrito.jsp" method="post">
                        <input type="hidden" name="nombre" value="Pizza con jamón y pepperoni">
                        <input type="hidden" name="precio" value="15.00">
                        <button class="btn btn-primary">Seleccionar</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="card">
                <img src="img/pollo.jpeg" class="card-img-top" alt="Plato 3">
                <div class="card-body">
                    <h5 class="card-title">Pollo frito con papas</h5>
                    <p class="card-text">Precio: $5.00</p>
                    <form action="carrito.jsp" method="post">
                        <input type="hidden" name="nombre" value="Pollo frito con papas">
                        <input type="hidden" name="precio" value="5.00">
                        <button class="btn btn-primary">Seleccionar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <a href="carrito.jsp" class="btn btn-secondary mt-4">Ver Carrito</a>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>


