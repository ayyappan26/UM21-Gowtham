package com.ultramain.um21.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args){
		new ReadFile().viewReadFile();
	}
	public void readFromFile(){
		File myfile=new File("E:\\Gowtham\\Read.txt");
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader(myfile));
			String str;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			
		}catch(FileNotFoundException f){
			System.out.println("file not found exception");
		}catch(IOException e){
			System.out.println("io exception occured");
		}
	}
	public void viewReadFile(){
		readFromFile();
	}

}
