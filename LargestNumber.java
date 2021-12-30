package com.bridgelab.coreprograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int number1, number2, number3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number:");
		number1=sc.nextInt();
		System.out.print("Enter a second number:");
		number2=sc.nextInt();
		System.out.print("Enter a third number:");
		number3=sc.nextInt();
		if(number1>number2 && number1>number3) {
			System.out.println("Largest number:" + number1);
		}else if(number2>number3){
			System.out.println("Largest number:"+ number2);
		}else {
			System.out.println("Largest number:"+ number3);
		}
	}
}
