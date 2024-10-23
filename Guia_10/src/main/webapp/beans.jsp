<%--
  Created by IntelliJ IDEA.
  User: Yugoa
  Date: 10/12/2024
  Time: 5:26 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="lenguajeBeans" scope="page" class="udb.edu.guiabeans.LenguajeBeans"/>
<jsp:setProperty name="lenguajeBeans" property="*"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Resultado de prueba del uso de beans</title>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <div class="row">
    &nbsp;
  </div>
  <div class="panel panel-primary">
    <div class="panel-heading">Resultado</div>
    <div class="panel-body">
      <p>Hola: <mark><jsp:getProperty name="lenguajeBeans"
                                      property="nombre"/></mark>.</p>
      <p>Tu lenguaje favorito es: <mark><jsp:getProperty name="lenguajeBeans"
                                                         property="lenguaje"/></mark></p>
      <p>Mis comentarios acerca del lenguaje son: </p>
      <p class="bg-info"><jsp:getProperty name="lenguajeBeans" property="comentarios"/>
      </p>
    </div>
  </div>
</div>
</body>
</html>
