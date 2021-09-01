package com.ultramain.um21.finalkeyword;

public class FinalKeyWord {
	public static void main(String[] args) {
		Son myson = new Son();
		//myson.sleep();
		//myson.eat();
		//myson.play();
		myson.test();
	
	}
}

class GrandFather {

	public void sleep() {
		System.out.println("Sleeping......");
	}
}

final class Dad extends GrandFather {
    
	 public final void eat() {
		System.out.println("Dad Eating veg foods...");
	}

	public void play() {
		final int age = 45;
		System.out.println("Dad Playing football......");
		//age = age + 5;
		System.out.println("Age : " +age);
	}
}

class Son  {
   public void test(){
	   Dad mydad = new Dad();
	   mydad.sleep();
	   mydad.eat();
	   mydad.play();
	   
   }
   
	public void play() {
		System.out.println("Son Playing cricket.....");
	}
}