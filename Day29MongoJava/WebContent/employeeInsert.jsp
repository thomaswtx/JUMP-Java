<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*, com.collabera.mongo.*, org.bson.types.ObjectId"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Insert</title>
</head>

<style>
form label {
	min-width: 120px;
	display: inline-block;
}
</style>
<body>
	<%
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String sAge = request.getParameter("age");

		if (firstName != null && lastName != null) {
			int age = Integer.parseInt(sAge);
			EmployeeMongoDao dao = new EmployeeMongoDao();
			dao.connectToMongo();

			Employee emp = new Employee(firstName, lastName, age);
			dao.insertEmployee(emp);
			out.print("Inserted: " + emp + "<hr>");
		}
	%>
	<h2>Insert Employee</h2>
	<hr>

	<form action="employeeInsert.jsp" method="post">
		<label>First Name</label> 
		<input type="text" name="firstName" value=""><br><br> 
		
		<label>Last Name</label> 
		<input type="text" name="lastName" value=""><br><br> 
		
		<label>Age</label> <input type="text" name="age" value=""><br><br>
		<hr>
		<input type="submit" name="Submit">
	</form>
</body>
</html>