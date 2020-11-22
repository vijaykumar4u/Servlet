package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.vidvaan.model.EmployDetails;
import com.vidvaan.service.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmpSericeProvider eService  = new EmpSericeProvider();
		List<EmployDetails> employees = eService.getDetails();
		request.setAttribute("emp", employees);
		request.getRequestDispatcher("findAll.jsp").forward(request, response);
		
		
		
		
		
		
	}
	

	
}
