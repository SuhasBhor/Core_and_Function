package com.core;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = scan.nextInt();
		System.out.print("Prime Factors are : " );
        for (int i = 2; i < n; i++) {
        	while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 2) {
        	System.out.println(n);
  		}
	}
}
