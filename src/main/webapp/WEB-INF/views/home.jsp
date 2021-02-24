<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page....</h1>
	
	 <%
		String name =(String)request.getAttribute("myName");
	 	Integer id = (Integer)request.getAttribute("id");
	 	List<String> friends = (List<String>)request.getAttribute("friends");
	%>
	<h2>My Id is : <%=id %></h2>
	<h2>
	My name is : <%=name %>
	</h2>
	
	<h2>
	My friends are :-
	<%
		for(String s: friends){
	%>
	<h3>
		<%=s %>
	</h3>		
	<%		
		}
	%>
	
	</h2>
	
</body>
</html>