<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.collabera.dao.*, com.collabera.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>

	<%
		int id = Integer.parseInt(request.getParameter("id"));
		Employee emp = EmployeeDao.getEmployee(id);		 
	%>

	<h1>Update Employee</h1>
	<form action="doUpdate.jsp" method="POST">
		<label>ID:</label> 
		<input type="text" name="id" readonly value="<%=emp.getId()%>"><br> 
		
		<label>First Name:</label>
		<input type="text" name="firstName" value="<%=emp.getFirstName()%>"><br>
		
		<label>Last Name:</label> 
		<input type="text" name="lastName" value="<%=emp.getLastName()%>"><br> 
		
		<input type="submit" value="Submit">
	</form>
	
</body>
</html>