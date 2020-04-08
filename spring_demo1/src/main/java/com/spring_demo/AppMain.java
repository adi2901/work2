package com.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("AppSpring.xml");
		Employee e=(Employee)ctx.getBean("account");
		System.out.println(e.getName());
	}

}
