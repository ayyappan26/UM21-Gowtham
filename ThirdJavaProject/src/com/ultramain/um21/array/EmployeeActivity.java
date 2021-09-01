package com.ultramain.um21.array;

import java.util.Scanner;

public class EmployeeActivity {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of employees :");
		int size = scan.nextInt();
		Employee myemployee[] = new Employee[size];

		for (int i = 0; i < size; i++) {

			Employee employee = new Employee();
			System.out.println("Entering details of the employee - " + (i + 1));
			System.out.println("Enter Employee Id :");
			employee.setEmpId(scan.nextInt());
			System.out.println("Enter Employee First Name :");
			employee.setFirstName(scan.next());
			System.out.println("Enter Employee Last Name :");
			employee.setLastName(scan.next());
			System.out.println("Enter Employee Salary :");
			employee.setSalary(scan.nextFloat());
			System.out.println("Enter Employee Department");
			employee.setDept(scan.next());
			System.out.println("---------------------------");
			myemployee[i] = employee;
		}

		EmployeeActivity.printDetails(myemployee);
		scan.close();
	}

	public static void printDetails(Employee employee[]) {

		for (int i = 0; i < employee.length; i++) {
			Employee employee1 = employee[i];
			System.out.println("Details of the employee - " + (i + 1));
			System.out.println("EmployeeId :" + employee1.getEmpId());
			System.out.println("Employee First Name :" + employee1.getFirstName());
			System.out.println("Employee Last Name :" + employee1.getLastName());
			System.out.println("Employee Salary : " + employee1.getSalary());
			System.out.println("Employee Department :" + employee1.getDept());
			System.out.println("---------------------------------------");

		}
	}
}

class Employee {
	int empId;
	String firstName;
	String lastName;
	float salary;
	String dept;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}