<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<title>New Dojo</title>
</head>
<body>
	
	<h1>New Dojo</h1>
	
	<form:form action="/dojo/create" method="post" modelAttribute="dojo">
			    <p>
			        <form:label path="name">Name:</form:label>
			        <form:errors path="name"/>
			        <form:input path="name"/>
			    </p>
			     <input class="btn btn-dark" type="submit" value="Submit"/>
	</form:form> 
		
</body>
</html>