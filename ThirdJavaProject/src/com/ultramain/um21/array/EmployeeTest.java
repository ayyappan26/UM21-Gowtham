package com.ultramain.um21.array;

public class EmployeeTest {
	public static void main(String[] args){
		EmployeeService empservice = new EmployeeService();
		
		EmployeeDTO empdto[] = empservice.getEmployeeDetails();
		empservice.printEmployeeDetails(empdto);
				
				
	}

}
