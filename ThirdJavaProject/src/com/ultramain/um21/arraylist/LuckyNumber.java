package com.ultramain.um21.arraylist;

import java.util.ArrayList;

public class LuckyNumber {
	public static void main(String args[]) {

		new LuckyNumber().getLuckyNumber(7);

	}

	public void getLuckyNumber(int Lucky) {
		System.out.println("Entered Number :" + Lucky);
	   // int result[] = new int[10000];
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		int curVal = 0;
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			if ((i > 0) && (i == Lucky)) {
				resultList.add(i);
				//System.out.println(i);
			} else if (i >= 10) {
				curVal = i;
				while (curVal > 0) {
					sum = sum + curVal % 10;
					curVal = curVal / 10;
				}
				if (sum > 10) {
					curVal = sum;
					sum = sum + curVal % 10;
					curVal = curVal / 10;
				}
			}
			if (sum == Lucky) {
				resultList.add(i);
				//System.out.println(i);
			}
			sum = 0;
		}
		for(int x:resultList){
			if( x>0){
				System.out.println(x);
			}
		}

	}
}
