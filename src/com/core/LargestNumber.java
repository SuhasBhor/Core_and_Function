package com.core;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How Namy Number You Wants:");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Numbers Are: ");
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		
		int large=a[0];
		for(int i=1;i<n;i++) {
			while(large<a[i]) {
				large=a[i];
			}
		}
		System.out.println("Largest Number Among This "+n+"  Number is "+large);
	}
}
