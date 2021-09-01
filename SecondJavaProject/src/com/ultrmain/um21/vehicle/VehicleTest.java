package com.ultrmain.um21.vehicle;

public class VehicleTest {
	public static void main(String[] args){
		YamahaBike mybike = new YamahaBike();
		//mybike.car();
		//mybike.bike();
		//mybike.yamaha();
		
	}
}
	class Vehicle{
		public  Vehicle(){
		System.out.println("In Vehicle....");
		}
	}
	class Bike extends Vehicle{
		public Bike(){
		this("Hello");
		System.out.println("In Bike.....");
		}
		public Bike(String msg){
			System.out.println("Message:"+msg);
		}
		public Bike(String biketype,String version){
			System.out.println("Biketype is:"+biketype);
			System.out.println("Bikeversion is:"+version);
		}
	}
   class YamahaBike extends Bike{
	   public YamahaBike(){
		   super("R15","v3");
		   System.out.println("Yamaha Bike...");
	   }
   }

