<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		// demo Request Parameter
		String name = request.getParameter("uname");
		out.print("Welcome " + name);
		out.print("<br>HTTP Method : " + request.getMethod());
	%>

	<%
		// demo Init Parameter
		out.print("<hr>Welcome " + request.getParameter("uname"));
		String param = config.getInitParameter("dname");
		out.print("<hr>Init Paramenter is: " + param);
	%>

</body>
</html>