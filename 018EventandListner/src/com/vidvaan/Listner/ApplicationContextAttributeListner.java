package com.vidvaan.Listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ApplicationContextAttributeListner implements ServletContextAttributeListener {

	public ApplicationContextAttributeListner() {

	
	}
	public void attributeAdded(ServletContextAttributeEvent ContextAttributeEvent) {
		System.out.println("ServletContextAttributeEvent added: " + this.getClass().getName());
		System.out.println("Newly Added ServletContextAttributeEvent: " + ContextAttributeEvent.getName());
		System.out.println("Newly Added ServletContextAttributeEvent value: " + ContextAttributeEvent.getValue());
	}

	public void attributeRemoved(ServletContextAttributeEvent ContextAttributeEvent) {
		System.out.println("ServletContextAttributeEvent removed: " + this.getClass().getName());
		System.out.println("Removed ServletContextAttributeEvent: " + ContextAttributeEvent.getName());
		System.out.println("Removed ServletContextAttributeEvent value: " + ContextAttributeEvent.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent ContextAttributeEvent) {
		System.out.println("ServletContextAttributeEvent Replaced: " + this.getClass().getName());
		System.out.println("Replaced ServletContextAttributeEvent: " + ContextAttributeEvent.getName());
		System.out.println("Replaced ServletContextAttributeEvent value: " + ContextAttributeEvent.getValue());
	}

}


