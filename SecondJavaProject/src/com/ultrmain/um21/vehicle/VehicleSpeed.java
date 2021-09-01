package com.ultrmain.um21.vehicle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VehicleSpeed {
    public static void main(String[] args){
    	TestVehicle myspeed = new TestVehicle(60);
    	myspeed.getvehiclespeed();
    	myspeed.steering();
    	myspeed.brake();
    }
}
class TestVehicle{
	int speed;
	String name;
	
public TestVehicle(int speed){
	this.speed=speed;
}
public TestVehicle(){
	
}

public void getvehiclespeed(){
  SimpleDateFormat myobj = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
   Date mydate = new Date();
   int hours  = mydate.getHours();
   //System.out.println(mydate);
   System.out.println(myobj.format(mydate));

if(hours>=1 && hours<=18){
		speed = speed + 20;
		System.out.println("Vehicle speed:"+speed);
	}
else
{
	speed = speed - 20;
	System.out.println("Vehicle speed:" + speed);
}
}
public void steering(){
	System.out.println("Vehicle has manual steering.....");
}
public void brake(){
	System.out.println("Vehicle has power brake.....");
}
}

