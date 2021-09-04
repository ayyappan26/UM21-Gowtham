package com.ultramain.um21.stringexcercise;

import java.io.File;

public class StringEx3 {
	public static void main(String[] args){
		String path = new String( "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		File fl = new File(path);
		String str =fl.getParent();
		System.out.println("1.Drive  : " + str.substring(0,3));
		String str1  = str.replaceAll("\\\\", "||");
		String str2 = str1.substring(4);
		System.out.println("2.Folder : " + str2);
		System.out.println("3.File   : " + fl.getName());		
		
	}

}
