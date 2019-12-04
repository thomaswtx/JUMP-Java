<%@ page import="com.collabera.mongo.*, java.util.*"%>
<%
	String name = request.getParameter("name");
	String password = request.getParameter("password");

	// Check to see if the login and password exists
	AuthDao authDao = new AuthDao();

	if (authDao.authenticateLogin(name, password)) {

		session = request.getSession();
		session.setAttribute("name", name);

		out.print("You are sucessfully logged in!");
		out.print("<br>Welcome, " + name);
	} else {
		out.print("Sorry, the username or password is incorrect!");
		RequestDispatcher rd = request.getRequestDispatcher("doLogin.jsp");
		rd.forward(request, response);
	}
%>
