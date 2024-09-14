package com.nums;

public class Prime1_10000 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10000;i++) {
			if(isPrime(i)) {
				count++;
				System.out.println(i);
			}	
		}
		System.out.println("no. of prime num between 1 and 10000 is :");
		System.out.println(count);
	}

	public static boolean isPrime(int num) {
		if(num==1) {
			return false; //primes are grtr than 1
		}
		if(num==2) {
			return true; //the only even prime no.
		}
		if(num%2==0){
			return false;// even nos are not prime nos
		}
		else {
			for(int i=3;i<=Math.sqrt(num);i+=2) {
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
