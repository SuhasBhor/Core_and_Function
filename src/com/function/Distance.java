package com.function;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Point Value:");
		int x = sc.nextInt();
		System.out.print("Enter Second Point Value:");
		int y = sc.nextInt();
		double Distance=Math.sqrt((x*x) +(y*y));
		System.out.println("Distance from(0,0) to  " + x +"  and  "+ y +"  is:  " +Distance);
	}
}
