package com.nums;

public class Prime50 {
	public static void main(String[] args) {
	 int num=2;
     int count=0;
		while(count<50) {
			 boolean isPrime =true;
			if(num%2==0 && num!=2) {
				isPrime=false;
			}
			for(int i=3;i<=Math.sqrt(num);i+=2) {
				if(num%i==0) {
					isPrime= false;
					break;
				}
				
			}
			if(isPrime) {
				System.out.println(num + " ");
				count++;
			}
			num++;
		}
		System.out.println(count);
	}
}