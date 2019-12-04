<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
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
	margin-left: auto;
	margin-right: auto;
	position: absolute;
}
th, td, tr {
	padding: 5px;
	text-align: left;
}
form label {
	min-width:120px;
	display: inline-block;

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
	<h1 style="text-align:center">Welcome!</h1>
	<hr>
	<h2>Please login!</h2>
	<form action="doLogin.jsp" method="post">
		<label>Name:</label><input type="text" name="name"><br> 
		<label>Password:</label><input type="password" name="password"><br> 
		<input type="submit" value="login">
	</form>
	<hr>
	<a href="employeeList.jsp">View Employees</a>
</body>
</html>