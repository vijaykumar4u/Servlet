package com.vidvaan.lcycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLifeCycle() {
		System.out.println("Servlet Object created");
	}

	public void init(ServletConfig config) {
		System.out.println("Servlet is Initilized !");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("Servlet service is executed...  ");
		System.out.println("Servlet service is executed...  ");
		pw.close();
	}

	public void destroy() {
		System.out.println("Servlet is distroed !");
	}

}
