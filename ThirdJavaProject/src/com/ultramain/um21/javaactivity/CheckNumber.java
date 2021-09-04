package com.ultramain.um21.javaactivity;

public class CheckNumber {
	static int num;
	public static void main(String[] args){
		CheckNumber chk = new CheckNumber();
		chk.check(367);
		chk.check(821);
		if(check(num)){
			System.out.println(num+"is a inceasing number");
			
		}else{
			System.out.println(num+"is not a increasing number");
		}
		
	
	}
public static boolean check(int num){
	String str = Integer.toString(num);  
	char digit;  
	//flag set to true  
	boolean flag = true;  
	//iterates over the string up to length-1  
	for(int i=0;i < str.length()-1;i++)   
	{  
	digit = str.charAt(i);  
	//if any digit is greater than check next digit, it will not check further  
	if(digit > str.charAt(i+1))   
	{  
	//flag set to false if the condition returns true     
	flag = false;  
	break;  
	}      
	}  
	return flag;  
	}  
}





