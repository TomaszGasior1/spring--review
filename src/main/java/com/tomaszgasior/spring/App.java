package com.tomaszgasior.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/tomaszgasior/spring/beans/beans.xml");

		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");

		person1.setTaxId(999);
		System.out.println(person2);

		Adress adress = (Adress) context.getBean("adress");
		System.out.println(adress);

		((ClassPathXmlApplicationContext) context).close();
	}

}
