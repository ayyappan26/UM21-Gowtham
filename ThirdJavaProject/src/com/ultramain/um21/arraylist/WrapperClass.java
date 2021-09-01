package com.ultramain.um21.arraylist;

import java.util.ArrayList;

public class WrapperClass {
  public static void main(String[] args){
	  new WrapperClass().calculation();
  }
	 public void calculation(){
		 ArrayList<Float> result = new ArrayList<Float>();
		 for(float i = 1; i<=10;i++){
			 result.add(i);
		 }
		 for(float x:result){
			 System.out.println(x);
		 }
	 }
}
