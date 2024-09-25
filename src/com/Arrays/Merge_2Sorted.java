package com.Arrays;

import java.util.Arrays;

public class Merge_2Sorted {
	public static void main(String[] args) {
		int [] arr1 = {10,20,30 ,40};
		int [] arr2 = {9,15,17,21,23};
		int [] res  = new int [arr1.length+arr2.length];
		System.out.println(Arrays.toString(merge(arr1,arr2,res)));
		
	}

		public static int [] merge (int []arr1, int[] arr2, int [] res) {
			int i= 0; 
			int j= 0; 
			int k= 0; 
			
			while(i<arr1.length && j<arr2.length) {
				if(arr1[i]<arr2[j]) {
					res[k]=arr1[i];
					i++;
					k++;
				}
				else {
					res[k]=arr2[j];
					j++;
					k++;
				}
			}
			
			while(i<arr1.length) {
				res[k]=arr1[i];
				i++;
				k++;
			}
			while(j<arr2.length) {
				res[k]=arr2[j];
				j++;
				k++;
			}
			return res;
		}
}
