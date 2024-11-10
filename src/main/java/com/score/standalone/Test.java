package com.score.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context=new ClassPathXmlApplicationContext("com/score/standalone/config.xml");
		Employee p1=(Employee)context.getBean("employee");
		System.out.println(p1);
	}

}
