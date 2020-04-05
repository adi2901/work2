package com.generics;

import java.util.ArrayList;
import java.util.List;


public class ListNumbers {
public static void PrintNumber(List<? extends Number> list) {
for(Number N:list) {
System.out.println(N);
}
}
public static void main(String[] args) {

List<Integer> l1=new ArrayList<Integer>();
List<Float> l2=new ArrayList<Float>();
List<Double> l3=new ArrayList<Double>();
List<String> l4=new ArrayList<String>();
List<Boolean> l5=new ArrayList<Boolean>();

l1.add(5);
l2.add(5.2f);
l3.add(2.32);
l4.add("hello");
l5.add(true);
PrintNumber(l1);
PrintNumber(l2);
PrintNumber(l3);
//PrintNumber(l4);
//PrintNumber(l5);
}


}