<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.collabera.jsp.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declaration Tag</title>
</head>
<body>
	<h2>Declaration Tag Demo:</h2>
	<%! int data = 50; %>
	
	<%!
	int cube (int n) {
		return n*n*n;
	}
	%>
	
	<%= "The value of the variables is: " + data %>
	<%= "<hr>The cube of 3 is: " + cube(3) %>
	
	<%
	Square math = new Square();
	out.print("<hr>The square of 7 is: " + math.squareNum(7)); 
	%>
</body>
</html>