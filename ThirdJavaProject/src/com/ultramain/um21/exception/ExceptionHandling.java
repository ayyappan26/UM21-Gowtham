package com.ultramain.um21.exception;

public class ExceptionHandling {
	public static void main(String[] args) throws Exception{
		try{
			
			try{
				int a = 10/0;
				
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic error");
			}
			try{
				int b[] = {1,2,3};
				int c = b[4];
				
			}
			catch(ArrayIndexOutOfBoundsException f){
				System.out.println("Array Index error");
			}
		}
		catch(Exception e){
			System.out.println("Exception Handeled...");
		}
		finally{
			System.out.println("Exception Handling program.....");
		}
		
	}

}
