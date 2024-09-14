package com.nums;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		noOfDigits(num);
		sc.close();
		
	}
	public static int noOfDigits(int num) {
		int count= 0;
		while(num!=0) {
		num/=10;
		count++;
		}
		System.out.println(count);
		return count;
	}
}
