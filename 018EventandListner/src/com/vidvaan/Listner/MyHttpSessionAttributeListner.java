package com.vidvaan.Listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class MyHttpSessionAttributeListner implements HttpSessionAttributeListener {

	public MyHttpSessionAttributeListner() {

	}

	public void attributeAdded(HttpSessionBindingEvent httpBindEvent) {
		System.out.println("\n");
		System.out.println("Added Method called " + this.getClass().getName());
		System.out.println("\n");
		System.out.println(
				"Newly Added attribute Name: " + httpBindEvent.getName() + " value:" + httpBindEvent.getValue());
	}

	public void attributeRemoved(HttpSessionBindingEvent httpBindEvent) {
		System.out.println("\n");
		System.out.println("Removed Method called " + this.getClass().getName());
		System.out.println("\n");
		System.out.println("Removed attribute Name: " + httpBindEvent.getName() + " value:" + httpBindEvent.getValue());
	}

	public void attributeReplaced(HttpSessionBindingEvent httpBindEvent) {
		System.out.println("\n");
		System.out.println("Replaced Method called " + this.getClass().getName());
		System.out.println("\n");
		System.out
				.println("Replaced attribute Name: " + httpBindEvent.getName() + " value:" + httpBindEvent.getValue());
	}

}
