package com.ultramain.um21.stringexcercise;

public class StringEx2 {
	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer("This is StringBuffer");
		bf.insert(20, "-This is a sample program");
		System.out.println(bf);
		bf.insert(21, "object");
		System.out.println(bf);
		bf.reverse();
		System.out.println(bf);
		StringBuffer bf1 = new StringBuffer("This is StringBuffer");
		// bf1.insert(20,"-This is a sample program");
		bf1.replace(14, 21, "Builder");
		System.out.println(bf1);

	}

}
