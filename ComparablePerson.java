import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p1) {
		return p1.name.compareTo(p2.name)*-1;
	}
}

class PersonHeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.height_in_inches > p2.height_in_inches) {
			return -1;
		}
		else if(p1.height_in_inches < p2.height_in_inches) {
			return 1;
		}
		return 0;
	}
}
class PersonWeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.weight > p2.weight) {
			return -1;
		}
		else if(p1.weight < p2.weight) {
			return 1;
		}
		return 0;
	}
}

class Person implements Comparable<Person> {

	String name;
	double height_in_inches;
	double weight;
	
	public Person(String name, double height_in_inches, double weight) {
		this.name = name;
		this.height_in_inches = height_in_inches;
		this.weight=weight;
	}
	
	public String toString() {
		return name + " - " + height_in_inches +"-" + weight;
	}

	//@Override
	public int compareTo(Person p) {
		if(this.name > p.name) {
			return -1;
		}
		else if(this.name < p.name) {
			return 1;
		}
		return 0;
	}
}
public class ComparablePerson {

	public static void main(String[] args) {
		Order order1 = new Order("Chair purchase", 12000);
		Order order2 = new Order("Table purchase", 15000);
		Order order3 = new Order("Furniture Sale", 12000);
		
		List<Order> list = new ArrayList<Order>();
		list.add(order1);
		list.add(order2);
		list.add(order3);
		
		//Collections.sort(list); //calls Comparable
Collections.sort(list, new OrderTitleComparator()); //calls Comparator
		
		for(Order order: list) {
			System.out.println(order);
		}
	}

}