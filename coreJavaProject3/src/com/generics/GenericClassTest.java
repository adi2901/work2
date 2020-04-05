package com.generics;
class GenericClass<T>{
	
	private T t; 
	public void set(T t) { 
		this.t = t; 
		} 
	public T get() { 
			return t; }

}
public class GenericClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String> box = new GenericClass<String>();
		box.set("RAM"); 
		String x = box.get();
		System.out.println(x);

	}

}
