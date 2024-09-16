package com.recursion;

public class Rec_Fibo {
	public static int fibo(int a,int b,int n) {
		if(n==0) {
			return n;
		}
		System.out.println(a);
		return fibo(b,a+b,n-1);
	}
	public static void main(String[] args) {
		fibo(0,1,6);
	}
}
