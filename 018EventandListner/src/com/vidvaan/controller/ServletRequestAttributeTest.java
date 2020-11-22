package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reqEvent")
public class ServletRequestAttributeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("Init Method Invoked..." + this.getClass().getName());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String name = request.getParameter("name");
		try {
			request.setAttribute("ClientName:", name);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		request.setAttribute("UserName: ", name);
		writer.println("Welcome User: " + name);
		request.removeAttribute("UserName: ");
	}

	@Override
	public void destroy() {
		System.out.println("Destryoed:  " + this.getClass().getName());
	}

}
