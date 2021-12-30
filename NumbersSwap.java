package com.bridgelab.coreprograms;

import java.util.Scanner;

public class NumbersSwap {

	public static void main(String[] args) {
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a First number:");
		number1=sc.nextInt();
		System.out.print("Enter a Second number:");
		number2=sc.nextInt();
		number1=number1+number2;
		number2=number1-number2;
		number2=number1-number2;
		System.out.println("Afte swapping:"+ number1 + " "+ number2);
	}
}
