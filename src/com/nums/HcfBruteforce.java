package com.nums;

public class HcfBruteforce {
public static void main(String[] args) {
	System.out.println(Hcf(48,92));
}
public static int Hcf(int a, int b) {
	int s=(a>b)?b:a;
	int cf=1;
	for(int i=1;i<=s;i++) {
		if(a%i==0 && b%i==0) {
			cf=i;
		}
	}
	return cf;
}

}
