package com.nums;

import java.util.Scanner;

	public class Natural {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n:");
			int n=sc.nextInt();
			nums(n);
			sc.close();
		}
		public static void nums(int n) {
			System.out.println("Natural numbers up to "+ n +" are as follows:");
			for(int i=1;i<=n;i++) {
				System.out.print(i+" ");
			}
		}
}
