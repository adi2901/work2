package com.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapKeyValues {
	public static void printMapKey(HashMap<? extends Number,?> hmap) {
		Iterator<?> i =  hmap.keySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m = new HashMap();
		m.put(1, "Ramesh");
		m.put(2,"raju");
		printMapKey(m);
        
	}

}
