package com.tomaszgasior.spring;

public class Person {

	private int id;
	private String name;
	private int taxId;
	private Adress adress;

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person() {

	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", adress=" + adress + "]";
	}

	public void speak() {
		System.out.println("hello i am a person");
	}

}
