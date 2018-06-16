package com.tomaszgasior.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tomaszgasior/spring/beans/beans.xml");
		Logger logger = (Logger) context.getBean("logger");
		
		logger.cwrite("Piszę na konsoli");
		logger.fwrite("Pisze do pliku");
		
	}

}
