package com.ultramain.um21.casting;

public class TypeCatsing {
   public static void main(String[] args){
	   Redmi myredmi = new Redmi();
	   Oneplus myoneplus = new Oneplus();
	   
	   Displays mydisplay = new Displays();
	   mydisplay.displayMobiles(myoneplus);
   }
}
class Electronics {
	public void product(){
		System.out.println("Electronic product....");
	}
}
class Mobile extends Electronics{
	public void mobile(){
		System.out.println("Mobiles are one of the electronics.....");
	}
	public void video(){
		System.out.println("Video capture in mobile....");
	}
}
class Redmi extends Mobile{
	public void mobile(){
		System.out.println("Redmi mobiles.....");
	}
	public void storage(){
		System.out.println("It have 64GB Stroge.....");
	}
	public void battery(){
		System.out.println("Battery capacity is 5000mah.....");
	}
}
class Oneplus extends Mobile{
	public void mobile(){
		System.out.println("Oneplus mobiles....");
	}
	public void camera(){
		System.out.println("It have front and back camera.....");
	}
}

class Displays{
	public void displayMobiles(Mobile obref){
		
		if(obref instanceof Redmi){
			Redmi myredmi = (Redmi)obref;
			myredmi.mobile();
			myredmi.storage();
			myredmi.battery();
			myredmi.video();
			myredmi.product();

		}
		if(obref instanceof Oneplus){
			Oneplus myoneplus = (Oneplus)obref;
			myoneplus.mobile();
			myoneplus.camera();
			myoneplus.video();
			myoneplus.product();
			
		}
	}
}