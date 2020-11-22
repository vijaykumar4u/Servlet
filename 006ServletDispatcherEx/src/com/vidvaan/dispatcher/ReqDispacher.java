package com.vidvaan.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReqDispacher
 */
public class ReqDispacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pWriter = response.getWriter();
		String userName = request.getParameter("uname");
		String pWord=request.getParameter("password");
		
		if(pWord.equals("vijay")) {
			RequestDispatcher rdispatch = request.getRequestDispatcher("welcome");
			rdispatch.forward(request, response);
		}else {
			pWriter.print("Sorry Username or Password is wrong !");
			RequestDispatcher rdispatch = request.getRequestDispatcher("/index.html");
			rdispatch.include(request, response);
		}
		
		
	}

}
