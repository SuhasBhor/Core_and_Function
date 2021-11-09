package com.core;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How Many Times You Want to Flip Coin: ");
		int  m = scan.nextInt();

		double tailCount=0,headCount=0;
		for(int i=0;i<m;i++) {
			Random rand = new Random();
			double n = rand.nextInt(2);	
			if(n == 0) {
				tailCount++;
			}else {
				headCount++;
			}
		}
		System.out.print("HeadCount Percentage: ");
		System.out.println(Math.floor((headCount/m)*100));
		System.out.print("TailCount Percentage: ");
		System.out.print(Math.floor((tailCount/m)*100));
	}
}
