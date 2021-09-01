package com.ultramain.um21.bank;

import java.util.Scanner;

public class Bank {
public static String bankName;
private int accountNumber;
private float depositAmount;
private String userName;

static Scanner scan = new Scanner(System.in);
/*public static void setBankName(){
	Scanner bank = new Scanner(System.in);
	System.out.println("Enter Bank Name:");
	String bankName = bank.nextLine();
	System.out.println("Bank Name  :" + bankName);
}
public void setAccountNumber(){
	Scanner account = new Scanner(System.in);
	System.out.println("Enter Account Number:");
	int accountNum = account.nextInt();
	System.out.println("Account Number :" + accountNum);
}
public void setDepositAmount(){
	Scanner deposit = new Scanner(System.in);
	System.out.println("Enter Deposit Amount:");
	float depositAmt = deposit.nextFloat();
	System.out.println("Deposit Amount :" + depositAmt);
	
	if(depositAmt > 0){
		depositAmount = depositAmount + depositAmt;
	}else{
		System.out.println("Insufficient Balance");
	}
}
public void setUserName(){
	Scanner user = new Scanner(System.in);
	System.out.println("Enter User Name:");
	String userName = user.nextLine();
	System.out.println("User Name  :" + userName);
}
public void viewBalance(){
	
	
	
}*/

public String getBankName() {
	return bankName;
}
public static void setBankName() {
	System.out.println("Enter bankname :");
	String bank = scan.nextLine();
	bankName = bank;
	
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber() {
	System.out.println("Enter accountNumber :");
	 int accountNumber = scan.nextInt();
	this.accountNumber = accountNumber;
}
public float getDepositAmount() {
	return depositAmount;
}
public void setDepositAmount() {
	System.out.println("Enter deposit number:");
	int depositAmount = scan.nextInt();
	this.depositAmount = depositAmount;
}
public String getUserName() {
	return userName;
}
public void setUserName() {
	System.out.println("Enter username:");
	String userName = scan.next();
	System.out.println("------------------------");
	this.userName = userName;
}

public void viewBalance(){
	System.out.println("Bank Name :"+ bankName);
	System.out.println("Account Number :"+ accountNumber);
	System.out.println("Deposit Amount :"+ depositAmount);
	System.out.println("User Name :"+ userName);
	System.out.println("----------------------------------");
}
}

