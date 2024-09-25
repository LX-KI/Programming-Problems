package com.Arrays;

public class MaxSumSubKlength {
	public static int sub(int arr[],int k) {
		int sum1=0;
		for(int i=0;i<=k;i++) {
			sum1+=arr[i];
		}
		int max=sum1;
		for(int i=0;i<=arr.length-k;i++) {
			int sum =0;
			for(int j=i;j<i+k;j++) {
				sum+=arr[j];
				}
			if(max<sum) {
				max=sum;
			}
		}
		return max;
		}
	public static void main(String[] args) {
		int[] arr =  {9,-18,4,12,-6,8};
		System.out.println(sub(arr,3));
	}
	}


