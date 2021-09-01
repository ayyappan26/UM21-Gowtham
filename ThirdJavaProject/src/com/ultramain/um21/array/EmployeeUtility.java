package com.ultramain.um21.array;

import java.util.Scanner;

public class EmployeeUtility {
	private static Scanner scanner;

	private EmployeeUtility() {
	}

	public static Scanner getScannerInstance() {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;

	}

}
