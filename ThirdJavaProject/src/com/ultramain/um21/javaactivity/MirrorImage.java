package com.ultramain.um21.javaactivity;

public class MirrorImage {
	public static void main(String[] args) {
		new MirrorImage().getImage("Earth");

	}

	public String getImage(String st) {
		StringBuffer buff = new StringBuffer(st);
		buff.reverse();
		System.out.println("Earth" + "|" + buff);
		return st;
	}
}
