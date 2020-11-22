package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/httpLisnter")
public class MyHttpSessionAttributeListnerTest extends HttpServlet {
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
		HttpSession session = request.getSession();
		try {
			session.setAttribute("ClientName:", name);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		session.setAttribute("UserName: ", name);
		writer.println("Welcome User: " + name);
		session.removeAttribute("UserName: ");

	}

	@Override
	public void destroy() {
		System.out.println("Destryoed:  " + this.getClass().getName());
	}

}
