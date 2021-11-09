package com.core;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Value of X and Y: ");
		int t,x=scanner.nextInt();
		int y=scanner.nextInt();
		System.out.println("Before Swapping value of X: " + x + " and Y: " + y );
		t=x;
		x=y;
		y=t;
		System.out.println("After Swapping value of X: " + x + " and Y: " + y );
	}
}
