<%--
  Created by IntelliJ IDEA.
  User: Yugoa
  Date: 10/12/2024
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="cientifico" scope="request" class="udb.edu.guiabeans.PersonitaBeans">
  <jsp:setProperty name="cientifico" property="*"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp:useBean</title>
  <meta charset="UTF-8" >
  <meta http-equiv="x-ua-compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width,intial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
  <div class="container">
    <div class="row">
      &nbsp;
    </div>
    <div class="panel panel-primary">
      <div class="panel-heading">
        Uso de jsp:useBean coordinado con parámetros de la petición
      </div>
      <div class="panel-body">
        <p>El científico es: <mark><jsp:getProperty name="cientifico"
                                                    property="nombre"/></mark>. <br>
          Su edad es: <mark><jsp:getProperty name="cientifico" property="edad"/></mark>
          años</p>
        <p>A continuación usamos <code>getProperty</code>, sin que haya una propiedad
          de clase Bean para soportar los métodos <code>getTipo()</code> y
          <code>getEsJoven()</code>:</p>
        <ul>
          <li>Tipo: <mark><jsp:getProperty name="cientifico"
                                           property="tipo"/></mark></li>
          li>¿Joven?: <mark><jsp:getProperty name="cientifico"
                                             property="joven"/></mark></li>
        </ul>
      </div>
    </div>
  </div>
</body>
  </html>
