package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String uname = request.getParameter("name");
		String pwd = request.getParameter("password");
		if (pwd.equals("vijay123")) {
			out.print("your successfully logged in!");
			out.print("<br>Welcome" + uname);
			Cookie ck = new Cookie("name", uname);
			response.addCookie(ck);

		} else {
			out.print("sorry username or password is wrong");
			request.getRequestDispatcher("login.html").include(request, response);

		}
	}

}
