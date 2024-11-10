package com.score.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context= new ClassPathXmlApplicationContext("com/score/autowire/config.xml");
		Question q1=(Question)context.getBean("d");
		System.out.println(q1);
		// TODO Auto-generated method stub

	}

}
