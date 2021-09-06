package com.ultramain.um21.employeeproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {
	public void registerEmployee(EmployeeDTO empDto) throws SQLException{
		Connection con = DataConnect.getDbConnection();
		
		String sql = "INSERT INTO emp VALUES(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmpId());
		pst.setString(2, empDto.getFirst_Name());
		pst.setString(3, empDto.getLast_Name());
		pst.setFloat(4, empDto.getSalary());
		pst.setInt(5, empDto.getMobile());
		pst.setString(6, empDto.getDept());
		int rowsUpdated = pst.executeUpdate();
		
		System.out.println("Rows Updated :" + rowsUpdated);
	   
   }
	public void viewEmployees() throws SQLException{
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "select * from emp";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		ResultSet rs = pst.executeQuery(sqlQuery);
		
		int empId;
		String first_Name;
		String last_Name;
		float salary;
		int mobile;
		String dept;
		
		while(rs.next()){
			empId = rs.getInt("Employee_id");
			first_Name = rs.getString(2);
			last_Name = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			dept = rs.getString(6);
			
			System.out.println("Employee id : " + empId);
			System.out.println("First Name : " + first_Name);
			System.out.println("Last Name : " + last_Name);
			System.out.println("Salary : " + salary);
			System.out.println("Mobile : " + mobile);
			System.out.println("Department : " +  dept);
			System.out.println("----------------------------------");
		}
}
}
