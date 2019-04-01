package com.BridgeLabs.DataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UnOrderedListNew {
	
	public static void  main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		
		File file = new File("C:\\Users\\DIVYA.M\\Documents\\TTT\\Hello.txt");
		BufferedReader br= new BufferedReader(new FileReader(file));
		String str;
		
		while((str=br.readLine())!=null)
			String[] var=str.split("\s");
		for(String part:var){
			System.out.println(str);
		}
	}
	
	

}
