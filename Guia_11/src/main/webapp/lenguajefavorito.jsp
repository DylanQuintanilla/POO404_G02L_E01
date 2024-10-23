<%--
  Created by IntelliJ IDEA.
  User: Yugoa
  Date: 10/12/2024
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>Title</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <div class="container">
        <div class="row">
            &nbsp
        </div>
        <div class="panel panel-primary">
            <div class="panel-heading">
                Uso de javaBean
            </div>
            <div class="panel-body">
                <h1>P&aacute;gina de prueba del uso de beans</h1>
                <p>Se env&iacute;a el formulario al servicio cuyo fichero es <mark>beans.jsp</mark></p>

            </div>
        </div>
        <div class="row col-md-12">
            <form role="form" action="beans.jsp" method="post">
                <div class="col-md-10">
                    <div class="form-group">
                        <label for="nombre">Por favor, introduce tu nombre:</label>
                        <div class="input-group">
                            <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Ingresa tu nombre">
                            <span class="input-group-addon"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="lenguaje">¿Cuál es tu lenguaje de programación favorito? </label>
                        <div class="input-group">
                            <select name="lenguaje" id="lenguaje" class="form-control">
                                <option value="Java">Java
                                <option value="C++">C++
                                <option value="Perl">Perl
                            </select>
                            <span class="input-group-addon"></span>
                        </div>
                    </div>
                    <input type="submit" class="btn btn-info" value="Enviar">
                </div>
            </form>
        </div>
    </div>
</body>
</html>
