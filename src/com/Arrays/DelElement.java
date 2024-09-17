package com.Arrays;
import java.util.Arrays;

public class DelElement {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 45,50, 60, 70};
		int index=4;
		int res[] = new int [arr.length-1];
		
		for(int i=0;i<index;i++) {
			res[i] = arr[i];
		}
		for(int i=index+1;i<arr.length;i++) {
			res[i-1]=arr[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
