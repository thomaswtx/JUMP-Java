<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List, java.util.ArrayList, 
	com.collabera.dao.*, com.collabera.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		String val5 = "";
		String val10 = "";
		String val20 = "";
		String val30 = "";
		
		String spageNo = request.getParameter("pageNo");
		String spageSize = request.getParameter("pageSize");
		int pageNo = Integer.parseInt(spageNo);
		int pageSize = Integer.parseInt(spageSize);

		List<Employee> list = EmployeeDao.getList(pageNo, pageSize);
		int nrPages = (int) Math.ceil(EmployeeDao.getTotalRecords() / (double) pageSize);
		
		switch(pageSize) {
		case 5:
			val5 = "selected";
			break;
		case 10:
			val10 = "selected";
			break;
		case 20:
			val20 = "selected";
			break;
		case 30:
			val30 = "selected";
			break;
		}
	%>
	<div>
	<h3 style="text-align: center">Employee Management System</h3>

<table>
<tr>
	<td>
	Page No: <%=pageNo%> 
	</td>
	<td>
	<form action="view.jsp">
	Page Size:
	<select name="pageSize" onchange="this.form.submit()">
		<option value ="5" <%=val5%>>5</option>
		<option value="10" <%=val10%>>10</option>
		<option value="20" <%=val20%>>20</option>
		<option value="30" <%=val30%>>30</option>
	</select>
	
	<input type="hidden" value="<%=pageNo%>" name="pageNo">
	</form>
	</td>
	<td>
	<a href=insert.jsp>Add Employee</a>
	</td>
</tr>
</table>
	</div>
	<table class="emp-table" border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Action</th>
		</tr>
		<%
			for (Employee e : list) {
		%>
		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getFirstName()%></td>
			<td><%=e.getLastName()%></td>
			<td><a href='delete.jsp?id=<%=e.getId()%>'>Delete</a>&nbsp; <a
				href='update.jsp?id=<%=e.getId()%>'>Update</a></td>
		</tr>
		<%
			}
		%>
	</table>

	<div class="pagination">
	<span>Pages: </span>
	<%
		String cssActive = "";
		for (int i = 1; i <= nrPages; i++) {
			if (i == pageNo) {
				cssActive = "active";
			} else {
				cssActive = "";
			}
	%>
	<a class="page-link <%=cssActive%>" href="view.jsp?pageNo=<%=i%>&pageSize=<%=pageSize%>">
		<%=i%></a>
	<%
		}
	%>
	</div>

	</div>
	</div>
</body>
</html>