<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"  %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
		String name = (String)request.getAttribute("name");
		String mobile = (String)request.getAttribute("mobile");
		
	%>
	<h1>My name is <%=name %></h1>
	<h1>My mobile no. is <%=mobile %></h1>
	
	<h1>using another method print .....${name}</h1>
	<h1>using JSTL method print .....<c:out value="${mobile}"></c:out></h1>
</body>
</html>