package com.ultramain.um21.test;

import com.ultramain.um21.bank.Bank;

public class Test {

public static void main (String[] args){
	
	
	Bank.setBankName();
	Bank user1 = new Bank();
	user1.setAccountNumber();
	//user1.setBankName();
	user1.setDepositAmount();
	user1.setUserName();
	
	
	Bank user2 = new Bank();
	user2.setAccountNumber();
	//user2.setBankName();
	user2.setDepositAmount();
	user2.setUserName();
	
	Bank user3 = new Bank ();
	user3.setAccountNumber();
	//user3.setBankName();
	user3.setDepositAmount();
	user3.setUserName();
	
	user1.viewBalance();
	user2.viewBalance();
	user3.viewBalance();
	
	
}
	
}
