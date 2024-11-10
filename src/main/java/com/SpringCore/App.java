package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("com/SpringCore/config.xml");
        Student s1 = (Student)context1.getBean("st");
        System.out.println(s1);
       
    }
}
