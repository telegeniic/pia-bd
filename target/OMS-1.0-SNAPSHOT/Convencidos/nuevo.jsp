<%--
  Created by IntelliJ IDEA.
  User: jesus
  Date: 5/17/2021
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OMS</title>
</head>
<body>
    <h2>Nuevo Registro</h2>
    <form action="NinnosController?action=insert" method="post" autocomplete="off">
        <p>
        Clave:
            <input id="clave" name="clave" type="text">
        </p>
        <p>
            Regaloo:
            <input id="regalo" name="regalo" type="text">
        </p>
        <p>
            Colonia:
            <input id="colonia" name="colonia" type="text">
        </p>
        <p>
            Calle:
            <input id="calle" name="calle" type="text">
        </p>
        <p>
            Numero:
            <input id="numero" name="numero" type="text">
        </p>
        <p>
            Apellido Paterno:
            <input id="apellido_paterno" name="apellido_paterno" type="text">
        </p>
        <p>
            Apellido Materno:
            <input id="apellido_materno" name="apellido_materno" type="text">
        </p>
        <p>
            Nombres:
            <input id="nombres" name="nombres" type="text">
        </p>
        <button id="guardar" name="guardar" type="submit">Guardar</button>
    </form>

</body>
</html>
