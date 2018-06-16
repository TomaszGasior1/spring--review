package com.tomaszgasior.spring.autowiring;

public class FileWriter implements Writer {
	public void write(String text){
		System.out.println("Writing to file: "+ text);
	}

	
		

}
