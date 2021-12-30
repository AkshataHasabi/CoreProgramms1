package com.bridgelab.coreprograms;

public class FlipCoin {

	public static void main(String[] args) {
		int norOfFlip = 10;
		int heads = 0, tails = 0;
		for(int i=0; i<norOfFlip; i++) {
			if(Math.random() < 0.5) {
				tails++;
			}
			heads++;
		}
		double tailPercentage=(tails*100)/norOfFlip;
		double headPercentage = 100-tailPercentage;
		System.out.println("Percentage Of Tail:"+ tailPercentage);
		System.out.println("Percentage Of Head:"+ headPercentage);
	}
}
