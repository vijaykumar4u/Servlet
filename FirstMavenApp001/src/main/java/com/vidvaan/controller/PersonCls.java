package com.vidvaan.controller;

public class PersonCls {
	private String name;

	public PersonCls() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonCls [name=" + name + "]";
	}

}
