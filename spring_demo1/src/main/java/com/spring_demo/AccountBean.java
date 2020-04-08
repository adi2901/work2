package com.spring_demo;

import org.springframework.beans.factory.BeanNameAware;

public class AccountBean implements BeanNameAware {
	private String name;
	private int id;
	private double balance;
	public AccountBean()
	{
		System.out.println("Inside Constructor");
	}
	public static void init()
	{
		System.out.println("Init");
	}
	public static void destroy()
	{
		System.out.println("Destroyed");
	}
	
	public void setName(String name)
	{
		System.out.println("Inside setterName");
		this.name=name;
	}
	public int getId() {
		System.out.println("Inside getterID");
		return id;
	}
	public void setId(int id) {
		System.out.println("Inside setterId");
		this.id = id;
	}
	public double getBalance() {
		System.out.println("Inside getterBalance");
		return balance;
	}
	public void setBalance(double balance) {
		System.out.println("Inside setterBalance");
		this.balance = balance;
	}
	public String getName() {
		System.out.println("Inside getterName");
		return name;
	}
	@Override
	public String toString() {
		return "AccountBean [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Inside BeanAware Interface");
		this.name=name;
	}
}
