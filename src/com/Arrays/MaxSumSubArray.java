package com.Arrays;

public class MaxSumSubArray {
	public static int sub(int arr[]) {
	int max =arr[0];
	for(int i=0;i<arr.length;i++) {
		int sum =0;
		for(int j=i;j<arr.length;j++) {
			sum+=arr[j];
			if(max<sum) {
				max=sum;
			}
		}
	}
	return max;
	}
public static void main(String[] args) {
	int[] arr =  {9,-18,4,12,-6,8};
	System.out.println(sub(arr));
}
}
