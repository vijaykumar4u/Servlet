package com.vidvaan.loginform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String Uname = request.getParameter("uname");
		String Pwd = request.getParameter("pwd");
		if(Uname.equals("vijay") && Pwd.equals("123vijay")) {
			out.print("Welcome User Your are Successfully logged in!...");
			out.print("<a href='login.html'>Logout</a>");
			
		}else {
			response.sendRedirect("login.html");
			
		}
		
		
	}

}
