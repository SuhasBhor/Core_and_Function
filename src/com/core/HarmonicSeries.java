package com.core;

import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter Number: ");
		  int n = scanner.nextInt();
		  String Series = "1";
		  for(int i = 2;i <= n; i++){
			  Series += "+(1/"+i+")";
		  }
		  System.out.println("Harmonic Series:");
		  System.out.println(Series);
		}
}
