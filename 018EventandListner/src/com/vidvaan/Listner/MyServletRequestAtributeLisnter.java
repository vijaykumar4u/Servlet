package com.vidvaan.Listner;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestAtributeLisnter implements ServletRequestAttributeListener {

	public MyServletRequestAtributeLisnter() {
		// TODO Auto-generated constructor stub
	}

	public void attributeRemoved(ServletRequestAttributeEvent sEvent) {
		System.out.println("removed attribute Name: " + this.getClass().getName());
		System.out.println(sEvent.getName());
		System.out.println(sEvent.getValue());

	}

	public void attributeAdded(ServletRequestAttributeEvent sAttributeEvent) {
		System.out.println("\n");
		System.out.println("Added attribute Name: " + this.getClass().getName());
		System.out.println("\n");
		System.out.println(sAttributeEvent.getName());
		System.out.println(sAttributeEvent.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent replaceEvent) {
		
		System.out.println("\n");
		System.out.println("Replace attribute Name: " + this.getClass().getName());
		System.out.println("\n");
		System.out.println(replaceEvent.getName());
		System.out.println(replaceEvent.getValue());
	}

}
