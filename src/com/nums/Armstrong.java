package com.nums;

	public class Armstrong {
		public static void main(String[] args) {
			armstrong1_10000();
	}
		public static void armstrong1_10000() {
			
			for(int  i=1;i<=10000;i++) {
				int res = 0;
				int digit = String.valueOf(i).length();
				int original =  i;
				int temp =i;
				while(temp!=0) {
				int rem=temp%10;
				 res+=(int)Math.pow(rem, digit);
				 temp/=10;
				}
				if(res==original) {
					System.out.println(res);
					
				}
//			i=original;
			}
			
		}
		
	}

