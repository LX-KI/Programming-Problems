package com.nums;
import java.util.Scanner;


public class Perfect {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number :");
	int num = sc.nextInt();
	int sum=0;
	for(int i = 1;i<num;i++) {
		if(num%i==0) {
			sum+=i;
		}	
	}
System.out.println("the given number "+ num + " is "
	+ (sum==num ?"a perfect number" :"not a perfect number"));
	sc.close();
}
}
