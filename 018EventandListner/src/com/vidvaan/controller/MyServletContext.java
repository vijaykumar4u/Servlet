package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class MyServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init Method Invoked.......");
		System.out.println(this.getClass().getName());

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		ServletContext context = request.getServletContext();
		context.setAttribute("ContextAttribute", name);
		context.removeAttribute("ContextAttribute");
		writer.println("Welcome User: " + name);
		writer.close();

	}

	public void destroy() {
		System.out.println("Destroyed Method Called.......");
		System.out.println(this.getClass().getName());
	}

}
