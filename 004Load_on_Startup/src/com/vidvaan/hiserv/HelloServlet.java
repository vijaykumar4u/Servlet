package com.vidvaan.hiserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
      System.out.println("Hello setvlet object id created");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("Hello servlet is initialized");
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pWriter = response.getWriter();
		pWriter.println("Hello ....");
		System.out.println("Hello servlet service is executed");
		pWriter.close();
		
		
	}

	

}
