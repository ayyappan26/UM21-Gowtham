package com.ultramain.um21.javaactivity;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void main(String[] args){
		int array[] = {5,1,8,17,9};
		Sort s = new Sort();
		int secondsmall = s.getSecondSmallest(array);
		System.out.println(secondsmall);
		
	}
public int getSecondSmallest(int s[]){
	ArrayList<Integer> arr = new ArrayList<>();
	for(int i=0;i<s.length;i++){
		int val = s[i];
		arr.add(val);
	}
	Collections.sort(arr);
	int second = arr.get(1);
	return second;
	
}
}
