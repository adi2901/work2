package com.enums;
enum Status{New(3), Rejected(5), Accepted(4), Completed(2);
	int val;
	Status(int val){
		this.val=val;
		System.out.println(val);
		}
	public int getVal(){
	return this.val;
	}
	public void setVal(int val){
		this.val=val;
		}
	}
	
class Order{
	private int id;
	private String name;
	
	public Order(int id, String name){
		this.id=id;
		this.name=name;
	}
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	}

class StatusMain{
	public static void main(String args[]){
	Order o=new Order(23, "Raj");
	System.out.println("Order for id "+ o.getId()+"having name "+ o.getName()+ " Rejected "+Status.Rejected.getVal()+" times ");
	}
}