package com.bridgelab.coreprograms;

import java.util.Scanner;

public class QuotientValue {

	public static void main(String[] args) {
		int number1, number2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a First number:");
		number1=sc.nextInt();
		System.out.println("Enter a Second number:");
		number2=sc.nextInt();
		int quotient=number1/number2;
		int remainder=number1%number2;
		System.out.println("The Quotient is:"+ quotient);
		System.out.println("The Remainder is:"+ remainder);

	}
}
