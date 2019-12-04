<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*, com.collabera.mongo.*, org.bson.types.ObjectId" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Update</title>
</head>

<style>
form label {
	min-width:120px;
	display: inline-block;

}
</style>
<body>
<%

String empId = request.getParameter("id");
String firstName = request.getParameter("firstName");
String lastName=request.getParameter("lastName");
String sAge = request.getParameter("age");

EmployeeMongoDao dao = new EmployeeMongoDao();
dao.connectToMongo();
Employee emp = null;

if(firstName != null && lastName != null) {
	int age = Integer.parseInt(sAge);

	emp = new Employee(new ObjectId(empId), firstName, lastName, age);
	dao.updateEmployee(emp);
	out.print("Updated: " + emp + "<hr>");
} else {
	// get Employee based on id
	emp = dao.findById(new ObjectId(empId));
}



%>
<h2>Update Employee</h2>
<hr>

<form action="employeeUpdate.jsp" method="post">

<input type="hidden" name="id" value="<%=emp.getId()%>">
<label>First Name</label>
<input type="text" name="firstName" value="<%=emp.getFirstName()%>"><br><br>

<label>Last Name</label>
<input type="text" name="lastName" value="<%=emp.getLastName()%>"><br><br>

<label>Age</label>
<input type="text" name="age" value="<%=emp.getAge()%>"><br><br>
<hr>
<input type="submit" name="Submit">

</form>
</body>
</html>