package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		Cookie cookie[] = request.getCookies();
		if (cookie != null) {
			String name = cookie[0].getValue();
			if (!name.equals("") || name != null) {
				out.println("<b>Welcome to Profile</b>");
				out.print("welcome" + name);
			} else {
				out.print("Please Login First");
				request.getRequestDispatcher("link.html").include(request, response);
			}
			out.close();
		}

	}

}
