package com.vidvaan.FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firstservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String us = request.getParameter("uname");
		out.print("Welcome" + us);
		Cookie cook = new Cookie("user", us);
		response.addCookie(cook);
		out.print("<form action='./second'method ='post'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");
		out.close();
	}

}
