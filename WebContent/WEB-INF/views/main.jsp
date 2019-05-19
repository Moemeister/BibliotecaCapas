<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/buscarLibro" method="post">
	<p>Buscar por: </p>
	<select>
		<option>Autor</option>
		<option>ISBN</option>
		<option>Genero</option>
	</select>
	<input type="text" name="finder">
	<input type="submit" value="Buscar Libros">
	</form:form>
</body>
</html>