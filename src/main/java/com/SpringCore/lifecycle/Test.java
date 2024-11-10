package com.SpringCore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		context= new ClassPathXmlApplicationContext("com/SpringCore/lifecycle/config.xml");
		context.registerShutdownHook();
		Department d1=(Department)context.getBean("d1");
		System.out.println(d1);
		
		
		
		System.out.println("---------------------------------------------------------");
		emp e1=(emp)context.getBean("e1");
		System.out.println(e1);
		
		
		

	}

}

