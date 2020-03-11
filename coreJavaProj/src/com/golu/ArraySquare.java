package com.golu;

import java.util.Scanner;

public class ArraySquare {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int i;
		int sum=0;
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for( i=0;i<n-1;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				sum+=(a[j]*a[j]);
				}
			sum=sum-a[i]*a[i];
			System.out.println(sum);
			sum=0;
			
		}

	}

}
