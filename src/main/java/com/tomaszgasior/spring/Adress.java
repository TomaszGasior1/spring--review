package com.tomaszgasior.spring;

public class Adress {

	private String street;
	private Int postcode;
	
	public Adress(){
		
	}
	
	public Adress(String street, String postcode) {
		this.street = street;
		this.postcode = postcode;
	}
	public void init(){
		System.out.println("Bean created: " + this);
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", postcode=" + postcode + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
}
