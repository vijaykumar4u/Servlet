package com.vidvaan.Listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyservletContextListner implements ServletContextListener {

	public MyservletContextListner() {
	}

	public void contextDestroyed(ServletContextEvent contextEvent) {
		System.out.println("ServletContextListner Destroyed..");
		System.out.println("Context Destroy Method has been Called...." + this.getClass().getName());
		ServletContext servletContext = contextEvent.getServletContext();
		System.out.println(servletContext + " Is Destroyed....");

	}

	public void contextInitialized(ServletContextEvent contextEvent) {

		System.out.println("ServletContextListner Destroyed..");
		ServletContext servletContext = contextEvent.getServletContext();
		System.out.println(servletContext + " Is Intialized or Created....");
	}

}
