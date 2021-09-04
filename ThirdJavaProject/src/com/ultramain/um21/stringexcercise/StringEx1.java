package com.ultramain.um21.stringexcercise;

public class StringEx1 {
	public static void main(String[] args) {
		String str = "Welcome to Java World";
		System.out.println(str);
		char ch = str.charAt(5);
		System.out.println(ch);
		String str2 = "Welcome";
		System.out.println(str.equalsIgnoreCase(str2));
		str = str.concat("-Let us learn");
		System.out.println(str);
		String rep = str.replace('a', 'e');
		System.out.println(rep);
		String sub = str.substring(4, 10);
		System.out.println(sub);
		String low = str.toLowerCase();
		System.out.println(low);

	}
}
