package com.vidvaan.serv001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletExample extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/length");
		PrintWriter pw  = res.getWriter();
		pw.print("<html><body style = \"color:red\">");
		pw.print("<b>Hello Iam Servlet</b>");
		pw.print("</body></html>");
		
		
		
	}

}
