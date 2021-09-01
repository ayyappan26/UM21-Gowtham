package com.ultramain.um21.inheritanceactivity;

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager mymanager = new Manager(126534L, "Peter", "Chennai India", 237844L, 65000D);
		System.out.println("Salary of Manager :");
		mymanager.calculateSalary();
		mymanager.calculateTransportAllowance(mymanager.basicSalary);
		System.out.println("-----------------------------------------------------");
		Trainee mytrainee = new Trainee(29846L, "Jack", "Mumbai India", 442085L, 45000D);
		System.out.println("Salary of Trainee :");
		mytrainee.calculateSalary();
		mytrainee.calculateTransportAllowance(mytrainee.basicSalary);

	}
}

class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;

	public Employee() {

	}

	public Employee(long Id, String Name, String Address, long Phone) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
	}

	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * Hra / 100);
		System.out.println(salary);
	}

	public void calculateTransportAllowance(double salary) {
		double transportallowance;
		transportallowance = 10 * salary / 100;
		System.out.println("Transport Allowance of Trainee : " + transportallowance);

	}
}

class Manager extends Employee {

	public Manager() {

	}

	public Manager(long Id, String Name, String Address, long Phone, double salary) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
		this.basicSalary = salary;
	}

	public void calculateTransportAllowance(double salary) {
		double transportallowance;
		transportallowance = 15 * salary / 100;
		System.out.println("Transport Allowance of Manager :" + transportallowance);

	}

}

class Trainee extends Employee {

	public Trainee() {

	}

	public Trainee(long Id, String Name, String Address, long Phone, double salary) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
		this.basicSalary = salary;
	}

}