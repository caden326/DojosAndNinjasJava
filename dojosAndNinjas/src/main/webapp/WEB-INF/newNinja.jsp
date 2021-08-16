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

	<div class="m-3">
			<form:form action="/ninja/create" method="post" modelAttribute="ninja">
			    <p>
			        <form:label path="firstname">First Name</form:label>
			        <form:errors path="firstname"/>
			        <form:input path="firstname"/>
			    </p>
			    <p>
			        <form:label path="lastname">Last Name</form:label>
			        <form:errors path="lastname"/>
			        <form:input path="lastname"/>
			    </p>
			    <p>
			        <form:label path="age">Age</form:label>
			        <form:errors path="age"/>
			        <form:input path="age"/>
			    </p>
			    
			    <p>
			    <form:label path="dojo">Dojo</form:label>
				<form:errors path="dojo" class ="text-danger"/>
				<form:select path="dojo" class="form-select">
					<c:forEach items='${ allDojos }' var='dojo'>
						<option value="${dojo.id}">${dojo.name}</option>
					</c:forEach>
					
				</form:select>
			    </p>
			   
			    <input class="btn btn-dark" type="submit" value="Submit"/>
			</form:form> 
		</div>

</body>
</html>