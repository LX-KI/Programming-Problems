package com.Strings;

public class MoveHashFirst {
	public static void main(String[] args) {
		String a= "Move#hash#to#first";
		String res1="";
		String res2="";
		// to print all the characters separately;
		for(int i=0;i<a.length();i++) {
					if(a.charAt(i)=='#') {
						res1+=a.charAt(i);
					}else {
						res2+=a.charAt(i);
					}
		}
	System.out.println(res1+res2);
	}
	
}
		//for char at odd positions
//		for(int i = 0;i<a.length();i++) {
//			char ch=a.charAt(i);
//			if(i%2+1==1) {
//				System.out.println("chars at odd pos:"+ ch);
//				
//			}
//		}
//		System.out.println();
//		for(int i = 0;i<a.length();i++) {
//			char ch=a.charAt(i);
//			if(i%2==1) {
//				System.out.println("chars at even pos:"+ ch);
//			}
	
	

