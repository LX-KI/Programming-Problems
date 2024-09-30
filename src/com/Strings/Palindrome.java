package com.Strings;

public class Palindrome {
	public static void main(String[] args) {
	String s = "malayalam";
	String res="";
	
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		res=ch + res;
	}
	System.out.println(res);
	if (s.equals(res)) {
		System.out.println("it is a palindrome");
	}
	else {
		System.out.println("it is not a palindrom");
	}
}
}
