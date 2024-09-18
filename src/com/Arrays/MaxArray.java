package com.Arrays;

public class MaxArray {
public static void max(int arr[]) {
int i=0;
int max =arr [0];
for(i=0;i<=arr.length-1;i++)
{
	if(arr[i]>max) {
		max=arr[i];
	}
}
System.out.println(max);
}
public static void main(String[] args) {
int [] arr = {-10,-20,-30,-40,-50};
	max(arr);
	
}
}