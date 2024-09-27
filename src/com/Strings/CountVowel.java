package com.Strings;

public class CountVowel {
	public static void main(String[] args) {
		String s= "pentagon Space";
		int count_v =0;
		int count_c =0;
		int count_space =0;
		
	for(int i = 0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count_v++;			
		}		
	else if(ch==32) {
		count_space++;
	}
	else {
		count_c++;
	}
	}
	System.out.println(count_v);
	System.out.println(count_c);
	System.out.println(count_space);
}
	}