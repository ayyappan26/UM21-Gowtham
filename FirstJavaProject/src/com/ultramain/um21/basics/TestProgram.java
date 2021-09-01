package com.ultramain.um21.basics;

import com.ultramain.vehicle.Bike;

public class TestProgram{
	public static void main(String[] args){
		System.out.println("Welcome to java programming....");
		TestProgram.greet();
		Car.carname();
		Bike.bikename();
	}
    public static String greeting;
	public static void greet(){
		System.out.println("Welcome");
		System.out.println("Hello,"+ greeting);
	}
}
class Car
{
	public static void carname(){
		System.out.println("Carname is Hyundai..");
		System.out.println("Carname is Skoda...");
	}
}