package com.ultramain.um21.casting;

public class CastingType3 {
	public static void main(String[] args){
  WildAnimals mywild = new WildAnimals();
  DomesticAnimals mydomestic = new DomesticAnimals();
  
  Display mydisplay = new Display();
  mydisplay.displayDetails(mydomestic);
}
}
class Animals{
	public void eat(){
		System.out.println("Animals are eating....");
	}
	public void run(){
		System.out.println("Animals are running.........");
	}
}
class WildAnimals extends Animals{
	public void eat(){
		System.out.println("Wild Animals are eating.....");
	}
	public void hunt(){
		System.out.println("Wild Animals are hunting......");
	}
}
class DomesticAnimals extends Animals{
	public void eat(){
	System.out.println("Domestic Animlas are eating.....");
	}
	public void sleep(){
		System.out.println("Domestic animals are sleeping.....");
	}
}

class Display{
	public void displayDetails(Animals myanimals){
		
		if(myanimals instanceof WildAnimals){
			WildAnimals mywild = (WildAnimals)myanimals;
			mywild.eat();
			mywild.hunt();
			mywild.run();
		}
		if(myanimals instanceof DomesticAnimals){
			DomesticAnimals mydomestic = (DomesticAnimals)myanimals;
			mydomestic.eat();
			mydomestic.sleep();
			mydomestic.run();
		}
		
	}
}