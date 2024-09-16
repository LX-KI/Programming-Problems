package com.recursion;

class Rec_Rev {
	public static int rev(int num,int res) {
		if(num==0) {
			return res;
		}
		return rev(num/10,((res*10)+(num%10)));
	}
	 public static void main(String[] args) {
		int res=0;
		int num=3589;
		int Rev=rev( num,res);
		System.out.println("original no is:"+ num);
		System.out.println("reversed no is:"+ Rev);
	}
 
}

 
