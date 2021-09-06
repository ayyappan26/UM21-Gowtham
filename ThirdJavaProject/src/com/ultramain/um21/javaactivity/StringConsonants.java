package com.ultramain.um21.javaactivity;

import java.util.Scanner;

public class StringConsonants {
	public static void main(String[] args){
		StringConsonants replaceConsonants = new StringConsonants();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String input = scanner.next();
		
		System.out.println("Replaced String :  " + replaceConsonants.alterString(input));
		
		scanner.close();
		
	}
	public String alterString(String str){
		String string = "";
		char[] ch=  str.toCharArray();
		int val = 0;
		for(int i = 0;i < ch.length; i++)
		{
			if(ch[i] != 'a' || ch[i] != 'e' || ch[i] != 'i' || ch[i] != 'o' || ch[i] != 'u' || ch[i] != 'A' || ch[i] != 'E' || ch[i] != 'I' || ch[i] != 'O' || ch[i] != 'U') 
			{
				val=ch[i]+1;
			    char c=(char)val;
			    string = string + c;
			}
			else
			{
				string += ch[i];
			}
		}
		return string;
	}

}
