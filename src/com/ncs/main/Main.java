package com.ncs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncs.beans.Address;
import com.ncs.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String config_loc = "/com/ncs/resources/applicationContxt.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		//Student std = (Student) context.getBean("stdId", Student.class); -> We can use this way also
		Student std1 = (Student) context.getBean("stdId");
		Student std2 = (Student) context.getBean("stdAutowiredbyType");
		Student std3 = (Student) context.getBean("stdAutowiredbyName");
		
		
		//Without Autowired
		System.out.println("Without Autowire:");
		std1.display();
		
		System.out.println("\n");
		
		//Autowired byType
		System.out.println("Autowired byType:");
		std2.display();
		
		System.out.println("\n");
		
		//Autowired byName
		System.out.println("Autowired byName:");
		std3.display();
	}
}
