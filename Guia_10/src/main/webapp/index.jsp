<%@ page import="udb.edu.guiabeans.PersonaBeans" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>main</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" role="navigation">
    <div class="container">
        <a class="navbar-brand" href="#">Guia Bean</a>
        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar">
            &#9776;
        </button>
    </div>
</nav>
<br>
<br>
<br>
<div class="container">
    <h1 class="text-center">Gestion personas</h1>
    <div style="padding: 0;" >
        <form role="form" action="controller.jsp" method="POST">
            <div class="col-md-12">
                <div class="form-group">
                    <label for="nombre">Ingrese el nombre de la persona:</label>
                    <div class="input-group">
                        <input type="text" class="form-control" name="nombrePersona"
                               id="nombre"
                               placeholder="Ingresa el nombre" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="edad">Ingrese la edad de la persona:</label>
                    <div class="input-group">
                        <input type="number" class="form-control" id="edad"
                               name="edadPersona"
                               placeholder="Ingresa la edad" required>
                    </div>
                    <div class="form-group">
                        <label for="edad">Ingrese el telefono de la persona:</label>
                        <div class="input-group">
                            <input type="tel" class="form-control" id="telefono"
                                   name="telefonoPersona"
                                   placeholder="Ingresa el telefono" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="sexo">Ingrese el sexo de la persona:</label>
                        <div class="input-group">
                            <select name="sexoPersona" id="sexo" class="form-control" required>
                                <option value="Masculino">Maculino</option>
                                <option value="Femenino">Femenino</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="ocupacion">Ingrese la ocupacion de la persona:</label>
                        <div class="input-group">
                            <select name="idOcupacion" id="ocupacion" class="form-control" required>
                                <option value="1">Doctor</option>
                                <option value="2">Emprendedor</option>
                                <option value="3">profesor</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="fecha">Ingrese la fecha de nacimiento de la persona:</label>
                        <div class="input-group">
                            <input type="date" class="form-control" id="fecha" name="fechaNac"
                                   placeholder="Ingresa la fecha" required>
                        </div>
                    </div>
                    <div style="margin-left: 30%;">
                        <input type="submit" class="btn btn-success col-md-6 ">
                    </div>
                </div>
            </div>
        </form>
    <br>
    <div>
        <div class="">
            <table class="table table-striped table-hover table-dark">
                <thead class="table-dark table-striped">
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Edad</th>
                    <th>Telefono</th>
                    <th>Sexo</th>
                    <th>Ocupacion</th>
                    <th>Fecha nacimiento</th>
                </tr>
                </thead>
                <tbody>
                    <% for (PersonaBeans persona: personalist.getListaPersonas() ) {%>
                <tr>
                    <td><%= persona.getIdPersona() %></td>
                    <td><%= persona.getNombrePersona() %></td>
                    <td><%= persona.getEdadPersona() %></td>
                    <td><%= persona.getTelefonoPersona() %></td>
                    <td><%= persona.getSexoPersona() %></td>
                    <td><%= persona.getOcupacion().getOcupacion() %></td>
                    <td><%= persona.getFechaNac() %></td>
                </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </div>
    </div>
</div>
<footer id="sticky-footer" class="flex-shrink-0 py-4 bg-dark text-white-50">
    <div class="container text-center ">
        <small style="color: white;">Copyright &copy; BEAN</small>
    </div>
</footer>
<script>
</script>

<div>
<a href="Bean1.jsp">a</a>
<a href="lenguajefavorito.jsp">ee</a>
<a href="EnviarPersona.jsp">uuu</a>
</div>
</body>
</html>