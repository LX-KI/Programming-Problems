package com.nums;

public class Armstrong12 {
	static int count = 0 ;
	static int num = 1;
	public static void arm() {
		while(count<12) {
			int original = num;
			int res=0;
			int digits=String.valueOf(num).length();
			int temp = num;
			while(temp!=0) {
				int rem = temp%10;
				res+=(int)Math.pow(rem, digits);
				temp/=10;
			}
			if(original==res) {
				System.out.println(count+1 +"-"+ res);
				count++;
			}
			num++;
		}
		
	}
	public static void main(String[] args) {
		arm();
	}
}
