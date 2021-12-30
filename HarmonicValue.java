package com.bridgelab.coreprograms;

import java.util.Scanner;

public class HarmonicValue {

	public static void main(String[] args) {
		double number=0;
		int totalN;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		totalN=sc.nextInt();
		for(int i=1; i<=totalN; i++) {
			number=number+(double)1/i;
		}
		System.out.println("The Harmonic value of " + totalN + "is:"+ number);	
	}
}
