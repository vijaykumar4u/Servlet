package com.vidvaan.serv001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
public class Myservlet implements Servlet {
	

	public Myservlet() {
		System.out.println("Servlet Object is created");
	}

	@Override
	public void destroy() {
		System.out.println("I am Destroyed");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Initi..");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/length");
		PrintWriter pw  = res.getWriter();
		pw.print("Hello Iam Servlet");
		System.out.println("Service method");
		
	}
	
}
