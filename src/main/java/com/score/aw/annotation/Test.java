package com.score.aw.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context= new ClassPathXmlApplicationContext("com/score/aw/annotation/config.xml");
		Question q1=(Question)context.getBean("question");
		System.out.println(q1);
		// TODO Auto-generated method stub

	}

}
