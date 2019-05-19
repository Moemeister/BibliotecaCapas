<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script>
$("#target").val($("#target option:first").val());</script>
<script>
$(document).ready(function(){
	$('#target').change(function() {
    if ($(this).val() === 'Genero') {
        $("#g").replaceWith("<input type='text' name='genero' id='g'>");
        $("#a").replaceWith("<input type='hidden' name='author' id='a'>");
        $("#i").replaceWith("<input type='hidden' name='isbn' id='i'>");
    }else if($(this).val() === 'ISBN'){
        $("#i").replaceWith("<input type='text' name='isbn' id='i'>");
        $("#g").replaceWith("<input type='hidden' name='genero' id='g'>");
        $("#a").replaceWith("<input type='hidden' name='author' id='a'>");
    }else{
        $("#a").replaceWith("<input type='text' name='author' id='a'>");
        $("#g").replaceWith("<input type='hidden' name='genero' id='g'>");
        $("#i").replaceWith("<input type='hidden' name='isbn' id='i'>");
    }
});
  //$("option").click(function(){
    //$("p:first").replaceWith("<input type='text' name='author'>");
  //});
});
</script>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/buscarLibro" method="post">
	<p>Buscar por: </p>
	<select id="target" name="target">
		<option value="Autor">Autor</option>
		<option value="Genero">Genero</option>
		<option value="ISBN">ISBN</option>
	</select>
	<input type="text" name="author" id="a">
	<input type="hidden" name="genero" id="g">
	<input type="hidden" name="isbn" id="i">
	
	<input type="submit" value="Buscar Libros">
	</form:form>
	<form:form action="${pageContext.request.contextPath}/buscarTodos" method="post">
		<input type="submit" value="Ver Todos">
	</form:form>
</body>
</html>