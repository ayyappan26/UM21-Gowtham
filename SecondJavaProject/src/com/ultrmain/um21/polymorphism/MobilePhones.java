package com.ultrmain.um21.polymorphism;

public class MobilePhones {

	public static void main(String[] args){
		Specification myspec = new Specification("32mp","128mp","16GB");
		//Specification myspec = null;
		myspec.mobilespecification("5000mah");
		myspec.mobile();
		myspec.mobile("128GB");
		myspec.mobile("Oneplus",40000);
	}
}
class Mobiles{
	public void mobile(){
		System.out.println("Mobile Price.......");
	}
}
class MobileBrands extends Mobiles{
	public void mobilespecification(){
		System.out.println("Mobile brands are:");
	}
	public void mobile(String memory){
		System.out.println("Mobile memory :"+memory);
	}
	public void mobile(String name,int price){
		System.out.println("Mobile name :"+ name +""+price);
		//System.out.println("Mobile price :"+ price);
	}
	
}
class Specification extends MobileBrands{
	public Specification(){
		System.out.println("Mobile specification.....");
	}
	public Specification(String frontcamera,String backcamera,String RAM){
		System.out.println("Frontcamera :"+frontcamera);
		System.out.println("Backcamera :"+backcamera);
		System.out.println("RAM :"+RAM);
	}
	public void mobilespecification(String battery){
		System.out.println("Mobile battery capactiy : "+ battery);
	}
	public void mobile(){
		System.out.println("Mobiles.............");
	}
}