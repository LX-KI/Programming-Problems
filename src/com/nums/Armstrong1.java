package com.nums;

import java.util.Scanner;

public class Armstrong1 {
	public void check(int num) {
		int original=num;
		int digit = String.valueOf(num).length();
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			int res = (int)Math.pow(rem, digit);
			num/=10;
			sum+=res;
		}
		
		System.out.println("the number " + original +
				(sum==original? " is an Armstrong number":" is not an Armstrong number"));
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Armstrong1 a=new Armstrong1();
		a.check(num);
		sc.close();
	}
}
