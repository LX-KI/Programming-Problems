package com.Strings;
import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		String a= "silent";
		String b= "listen";
		
		char [] arr1 = a.toCharArray();
		char [] arr2 = b.toCharArray();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not an anagram");
		}
	}
}
