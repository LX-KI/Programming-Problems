package com.nums;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for its factors:");
		int n=sc.nextInt();
		factors(n);
		sc.close();
		}

	public static void factors(int n) {
		System.out.println("The factors of "+ n + " are as follows:");	
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
