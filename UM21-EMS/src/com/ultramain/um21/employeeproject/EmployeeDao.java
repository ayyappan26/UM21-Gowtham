package com.ultramain.um21.employeeproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Admin This class used to insert new values to database and get data
 *         from database
 */
public class EmployeeDao {
	public void registerEmployee(EmployeeDTO empDto) throws SQLException {
		Connection con = DataConnect.getDbConnection();

		String sql = "INSERT INTO emp VALUES(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, empDto.getEmpId());
		pst.setString(2, empDto.getFirstName());
		pst.setString(3, empDto.getLastName());
		pst.setFloat(4, empDto.getSalary());
		pst.setInt(5, empDto.getMobile());
		pst.setString(6, empDto.getDept());
		int rowsUpdated = pst.executeUpdate();

		System.out.println("Rows Updated :" + rowsUpdated);

	}

	public void viewEmployees() throws SQLException {
		Connection con = DataConnect.getDbConnection();
		String sqlQuery = "select * from emp";
		PreparedStatement pst = con.prepareStatement(sqlQuery);
		ResultSet rs = pst.executeQuery(sqlQuery);

		int empId;
		String firstName;
		String lastName;
		float salary;
		int mobile;
		String dept;

		while (rs.next()) {
			empId = rs.getInt("Employee_id");
			firstName = rs.getString(2);
			lastName = rs.getString(3);
			salary = rs.getFloat(4);
			mobile = rs.getInt(5);
			dept = rs.getString(6);

			System.out.println("Employee id : " + empId);
			System.out.println("First Name : " + firstName);
			System.out.println("Last Name : " + lastName);
			System.out.println("Salary : " + salary);
			System.out.println("Mobile : " + mobile);
			System.out.println("Department : " + dept);
			System.out.println("----------------------------------");
		}
	}
}
