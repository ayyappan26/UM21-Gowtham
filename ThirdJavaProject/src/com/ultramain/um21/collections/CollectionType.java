package com.ultramain.um21.collections;

import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionType {
   public static void main(String[] args){
	   new CollectionType().addList();
   }

public void addList(){
	//ArrayList<Integer> numList = new ArrayList<>();
	Set<Integer> numList = new HashSet<>();
	//Set<Integer> numList = new LinkedHashSet();
	//Set<Integer> numList = new TreeSet<>();
	numList.add(10);
	numList.add(30);
	numList.add(30);
	numList.add(40);
	numList.add(20);
	
	for(int res:numList){
		System.out.println(res);
	}
}

}