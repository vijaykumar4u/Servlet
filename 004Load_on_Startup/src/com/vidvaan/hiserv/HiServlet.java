package com.vidvaan.hiserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiServlet
 */
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiServlet() {
      System.out.println("Hi setvlet object id created");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("Hi servlet is initialized");
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pWriter = response.getWriter();
		pWriter.println("Hi ....");
		System.out.println("Hi servlet service is executed");
		pWriter.close();
		
		
	}

	

}
