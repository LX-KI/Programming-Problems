package com.Strings;

public class CharExtract {
public static void main(String[] args) {
	String a= "untrackedFile";
	// to print all the characters separately;
	for(int i=0;i<a.length();i++) {
		System.out.println(a.charAt(i));
	}
	//for char at odd positions
	for(int i = 0;i<a.length();i++) {
		char ch=a.charAt(i);
		if(i%2+1==1) {
			System.out.println("chars at odd pos:"+ ch);
			
		}
	}
	System.out.println();
	for(int i = 0;i<a.length();i++) {
		char ch=a.charAt(i);
		if(i%2==1) {
			System.out.println("chars at even pos:"+ ch);
		}
}
}
}