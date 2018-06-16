package com.tomaszgasior.spring.autowiring;

public class ConsoleWriter implements Writer {

	public void write(String text) {
		System.out.println("Writing on console: " + text);
		
	}

}
