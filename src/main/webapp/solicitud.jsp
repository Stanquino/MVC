<%--
  Created by IntelliJ IDEA.
  User: ESTUDIANTE
  Date: 7/6/2024
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CREDITO</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: rgba(255, 255, 255, 0.44);
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        header {
            background-color: rgb(241, 42, 76);
            color: #ffffff;
            padding: 20px;
            text-align: center;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
    </style>
</head>
<body>
<center>
    <h1>INGREO DE DATOS</h1>
    <hr>
    <form action="ServertControlador" method="post">

        <label for="nombre">INGRESE SU NOMBRE </label><br>
        <br>
        <input type="text" id="nombre" name="nombre"><br><br>

        <label for="apellido">INGRESE SU APELLIDO:</label><br>
        <br>
        <input type="text" id="apellido" name="apellido"/><br><br>
        <br>

        <label for="edad">INGRESE SU EDAD </label><br>
        <br>
        <input type="text" id="edad" name="edad"><br><br>

        <label for="genero">GENERO:</label><br>
        <br>
        <input type="text" id="genero" name="genero"/><br><br>
        <br>

        <label for="sueldo">INGRESE SU SUELDO</label><br>
        <br>
        <input type="text" id="sueldo" name="sueldo"><br><br>
        <hr>

        <input type="submit" value="ENVIAR SOLICITUD" >
    </form>
</center>


</body>
</html>
