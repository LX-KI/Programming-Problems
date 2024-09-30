package com.Strings;

public class RevString {
public static void main(String[] args) {
	String s = "Pentagon";
	String res=" ";
	
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		res=ch + res;
	}
	System.out.println(res);
}
}