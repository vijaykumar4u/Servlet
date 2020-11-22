package com.vidvaan.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonForwardController
 */
public class PersonForwardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PersonCls person = new PersonCls();
		Object setAtributeScope = request.getAttribute("personName");
		System.out.println(setAtributeScope);
		System.out.println(person.getName());

	}

}
