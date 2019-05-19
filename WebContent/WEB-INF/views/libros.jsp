<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hay <c:out value="${x}"/> libros en existencia, de <c:out value="${y}"/> cantidad de autores diferentes</h1>
	<table>
		<tr><th>Titulo</th>
			<th>Autor</th>
			<th>ISBN</th>
			<th>Cantidad</th>
			<th>Genero</th>
		</tr>
		<c:forEach items="${libros}" var="libros">
			<tr>
					<td>${libros.titulo}</td>
					<td>${libros.autor}</td>
					<td>${libros.isbn}</td>
					<td>${libros.stock}</td>
					<td>${libros.genero}</td>
					
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>