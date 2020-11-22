package com.vidvaan.sconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfiguration
 */
public class ServletConfiguration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig scon = getServletConfig();
	String driver = 	scon.getInitParameter("driver");
	String us = scon.getInitParameter("user");
	out.print("Driver is "+driver);
	out.print("User is "+us);
	out.close();
		
		
	}

}
