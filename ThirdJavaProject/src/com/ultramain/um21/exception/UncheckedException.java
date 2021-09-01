package com.ultramain.um21.exception;

public class UncheckedException {
  public static void main(String[] args){
	  int a =10;
	  String str = "Hello";
	  try{
	  int c = a/0;
	  System.out.println(c);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  System.out.println("Welcome");
  }
}
