<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.collabera.mongo.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
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
</head>
<body>
<%



EmployeeMongoDao dao = new EmployeeMongoDao();
dao.connectToMongo();
List<Employee> list=dao.listAllEmployees();

%>
<h1>Employee List</h1>
<div class="container">

<table border="0" style="width:400px;">
<tr>
<td></td>
<td><a href="employeeInsert.jsp?">Add Employee</a></td>
</tr>
</table>
<table class="emp-table" border="1">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
<th>Action</th>
</tr>

<%for(Employee e:list){ %>
<tr>
<td><%=e.getId()%></td>
<td><%=e.getFirstName()%></td>
<td><%=e.getLastName()%></td>
<td><%=e.getAge()%></td>
<td>
<a href="employeeUpdate.jsp?id=<%=e.getId() %>">Update</a>
<a href="employeeDelete.jsp?id=<%=e.getId() %>">Delete</a>
</td>
</tr>
<%}%>
</table>

</div>
</body>
</html>