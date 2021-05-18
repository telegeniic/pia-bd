<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="statics/Styles.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Rey Mago - Home</title>
</head>
<body>
<div class="text-center">

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

    <h1 class="cabecera">REY MAGO</h1>
    <h3>
        Seleccione una tabla
    </h3>
    <br/>
    <ul>
        <li><a class="boton bg-primary" href="AsistenController">Asisten</a></li>
        <li><a class="boton bg-primary" href="ConvencidosController">Convencidos</a></li>
        <li><a class="boton bg-primary" href="EventosController">Eventos</a></li>
        <li><a class="boton bg-primary" href="Grupo_VecinosController">Grupo de Vecinos</a></li>
        <li><a class="boton bg-primary" href="NinnosController">Niños</a></li>
        <li><a class="boton bg-primary" href="OrganizanController">Organizan</a></li>
        <li><a class="boton bg-primary" href="Rey_MagoController">Rey Mago</a></li>
        <li><a class="boton bg-primary" href="VecinosController">Vecinos</a></li>
    </ul>
</div>
</body>
</html>