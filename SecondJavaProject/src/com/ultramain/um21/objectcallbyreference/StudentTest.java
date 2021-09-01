package com.ultramain.um21.objectcallbyreference;

public class StudentTest {
 public static void main(String[] args){
	 StudentDTO mystudent = new StudentDTO();
	 StudentAssist myassist = new StudentAssist();
	 
	 myassist.getStudentDetails(mystudent);
	 myassist.printStudentDetails(mystudent);
	 
 }
}
