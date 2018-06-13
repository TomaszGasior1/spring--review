package com.tomaszgasior.spring;

public class Person {

	private int id;
	private String name;
	
	public Person(){
		
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public void speak() {
		System.out.println("hello i am a person");
	}

}
