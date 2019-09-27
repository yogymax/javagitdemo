package com;

import java.util.Arrays;

public class TestArray {

	static public int[]  smallestPairFromArray(int[]numbers,int sum) {
		int resultPair[] = new int[3];
		Arrays.sort(numbers);
		int tempResult = sum;
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;i<numbers.length;j++) {
				
			}
		}
		
		return resultPair;
	}
	
	public static void main(String[] args) {
		int number[] = {10,20,30,40,51};
		
		smallestPairFromArray(number, 50);
		
		
	}
}
