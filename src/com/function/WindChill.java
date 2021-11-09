package com.function;

import java.util.Scanner;

public class WindChill {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 double temp,windSpeed,windChill;
		 System.out.print("Enter Temperature: ");
		 temp=scanner.nextDouble();
		 System.out.print("Enter WindSpeed:");
		 windSpeed=scanner.nextDouble();
		 windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);
		 System.out.println("The Wind Chill is: "+windChill);
	    }
}
