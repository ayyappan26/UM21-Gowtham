package com.ultramain.um21.laptop;

import com.ultramain.um21.laptop.Laptop;

public class Display {
		 public void displayLaptopDetails(Laptop laptop){
			System.out.println("Model          :" + laptop.getModel());
			System.out.println("Company Name   :" + laptop.getCompanyName());
			System.out.println("Processor Type :" + laptop.getProcessorType());
			System.out.println("Ram Size       :" +  laptop.getRamSize());
			System.out.println("Purchase Year  :" +laptop.getPurchaseYear());
	 }
}
