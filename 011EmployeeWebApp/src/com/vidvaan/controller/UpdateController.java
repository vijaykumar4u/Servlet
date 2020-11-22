package com.vidvaan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.model.EmployDetails;
import com.vidvaan.service.EmpSericeProvider;

/**
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		int eId = Integer.parseInt(request.getParameter("eid"));
		String eNmae = request.getParameter("ename");
		String gender = request.getParameter("egender");
		double eSal = Double.parseDouble(request.getParameter("esal"));
		String eDepart = request.getParameter("edptmnt");
		EmpSericeProvider updaateService = new EmpSericeProvider();
		EmployDetails emup = new EmployDetails();
		emup.setId(eId);
		emup.setName(eNmae);
		emup.setGender(gender);
		emup.setSalary(eSal);
		emup.setDepartment(eDepart);
		updaateService.empUpdate(emup);
		
	}
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int eId = Integer.parseInt(req.getParameter("eid"));
		EmpSericeProvider updaateService = new EmpSericeProvider();
	
	 EmployDetails empl=updaateService.findById(eId);
	 req.setAttribute("empUpdatecon", empl);
	 req.getRequestDispatcher("update.jsp").forward(req, resp);
	 
		}

}
