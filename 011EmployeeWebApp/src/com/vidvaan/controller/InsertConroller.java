package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.model.EmployDetails;
import com.vidvaan.service.EmpSericeProvider;


public class InsertConroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int Eid=Integer.parseInt(request.getParameter("eid"));
		String Ename=request.getParameter("ename");
		String Esex=request.getParameter("esex");
		double Esal= Double.parseDouble(request.getParameter("esal"));
		String Edept=request.getParameter("edptmnt");
		EmployDetails ed = new EmployDetails(Eid, Ename, Esex, Esal, Edept);
		EmpSericeProvider empService = new EmpSericeProvider();
		empService.insertEmp(ed);
		out.print("Record inserted Successfully!");
		out.print("<a href='home.jsp'>home</a>");
		out.close();
		
		
		
		
	
	}

}
