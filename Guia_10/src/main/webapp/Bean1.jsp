

<%
  String nom_cli = "Rafael";
  String ape_cli = "Torres";
  String dir_cli = "My_house";
%>

<jsp:useBean id="cli_bean" class="udb.edu.guiabeans.ClienteBeans"/>
<jsp:setProperty name="cli_bean" property="nomb_cli" value="<%=nom_cli%>"/>
<jsp:setProperty name="cli_bean" property="ape_cli" value="<%=ape_cli%>"/>
<jsp:setProperty name="cli_bean" property="dir_cli" value="<%=dir_cli%>"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>Bean1</title>
</head>
<body>
<div class="container">
    <div class="row">
        &nbsp;
    </div>
    <div class="panel panel-primary">
        <div class="panel-heading">Datos personales</div>
        <div class="panel-body">
            <%
                out.println("<h3>Nombre: " + cli_bean.getNomb_cli() + "</h3>");
                out.println("<h3>Apellido: " + cli_bean.getApe_cli() + "</h3>");
                out.println("<h3>Direcci&oacute;n: " + cli_bean.getDir_cli() + "</h3>");
            %>
        </div>
    </div>
</div>
</body>
</html>
