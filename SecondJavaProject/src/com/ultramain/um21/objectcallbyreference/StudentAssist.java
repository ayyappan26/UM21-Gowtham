package com.ultramain.um21.objectcallbyreference;

import java.util.Scanner;

public class StudentAssist {
	public void getStudentDetails(StudentDTO student){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter StudentId: ");
		student.setStudentId(scan.nextInt());
		System.out.println("Enter StudentName :");
		student.setStudentName(scan.next());
		System.out.println("Enter Department :");
		student.setDept(scan.next());
	}

	public void printStudentDetails(StudentDTO student) {
       
		System.out.println("Student Id   :" + student.getStudentId());
		System.out.println("Student Name :" + student.getStudentName());
		System.out.println("Student Dept :" + student.getDept() );
	}
}