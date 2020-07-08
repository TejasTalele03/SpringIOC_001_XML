package com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/resource/Spring.xml");
	
		Student student = (Student) context.getBean("stud");
		System.out.println(student.getAge());
		System.out.println(student.getAddress().getLandmark());
		System.out.println(student.getMobileNos());
	}
	
	
}
