package com.nums;

import java.util.Scanner;

public class Rev {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num to be reversed");
		int num = sc.nextInt();
		System.out.println("the original num is: " + num);
		System.out.println("The reversed num is:"+ rev(num));
		sc.close();
	}
	public static int rev(int i) {
		int res=0;
			while(i!=0) {
			int digit= i%10;
			res= (res*10)+digit;
			i/=10;
			}
	return res;
	}
}
