package com.ultramain.um21.casting;

public class CastingType1 {
public static void main(String[] args){
	YamahaBike mybike = new YamahaBike();
	mybike.vehicle();
	mybike.Tyre();
}
}

class Vehicle {
	public void vehicle() {
		System.out.println("Vehicle.....");
	}
}

class Bike extends Vehicle {
	public void Tyre() {
		System.out.println("Bike has tube tyres.....");
	}
}

class YamahaBike extends Bike {
	public void Tyre(){
		System.out.println("Bike has tubeless tyres.....");
	}
}