package com.ultramain.um21.writefile;

import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class WriteFile {
	public static void main(String[] args){
		try{
			writeToFile();
		}
		catch(IOException e){
			System.out.println("Exception Handled..");
		}
		
}

public static void writeToFile() throws IOException{
	FileWriter myfile=new FileWriter("E:\\Gowtham\\Write.txt");
	BufferedWriter br=new BufferedWriter(myfile);
	
	br.write("Hi...");
	br.write("Hello...");
	br.write("Good morning...");
	br.close();
}

}

