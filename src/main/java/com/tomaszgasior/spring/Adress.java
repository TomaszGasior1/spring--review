package com.tomaszgasior.spring;

public class Adress {

	private String street;
	private String postcode;
	
	public Adress(String street, String postcode) {
		this.street = street;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", postcode=" + postcode + "]";
	}
	
}
