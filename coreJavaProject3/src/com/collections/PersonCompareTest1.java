package com.collections;
import java.util.Iterator;
import java.util.TreeSet;

 class PersonCompare implements Comparable<PersonCompare>{
	String name;
	int weight;
	int height;
	public PersonCompare(String name, int weight, int height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public int compareTo(PersonCompare pc) {
		if(this.weight > pc.weight) {
			return 1;
		}
		else if (this.weight < pc.weight){
			return -1;
		}
		else {
			return 0;
		}
		
	}
	@Override
	public String toString() {
		return "PersonComare [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}



public class PersonCompareTest1 {

	private void testTreeSet() {
		TreeSet<PersonCompare> treeSet = new TreeSet<PersonCompare>();
		treeSet.add(new PersonCompare("Aditya",48,5));
		treeSet.add(new PersonCompare("Samir",49,7));
		treeSet.add(new PersonCompare("Ram",43,4));
		treeSet.add(new PersonCompare("Modi",42,2));
		
		Iterator<PersonCompare> itr = treeSet.iterator();
		while(itr.hasNext()) {
			PersonCompare a = itr.next();
			System.out.println(a);
		}
	}
	public void main(String[] args) {
		testTreeSet();

}
}

	
	}


