<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<style>

form>label {
	display: inline-block;
	width: 100px;
}
</style>
<body>
	<h2>Please login!</h2>
	<form action="doLogin.jsp" method="post">
		<label>Name:</label><input type="text" name="name"><br> 
		<label>Password:</label><input type="password" name="password"><br> 
		<input type="submit" value="login">
	</form>
</body>
</html>