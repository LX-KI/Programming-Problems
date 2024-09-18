package com.Arrays;

import java.util.Arrays;

public class RevArray {

	public static void main(String[] args) {
		int[] arr ={10,20,30,40,50};
		int [] res = new int[arr.length];
		rev(arr, res );
	}
	public static void rev(int arr[],int res[]) {
		int k =0;
		for (int i =arr.length-1;i>=0;i--) {
			res[k] =arr[i];
			k++;
		}
		System.out.println(Arrays.toString(res));	
	}
}
