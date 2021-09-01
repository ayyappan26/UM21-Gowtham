package com.ultramain.um21.array;

import java.util.Scanner;

public class EmployeeService {
       public EmployeeDTO[] getEmployeeDetails(){
    	   
    	   Scanner scan = EmployeeUtility.getScannerInstance();
    	   System.out.println("Enter Number of employees:");
    	   int size = scan.nextInt();
    	   EmployeeDTO employee[] = new EmployeeDTO[size];
    	   EmployeeDTO empdto = null;
    	   for(int i=0;i<size;i++){
    		   
    		   empdto = new EmployeeDTO();
    		   System.out.println("Enter the details of employee -" + (i+1));
    		   System.out.println("Enter Employee Id :");
    		   empdto.setEmpId(scan.nextInt());
    		   System.out.println("Enter Employee FirstName :");
    		   empdto.setFirstName(scan.next());
    		   System.out.println("Enter Employee LastName :");
    		   empdto.setLastName(scan.next());
    		   System.out.println("Enter Employee Salary :");
    		   empdto.setSalary(scan.nextFloat());
    		   System.out.println("Enter Employee Department :");
    		   empdto.setDept(scan.next());
    		   System.out.println("-------------------------------");
    		   
    		   employee[i] = empdto;
    	   }
    	   return employee;
       }
       
       public void printEmployeeDetails(EmployeeDTO[] empdetails){
    	   
    	   System.out.println("Display Employee details");
    	   
    	   EmployeeDTO empdto = null;
    	   for(int i=0;i<empdetails.length;i++){
    		   
    		   empdto = empdetails[i];
    		   System.out.println("Printing the employee details "+ (i+1));
    		   System.out.println("Employee Id         :" + empdto.getEmpId());
    		   System.out.println("Employee FirstName  :" + empdto.getFirstName());
    		   System.out.println("Employee LastName   :" + empdto.getLastName());
    		   System.out.println("Employee Salary     :" + empdto.getSalary());
    		   System.out.println("Employee Department :" + empdto.getDept());
    		   System.out.println("-----------------------------------------");
    	   }
    	   
       }
}
