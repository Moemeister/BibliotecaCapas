<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<!DOCTYPE html>
<html>
<head>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

</head>
<body>
<div class="form" style="margin: 0 auto;">
	<form:form  action="${pageContext.request.contextPath}/buscarLibro" method="post">
	<p class="font-weight-bold">Buscar por: </p>
	<select class="custom-select custom-select-lg mb-3" name="target">
		<option value="Autor">Autor</option>
		<option value="Genero">G&eacute;nero</option>
		<option value="ISBN">ISBN</option>
	</select>
	<input class="form-control" type="text" name="finder" placeholder="Ingrese su b&uacute;squeda">	<br>
	<input class="btn btn-primary" type="submit" value="Buscar Libros"><br><br>
	</form:form>
	<form:form action="${pageContext.request.contextPath}/buscarTodos" method="post">
		<input class="btn btn-primary" type="submit" value="Ver Todos"><br>
	</form:form>
</div>
</body>
</html>