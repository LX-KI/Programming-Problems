package com.nums;

public class Prime15 {
	public static void main(String[] args) {
		int count=0;
		int num=2;
		while(count<15) {
			boolean isPrime=true;
			if(num!=2 && num%2==0) {
				isPrime=false;
			}
			else {
				for(int i=3;i<=Math.sqrt(num);i+=2) {
					if(num%i==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					System.out.println(num);
					count++;
				}
			}
			num++;
		}
		System.out.println(count);
	}
}
