<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*, com.collabera.mongo.*, org.bson.types.ObjectId"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Delete</title>
</head>
<body>
	Employee Delete
	<hr>
	<%
		String empId = request.getParameter("id");

		EmployeeMongoDao dao = new EmployeeMongoDao();
		dao.connectToMongo();

		new EmployeeMongoDao().deleteEmployee(new ObjectId(empId));

		out.print("<h1>Employee - deleted!");
	%>

	<hr>
	<a href="employeeList.jsp">Back to Employee List!</a>
	</hr>
</body>
</html>