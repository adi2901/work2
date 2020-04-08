package com.spring_demo;

import com.spring_demo.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChatMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ChatApp.xml");
		ChatRoom ch=(ChatRoom)ctx.getBean("sports");
		System.out.println(ch.getUsers());
	}

}
