package com.ultramain.um21.collectionpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
   public static void main(String[] args){
	   HashMap<Integer,String> map = new HashMap<>();
	   map.put(101, "King");
	   map.put(102, "Surya");
	   map.put(101, "Raja");
	   map.put(103, "King");
	   
	   //Set<Integer> keys = map.keySet();
	   //for(Integer m:keys){
		 //  System.out.println(map.get(m));
	   
	  // }
	   for(Map.Entry m:map.entrySet()){
		   System.out.println(m.getKey() +" "+ m.getValue());
	   }
	   
   }
}
