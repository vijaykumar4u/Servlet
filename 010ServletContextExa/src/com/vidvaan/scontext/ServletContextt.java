package com.vidvaan.scontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextt
 */
public class ServletContextt extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext servletContext = getServletContext();
		String un = servletContext.getInitParameter("user");
		String ps = servletContext.getInitParameter("pwd");
		out.println(un);
		out.print(ps);
		out.close();
	}

	

}
