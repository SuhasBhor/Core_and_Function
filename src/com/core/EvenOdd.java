package com.core;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int x=scanner.nextInt();
		if(x % 2 == 0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}
}
