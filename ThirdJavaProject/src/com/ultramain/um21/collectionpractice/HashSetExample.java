package com.ultramain.um21.collectionpractice;

import java.util.HashSet;

public class HashSetExample { 
	HashSet<String> h1 = new HashSet<>();
	public static void main(String[] args){
		String country = "India";
		HashSetExample hash = new HashSetExample();
		HashSet<String> h2 = new HashSet<>();
		h2=hash.storeCountryNames(country);
		System.out.println(h2);
		
		
		
		
	}
  public HashSet<String> storeCountryNames(String country){
	  h1=new HashSet<>();
	  h1.add(country);
	  return h1;
	  
  }
  public String retrieveCountry(String country){
	  boolean bl = h1.contains(country);
	  if(bl){
		  return country;
	  }else{
		  return null;
	  }
  }
}
