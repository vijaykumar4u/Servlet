package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.model.EmployDetails;
import com.vidvaan.service.EmpSericeProvider;


public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int eid = Integer.parseInt(request.getParameter("id"));
		EmpSericeProvider deleteService = new EmpSericeProvider();
			deleteService.empDelete(eid);
			response.sendRedirect("./getAll");
	
	
		
		
	}
	

}