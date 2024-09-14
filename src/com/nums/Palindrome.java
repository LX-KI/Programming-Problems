package com.nums;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println(IsPalindrome(n));
		sc.close();
	}
	
	public static boolean IsPalindrome(int n) {
		if(n==0) {
			System.out.println("Zero is considered  as a Palindrome");
			return true;
		}
		if (n<0 || (n%10==0 && n!=0)) {
			return false;
		}
		
		int temp = n;
		int rev =0;
		
		while(temp>rev) {
			int last_digit=temp%10;
			rev=(rev*10)+last_digit;
			temp/=10;
		}
		return temp==rev || temp==rev/10;
	}
}
