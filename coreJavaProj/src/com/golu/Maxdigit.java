package com.golu;

import java.util.Scanner;

public class Maxdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits to find max");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		
		for( i=n-1;i>0;i++) {
			if(a[n-2]>a[n-1]) {
				a[n-1]=a[n-2];
				a[n-2]=a[n-1];
			}
			
		}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

}
