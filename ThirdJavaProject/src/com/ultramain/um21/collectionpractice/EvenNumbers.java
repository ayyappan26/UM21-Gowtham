package com.ultramain.um21.collectionpractice;

import java.util.ArrayList;
import java.util.List;
public class EvenNumbers {
	public ArrayList<Integer> list1 = new ArrayList<>();
	public static void main(String[] args){
		EvenNumbers even = new EvenNumbers();
		List<Integer> res = new ArrayList<>();
		res = even.storeEvenNumber(20);
		System.out.println(res);
		even.printEvenNumber(res);
		int re = even.retrieveEvenNumber(20);
		System.out.println(re);
		

		
	}
	public List<Integer> storeEvenNumber(int n){
		List<Integer> list1 = new ArrayList<>();
		int x =0;
		for(int i=2;i<n;i++){
			x = x+2;
			list1.add(x);
		}
			return list1;
		
	}
	
	public List<Integer> printEvenNumber(List<Integer> list1){
		List<Integer> list2 = new ArrayList<>();
		for(int x:list1){
			list2.add(x*2);
		}
		System.out.println(list2);
		return list2;
	}
	public int retrieveEvenNumber(int n){
		boolean bn = list1.contains(n);
		if(bn){
			return n;
		}else{
			return 0;
		}
		
	}
}


