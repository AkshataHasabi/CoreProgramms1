package com.bridgelab.coreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year:");
	    int year = sc.nextInt();
	    boolean leapYear = false;
	    if(year > 999 && year < 10000) {
	    	if(year % 4 == 0) {
	    		if(year % 100 == 0) {
	    			if(year % 400 == 0) {
	    				leapYear = true;
	    			}else {
	    				leapYear = false;
	    			}
	    		}else {
	    			leapYear = true;
	    		}
	    	}else {
	    		leapYear = false;
	    	}
	    }else {
	    	System.out.println("Enter only 4 digit number");
	    }
	    if(leapYear) {
	    	System.out.println(year+" "+ "is a Leap Year");
	    }else {
	    	System.out.println(year+" "+ "is not a Leap Year");
	  }

	}

}
