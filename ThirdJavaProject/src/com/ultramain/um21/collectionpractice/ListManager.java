package com.ultramain.um21.collectionpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListManager {
	public static void main(String[] args) {
		
		new ListManager().removeElements();
		new ListManager().getArrayList();

	}

	public List<String> removeElements() {

		List<String> list1 = new ArrayList<>();
		list1.add("Hi");
		list1.add("Hello");
		list1.add("Good Morning");
		list1.add("Good Afternoon");
		List<String> list2 = new ArrayList<>();
		list2.add("Hai");
		list2.add("Good Morning");
		list2.add("Good Afternoon");
		list1.retainAll(list2);
		System.out.println(""+list1);
		return list1;

	}
	public Set<String> getArrayList(){
		
		String arr[] = {"Java","Python","C++"};
		List<String> res = Arrays.asList(arr);
		Set<String> res1 = new TreeSet<>(res);
		System.out.println(res1);
		return res1;
	}
	
}
