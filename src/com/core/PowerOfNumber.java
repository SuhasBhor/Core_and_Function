package com.core;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Base value: ");
		int b = scanner.nextInt();
		System.out.print("Enter Exponent Value That of Base: ");
		int i,n = scanner.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("Power of " + b + " when Exponent is " + i + " is: " +Math.pow(b, i));
		}
	}
}
