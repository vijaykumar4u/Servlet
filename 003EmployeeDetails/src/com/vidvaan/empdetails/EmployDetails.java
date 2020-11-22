package com.vidvaan.empdetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployDetails extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter pwriter = resp.getWriter();
		String eID = req.getParameter("empid");
		String eName = req.getParameter("ename");
		String eSalary = req.getParameter("esal");

		pwriter.print("<html><body>");
		pwriter.print("<h3>Employee Details</h3><hr>");
		pwriter.print("<b>Employee ID" + eID + "<br>");
		pwriter.print("<b>Employee Name" + eName + "<br>");
		pwriter.print("<b>Employee Salary" + eSalary + "<br>");
		pwriter.print("</body></html>");

	}

}
