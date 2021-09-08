package com.ultramain.um21.aircraftbo;

import com.ultramain.um21.aircraftbo.AircraftDto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.ultramain.um21.aircraftDao.IDao;
import com.ultramain.um21.aircraftfactory.AbstractFactory;

public class AircraftBo {
	public void airSystem(){
		
		int choice = 0;
		Scanner scan = Scan.getScannerInstance();
		do{
		System.out.println("Welcome to Aircraft");
		System.out.println("1.Register Aircraft");
		System.out.println("2.Register Sector");
		System.out.println("3.View sector");
		System.out.println("Enter your Choice : ");
		choice = scan.nextInt();
		}while(choice == 0);
	
		switch(choice) {
		case 1:
			registerAircraft();
			break;
		case 2:
			viewAircraft();
			registerSector();
			break;
		case 3:
			viewSector();
			break;
		}
	}
	public void registerAircraft(){
		
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		
		AircraftDto dto = getAircraft();
		try{
			dao.registerAircraft(dto);
		}catch(SQLException e){
			System.out.println(e.getMessage());
			
		}
	}

	public void registerSector(){
		
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		
		AircraftDto dto = getAircrafts();
		try{
			dao.registerSector(dto);
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	public void viewAircraft(){
		
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		
		try{
			System.out.println("Available aircrafts...");
			dao.viewAircraft();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	
public void viewSector(){
	
	
		ArrayList<AircraftDto> airList=null;
		HashMap<String,ArrayList<AircraftDto>> airmap=null;
		AbstractFactory factory = AbstractFactory.getFactory(1);
		IDao dao = factory.getDao();
		try{
			airmap= dao.viewSector();
			System.out.println("Enter the Aircraft Code");
			Scanner sc=Scan.getScannerInstance();
			String str=sc.next();
			airList=airmap.get(str);
			if(!airList.isEmpty()){
				for(AircraftDto adto:airList){
					System.out.println("Sector Id :"+adto.getSectorCode());
					System.out.println("Aircraft code:"+adto.getAircraftCode());
					System.out.println("From station :"+adto.getFromStation());
					System.out.println("To Station  :"+adto.getToStation());
					System.out.println("Schedule Date :"+adto.getScheduleDate());
					System.out.println("Schedule Time :"+adto.getScheduleTime());
					System.out.println("----------------------------------");
				}
			}
			
			
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
}
		
		
	
	
	private AircraftDto getAircraft(){
		Scanner scan = Scan.getScannerInstance();
		AircraftDto dto  = new AircraftDto();
		System.out.println("Enter Aircraft Code : ");
		dto.setAircraftCode(scan.next());
		System.out.println("Enter Description : ");
		dto.setDescription(scan.next());
		return dto;
	}
	
	private AircraftDto getAircrafts(){
		Scanner scan = Scan.getScannerInstance();
		AircraftDto dto = new AircraftDto();
		System.out.println("Enter Sector Code : ");
		dto.setSectorCode(scan.next());
		System.out.println("Enter Aircraft Code : ");
		dto.setAircraftCode(scan.next());
		System.out.println("Enter FromStation : ");
		dto.setFromStation(scan.next());
		System.out.println("Enter ToStation : ");
		dto.setToStation(scan.next());
		//System.out.println("Enter Scheduled Date : ");
		//dto.setScheduleDate(scan.next());
		System.out.println("Enter Scheduled Time : ");
		dto.setScheduleTime(scan.nextInt());
		return dto;
		
	}
	
}
