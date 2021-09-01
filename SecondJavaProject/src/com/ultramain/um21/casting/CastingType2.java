package com.ultramain.um21.casting;

public class CastingType2 {
	public static void main(String[] args){
		
	    //BikeType mybike = new YamahaBikeType();
		YamahaBikeType mybike = new HeroHondaBike();
		mybike.vehicle();
		mybike.Tyre();
		mybike.Gear();
	}
	}

	class VehicleType {
		public void vehicle() {
			System.out.println("Vehicle.....");
		}
	}

	class BikeType extends VehicleType {
		public void Tyre() {
			System.out.println("Bike has tube tyres.....");
		}
	}

	class YamahaBikeType extends BikeType {
		public void Tyre(){
			System.out.println("Bike has tubeless tyres.....");
		}
		public void Gear(){
			System.out.println("Bike has five gear model....");
		}
	}
	class HeroHondaBike extends YamahaBikeType{
		public void Tyre(){
			System.out.println("Bike has both tube and tubeless tyres...");
		}
	}

