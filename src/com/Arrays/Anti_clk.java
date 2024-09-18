package com.Arrays;

import java.util.Arrays;

public class Anti_clk {
	public static void main(String[] args) {
		int [] arr ={10,20,30,40,50,60};
		for(int i=1;i<=3801%arr.length;i++) {
			rot_anti(arr);
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void rot_anti(int arr[]) {
		int temp = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
}

