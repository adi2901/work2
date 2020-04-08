package com.spring_demo;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("Beans_simple.xml");
		AccountBean account=(AccountBean)iocContainer.getBean("accountOne");	
		System.out.println(account);
		iocContainer.registerShutdownHook();
	}
	/*private static void getTotalPrice()
	{
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("Beans_simple.xml");
		Map<String,OrderBean> map= iocContainer.getBeansOfType(OrderBean.class);
		double sum=0;
		System.out.println(map.toString());
		for(String str:map.keySet())
		{
			OrderBean o=(OrderBean)map.get(str);
			System.out.println(o.toString());
			sum+=o.getItem().getPrice();
		}
		System.out.println(sum);
	}*/

}
