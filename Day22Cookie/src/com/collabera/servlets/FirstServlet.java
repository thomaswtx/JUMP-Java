package com.collabera.servlets;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FirstServlet", urlPatterns="/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("userName");
			out.print("Welcome " + n);
			
			// appending the username in the query string
			out.print("<a href='servlet2?uname=" + n +"'>visit</a>");

			// Creating form that have invisible textfield
//			out.print("<form action ='servlet2'>");
//			out.print("<input type='hidden' name='uname' value='" + n + "'>");
//			out.print("<input type='submit' value='go'>");
//			out.print("</form>");
			out.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
