<%--
  Created by IntelliJ IDEA.
  User: ESTUDIANTE
  Date: 7/6/2024
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SUS DATOS SON</title>
</head>
<body>

NOMBRE: ${datos.getNombre}
<br>
APELLIDO : ${datos.apellido}
<br>
EDAD : ${datos.edad}
<br>
GENERO: ${datos.genero}
<br>
SUELDO : ${datos.sueldo}
<br>

<br>
<hr>
<a href="${pageContext.request.contextPath}/index.jsp">IR AL INICIO</a>
</body>
</html>
