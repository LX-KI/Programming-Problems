package com.Arrays;

public class Binary_Search {
	
	public static int biSearch(int[] arr,int key) {
		int sp=0;
		int ep=arr.length;
		
		while(sp<=ep) {
			int mid = (sp+ep)/2;
			
			if(arr[mid]==key) {
				return mid;
			}
			
			else if (key>mid) {
				sp=mid + 1;
			}
			else {
				ep=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	int [] arr = {10,20,30,40,50,55,60,70,80,90};
	int key = 55;
	int index = biSearch(arr, key);
	System.out.println(index);
	}
	
}
