package com.bridgelab.coreprograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int N = sc.nextInt();
		int number=1;
		if(N >= 0 && N < 31) {
			System.out.println("Table of the power of 2:");
			for(int i = 1; i <= N; i++) {
				System.out.println("2"+"^"+i+" = "+ (2*number));
				number = 2*number;
			}
		}else {
			System.out.println("Please enter the value of N between 0 to 31 only.");
		}
		System.out.println(2 + " power of "+ N + "is:- " + number );
	}
}
