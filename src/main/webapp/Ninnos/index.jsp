<%--
  Created by IntelliJ IDEA.
  User: jesus
  Date: 5/17/2021
  Time: 2:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="../statics/Styles.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Rey Mago - Niños</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/OMS"> Rey Mago </a>
        <a href="/OMS" class="nav-link activate"> Home </a>
        <a href="AsistenController" class="nav-link">Asisten</a>
        <a href="ConvencidosController" class="nav-link">Convencidos</a>
        <a href="EventosController" class="nav-link">Eventos</a>
        <a href="Grupo_VecinosController" class="nav-link">Grupo de Vecinos</a>
        <a href="NinnosController" class="nav-link">Niños</a>
        <a href="OrganizanController" class="nav-link">Organizan</a>
        <a href="Rey_MagoController" class="nav-link">Rey Mago</a>
        <a href="VecinosController" class="nav-link">Vecinos</a>
    </div>
</nav>

<h1 class="text-center font-weight-bold">Niños</h1>

<table class="table table-striped table-hover text-center">
    <thead>
    <tr>
        <th>Clave</th>
        <th>Regalo</th>
        <th>Colonia</th>
        <th>Calle</th>
        <th>Numero</th>
        <th>Apellido Paterno</th>
        <th>Apellido Materno</th>
        <th>Nombres</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="ninno" items="${lista}">
            <tr>
                <td>
                    <c:out value="${ninno.getClave_ninno()}"></c:out>
                </td>
                <td>
                    <c:out value="${ninno.getRegalo_Ninnos()}"></c:out>
                </td>
                <td>
                    <c:out value="${ninno.getColonia_Ninnos()}"></c:out>
                </td>
                <td>
                    <c:out value="${ninno.getCalle_Ninnos()}"></c:out>
                </td>
                <td>
                    <c:out value="${ninno.getNumero_Residencia()}"></c:out>
                </td>
                <td>
                    <c:out value="${ninno.getApellido_Paterno_Ninnos()}"></c:out>
                </td>
                <td>
                    <c:out value="${ninno.getApellido_Materno_Ninnos()}"></c:out>
                </td>
                <td>
                    <c:out value="${ninno.getNombres_Ninnos()}"></c:out>
                </td>
                <td class="table-danger">
                    <a href="">Eliminar</a>
                </td>
                <td class="table-warning">
                    <a href="">Modificar</a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td class="table-primary text-center" colspan="10">
                <a class="" href="AsistenController?action=nuevo">Nuevo Registro</a>
            </td>
        </tr>
    </tbody>
</table>
</body>
</html>
