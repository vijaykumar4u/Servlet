package com.vidvaan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static  Organisation getObjectData(Organisation org) {
		org.setOrganisation_name("vidvaan");
		org.setDescription("A pure java training center");
		org.setEmployees(3);
		return org;
	}
	public static void main(String[] args) {
		Organisation org = new Organisation();
		org=getObjectData(org);
		 // Creating Object of ObjectMapper define in Jakson Api 
		ObjectMapper obj = new ObjectMapper();
		// get Oraganisation object as a json string 
		try {
			String jsonString = obj.writeValueAsString(org);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
