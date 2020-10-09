<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="static" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BeingIAS</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href='<static:url value="/resources/css/style.css"/>'
	rel="stylesheet" />
</head>
<body>
	<h1 class="jumbotron">Congratulations!</h1>
	<div class="form-group">
		<form:form action="startPage" modelAttribute="objUser">
			<input type="submit" value="Login" class="btn btn-lg btn-primary btn-block">
		</form:form>
	</div>

</body>
</html>