package com.recursion;

public class Rec_fiboSum {
	
	public static int fibo(int a,int b,int n) {
		if(n==0) {
			return n;
		}
	return a+fibo(b,a+b,n-1);
	}
public static void main(String[] args) {
	System.out.println(fibo(0, 1, 7));
}
}
