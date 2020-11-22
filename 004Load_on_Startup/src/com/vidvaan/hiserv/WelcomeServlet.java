package com.vidvaan.hiserv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	   
	    public WelcomeServlet() {
	      System.out.println("WelcomeServlet setvlet object id created");
	    }
	    @Override
	    public void init() throws ServletException {
	    	System.out.println("WelcomeServlet servlet is initialized");
	    }
	    

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter pWriter = response.getWriter();
			pWriter.println("WelcomeServlet ....");
			System.out.println("WelcomeServlet servlet service is executed");
			pWriter.close();
			
		
			
		}
}
