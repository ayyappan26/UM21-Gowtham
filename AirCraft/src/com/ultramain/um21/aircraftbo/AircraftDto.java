package com.ultramain.um21.aircraftbo;

import java.util.Date;

public class AircraftDto {
   private String aircraftCode;
   private String description;
   private String sectorCode;
   private String fromStation;
   private String toStation;
   private Date scheduleDate;
   private int scheduleTime;

   
 public String getAircraftCode() {
	return aircraftCode;
}
public void setAircraftCode(String aircraftCode) {
	this.aircraftCode = aircraftCode;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getSectorCode() {
	return sectorCode;
}
public void setSectorCode(String sectorCode) {
	this.sectorCode = sectorCode;
}
public String getFromStation() {
	return fromStation;
}
public void setFromStation(String fromStation) {
	this.fromStation = fromStation;
}
public String getToStation() {
	return toStation;
}
public void setToStation(String toStation) {
	this.toStation = toStation;
}
public Date getScheduleDate() {
	return scheduleDate;
}
public void setScheduleDate(Date scheduleDate) {
	this.scheduleDate = scheduleDate;
}
public int getScheduleTime() {
	return scheduleTime;
}
public void setScheduleTime(int scheduleTime) {
	this.scheduleTime = scheduleTime;
}
   
   
}
