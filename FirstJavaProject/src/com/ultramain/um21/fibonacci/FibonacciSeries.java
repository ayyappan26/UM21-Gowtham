package com.ultramain.um21.fibonacci;
import java.util.Scanner;
public class FibonacciSeries {
public static void main(String[] args){
	Scanner series = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = series.nextInt();
	System.out.println("Num = "+ num);
	System.out.println("Fibonacci series are:");
	//System.out.println("0");
	//System.out.println("1");
	int a=0; int b=1;
	for(int i=1;i<=num;i++){
     System.out.println(a);
     int c = a+b;
     a=b;
     b=c;
    
	
	}
	
}
}
