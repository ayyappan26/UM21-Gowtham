package com.ultramain.um21.collectionpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCollection {
 public static void main(String[] args){
	 new UniqueCollection().getCollection();
	 
 }

public Set<String> getCollection(){
	
	String ar[] = {"Python","Java","Python","Java","Java"};
	List<String> result = Arrays.asList(ar);
	Set<String> res2 = new TreeSet<>(result);
	System.out.println(res2);
	return res2;
}
}