<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="static" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BeingIAS</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href='<static:url value="/resources/css/style.css"/>' rel="stylesheet"/>
</head>
<body>
<h1 class="jumbotron">Registration PAGE</h1>
<div class="row">
	<div class="col-sm-4"></div>
	<div class="col-sm-4">
	<form:form action="processRegistration" modelAttribute="obj">
		<div class="form-group">
			<form:input class="form-control" path="userEmail" placeholder="Email ID"/>
		</div>
		<div class="form-group">
			<form:input class="form-control" path="userName" placeholder="User Name" />
		</div>
		<div class="form-group">
			<input class="form-control" type="password" name="userPass" placeholder="Password" />
		</div>
		<div class="form-group">
			<input class="form-control" type="password" name="userRepass" placeholder="Re-type Password" />
		</div>
		<div class="form-group">
			<form:input class="form-control" path="userPhoneNumber" placeholder="Phone Number"/>
		</div>
		<div class="form-group">
			<form:select class="form-control" path="userState">
				<form:option value="none" label="Select"/>
				<form:options items="${states}"/>
			</form:select>
		</div>
		<input class="btn btn-danger form-control" type="submit" value="Register">
	</form:form>
</div>
</div>
<h4>${msg}</h4>
<h4>${check}</h4>
	

	
</body>
</html>