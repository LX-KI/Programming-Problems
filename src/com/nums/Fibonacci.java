package com.nums;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);		
		int i=1;
		System.out.println("enter the value of n");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		while(i<=num) {
			System.out.println(a);
			int res=a+b;
			a=b;
			b=res;
			i++;
			sc.close();
		}
	}
}
