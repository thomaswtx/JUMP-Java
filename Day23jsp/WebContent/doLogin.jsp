<%@include file="link.html" %>
<%
	//request.getRequestDispatcher("link.html").include(request, response);

	String name = request.getParameter("name");
	String password = request.getParameter("password");

	if (password.equals("admin123")) {
		out.print("You are sucessfully logged in!");
		out.print("<br>Welcome, " + name);

		session = request.getSession();
		session.setAttribute("name", name);

	} else {
		out.print("Sorry, the username or password is incorrect!");
		RequestDispatcher rd = request.getRequestDispatcher("doLogin.jsp");
		rd.forward(request, response);
		//request.getRequestDispatcher("login.html").include(request, response);
	}
%>
