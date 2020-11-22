package com.vidvaan.serv001;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;

public class HtttpServletExample extends HttpServlet {

	protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws javax.servlet.ServletException, java.io.IOException {
		
		resp.setContentType("text/length");
		PrintWriter pw  = resp.getWriter();
		pw.print("<html><body style = \"color:red\">");
		pw.print("<b>Hello Iam HTTP Servlet</b>");
		pw.print("</body></html>");
		

	};

}
