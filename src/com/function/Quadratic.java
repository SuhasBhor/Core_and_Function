package com.function;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		double a = sc.nextDouble();
		System.out.println("Enter value of b:");
		double b = sc.nextDouble();
		System.out.println("Enter value of c:");
		double c = sc.nextDouble();

		double d = b*b-4.0*a*c;
		if(d>0.0) {
			double root1 =(-b+Math.sqrt(d))/(2.0*a);
			double root2 =(-b-Math.sqrt(d))/(2.0*a);
			System.out.println("The Roots are:" + root1 + "and" + root2 );
		}
		else if(d==0.0) {
			double root1 = -b/(2.0*a);
			System.out.println("The Roots is:"+root1 );
		}
		else {
			System.out.println("Roots are not Real");
		}
	}
}
