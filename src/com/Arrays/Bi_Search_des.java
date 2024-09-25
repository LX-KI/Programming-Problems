package com.Arrays;

public class Bi_Search_des {
		
		public static int biSearch(int[] arr,int key) {
			int sp=0;
			int ep=arr.length;
			
			while(sp<=ep) {
				int mid = (sp+ep)/2;
				
				if(arr[mid]==key) {
					return mid;
				}
				
				else if (key<mid) {
					sp=mid + 1;
				}
				else {
					ep=mid-1;
				}
			}
			return -1;
		}
		public static void main(String[] args) {
		int [] arr = {90,80,70,60,50,40,30,20,10};
		int key = 50;
		int index = biSearch(arr, key);
		System.out.println(index);
		}
		
	}



