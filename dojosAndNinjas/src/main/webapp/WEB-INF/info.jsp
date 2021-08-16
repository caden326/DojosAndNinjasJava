<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>Dojos and Ninjas</title>
</head>
<body>

	<h1>info</h1>

	<div>
	
		<h3> Dojos </h3>
		<c:forEach items='${allDojos}' var= 'd'>
			<p>${d.name}, ${d.id}</p>
		</c:forEach>
	</div>


	<div>
	
		<h3> Ninjas </h3>
		
		<c:forEach items='${allNinjas}' var= 'n'>
			<p>${n.firstname}, ${n.age}, ${n.dojo.id}</p>
		</c:forEach>
		
	</div>
	
</body>
</html>