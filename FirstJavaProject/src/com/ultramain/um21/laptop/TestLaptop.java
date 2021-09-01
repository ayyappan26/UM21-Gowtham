package com.ultramain.um21.laptop;

import  com.ultramain.um21.laptop.Laptop;
import com.ultramain.um21.laptop.Display;
 
 public  class TestLaptop{
		 public static void main(String[] args){
		 Laptop mylaptop = new Laptop();
		 mylaptop.setModel("Thinkpad");
		 mylaptop.setCompanyName("Lenovo");
		 mylaptop.setProcessorType("i5");
		 mylaptop.setRamSize("8GB");
		 mylaptop.setPurchaseYear("2018");
		 
		 Display lapdisplay = new Display();
		 lapdisplay.displayLaptopDetails(mylaptop);
		 System.out.println("-------------------");
		 
		 Laptop mylaptop2 = new Laptop();
		 mylaptop2.setModel("Think");
		 mylaptop2.setCompanyName("Lenovo");
		 mylaptop2.setProcessorType("i7");
		 mylaptop2.setRamSize("16GB");
		 mylaptop2.setPurchaseYear("2019");
		 
		 lapdisplay.displayLaptopDetails(mylaptop2);
		 System.out.println("------------------");
		 
		 Laptop mylaptop3 = mylaptop;
		 mylaptop3.setProcessorType("32GB");
		 lapdisplay.displayLaptopDetails(mylaptop3);
		 System.out.println("--------------------");
		 
		 
		 lapdisplay.displayLaptopDetails(mylaptop);
		 
		 
		 
		 
	 }
		 
 }
