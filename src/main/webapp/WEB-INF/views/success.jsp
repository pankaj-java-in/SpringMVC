<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h1>Welcome, ${username}</h1>
	<h1>Your Email id is ${email}</h1>
	<h1>Your password is ${password}</h1>
	
	<h1>*******************************************************</h1>
	<h1 style="color: blue;">Message : ${msg}</h1>
	<h1>Using User Bean... Welcome, ${user.username}</h1>
	<h1>Using User Bean...Your Email id is ${user.email}</h1>
	<h1>Using User Bean...Your password is ${user.password}</h1>
</body>
</html>