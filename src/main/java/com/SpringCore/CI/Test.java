package com.SpringCore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/CI/config.xml");
		Person p1=(Person)context.getBean("per");
		System.out.println(p1);
		// TODO Auto-generated method stub

	}

}
