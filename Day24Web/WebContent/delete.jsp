<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.dao.*, com.collabera.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete User</title>
</head>
<style>
a:link, a:visited {
  background-color: #38B8FA;
  color: white;
  padding: 5px 5px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  border-radius: 25px;
}
a:hover, a:active {
  background-color: red;
}
a {
	font-size: 15px;
}
th, td, tr {
	padding: 5px;
	text-align: left;
}

tr:nth-child(even) {background-color: #A1E6F5;}

tr:hover {background-color: #F8D7D0;}

table {
	margin-left: auto;
	margin-right: auto;
}

div {
	margin-left: auto;
	margin-right: auto;
	text-align: center;
}
</style>
<body>

	<%
		int empId = Integer.parseInt(request.getParameter("id"));

		boolean flag = EmployeeDao.delete(empId);

		if (flag == true) {
			out.print("<h1>Employee with ID: " + empId + " -Deleted!</h1>");
		} else {
			out.print("<h1>Employee with ID: " + empId + " -NOT Deleted!</h1>");
		}
	%>

	<a href="index.html"> Back to Employee List!</a>

</body>
</html>