package com.vidvaan.send_redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sendredirect
 */
public class Sendredirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =  response.getWriter();
		String un = request.getParameter("uname");
		String up = request.getParameter("pass");
		if(un.equals("vijay") && up.equals("vijay")) {
			response.sendRedirect("welcome.html");
			
			
		}else {
			out.print("<span style='color:red'Sorry uname or pass is wrong</span>");
			RequestDispatcher rd  = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
	}

}
