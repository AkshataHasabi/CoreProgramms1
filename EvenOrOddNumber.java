package com.bridgelab.coreprograms;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		number=sc.nextInt();
		if(number%2 == 0) {
		System.out.println("Even number:");
		}else {
			System.out.println("Odd number");
		}	
	}
}
