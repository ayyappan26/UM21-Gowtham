package com.ultramain.um21.laptop;

public class Laptop {
	private String model;
	private String companyName;
	private String processorType;
	private String ramSize;
	private String purchaseYear;
	
	public Laptop(){
		
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProcessorType() {
		return processorType;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	public String getPurchaseYear() {
		return purchaseYear;
	}
	public void setPurchaseYear(String purchaseYear) {
		this.purchaseYear = purchaseYear;
	}
}
