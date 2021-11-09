package com.function;

import java.io.PrintStream;
import java.util.Scanner;

public class TwoDArray {
	Scanner scanner = new Scanner(System.in);
	PrintStream print = new PrintStream(System.out);

	public void intTwoArray(int m,int n) {
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				print.print("Enter the Element For "+i+ " and "+j);
				arr[i][j] = scanner.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				print.print(arr[i][j]+ " ");
			}
			System.out.println( );
		}
	}

	public void booleanTwoArray(int m,int n) {
		boolean[][] arr = new boolean[m][n];

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				print.print("Enter the Element For "+i+ " and "+j);
				arr[i][j] = scanner.nextBoolean();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				print.print(arr[i][j]+ " ");
			}
			System.out.println( );
		}
	}

	public void doubleTwoArray(int m,int n) {
		double[][] arr = new double[m][n];

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				print.print("Enter the Element For "+i+ " and "+j);
				arr[i][j] = scanner.nextDouble();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				print.print(arr[i][j]+ " ");
			}
			System.out.println( );
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the value of m: ");
		int m = scanner.nextInt();

		System.out.print("Please enter the value of n: ");
		int n = scanner.nextInt();

		TwoDArray object = new TwoDArray();

		System.out.println("Please enter your choice of array type: ");
		System.out.println("1.Integer \n2.Boolean \n3.Double");
		int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			object.intTwoArray(m,n);
			break;
		case 2:
			object.booleanTwoArray(m,n);
			break;
		case 3:
			object.doubleTwoArray(m,n);
			break;
		default:
			System.out.println("Please Enter Valid Number");
			break;
		}
	}
}
