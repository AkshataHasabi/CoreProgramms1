package com.bridgelab.coreprograms;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a any character:");
		char c=sc.next().charAt(0);
		if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u' || c=='A' || c=='E'|| c=='I' || c=='O' || c=='U') {
			System.out.println("It is a vowel");
		}else {
			System.out.println("It is a consonent");
		}
	}
}
