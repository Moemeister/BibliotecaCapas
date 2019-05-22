<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">

</head>
<body>

	<h1 style="margin: 20px;">Hay <c:out value="${x}"/> libros en existencia, de <c:out value="${y}"/> cantidad de autores diferentes</h1>
	<div class="col-md-8" >
	<button class="btn btn-primary" style="font-size:16px;" onclick="location.href='${pageContext.request.contextPath}/'" value="BACK"> BACK</button><br><br>
	<table style="font-size:16px;" class="table table-list-search">
		<tr><th>T&iacute;tulo</th>
			<th>Autor</th>
			<th>ISBN</th>
			<th>Cantidad</th>
			<th>G&eacute;nero</th>
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
	</div>
</body>
</html>