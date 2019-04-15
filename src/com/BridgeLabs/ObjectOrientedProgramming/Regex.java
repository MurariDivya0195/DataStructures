package com.BridgeLabs.ObjectOrientedProgramming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.BridgeLabs.Util.DataStructureUtil;

public class Regex {

	public static void main(String[] args) throws IOException {
		File str = new File("C:\\Users\\DIVYA.M\\Documents\\TTT\\regex.txt");
		FileReader f = new FileReader(str);
		BufferedReader read = new BufferedReader(f);
		String line = " ";
		String word = "";
		try {

			while ((word = read.readLine()) != null) {
				line = word;

			}

			System.out.println(line);

		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("enter the First Name");
		String firstName = DataStructureUtil.readString();
		System.out.println("enter the last Name");
		String lastName = DataStructureUtil.readString();
		String fullName = firstName + " " + lastName;
		System.out.println("enter your 10 digit Mobile Number ");
		String phoneNumber = DataStructureUtil.readString();
		Date date = new Date();
		DateFormat dateformate = new SimpleDateFormat("dd//MM//yyyy");
		String formattedDate = dateformate.format(date);
		String message = replace(firstName, fullName, phoneNumber, formattedDate, line);
		System.out.println(message);

	}
		
		

		// Regex details
		static String replace(String firstName, String fullName, String phoneNumber, String date, String line) {
			final String REGEX_NAME = "<<name>>";
			final String REGEX_FULL_NAME = "<<full name>>";
			final String REGEX_CONTACT = "xxxxxxxxxx";
			final String REGEX_DATE = "01/01/2016";
			Pattern p1 = Pattern.compile(REGEX_NAME);
			Matcher m1 = p1.matcher(line);
			line = m1.replaceAll(firstName);

			Pattern p2 = Pattern.compile(REGEX_FULL_NAME);
			Matcher m2 = p2.matcher(line);
			line = m2.replaceAll(fullName);

			Pattern p3 = Pattern.compile(REGEX_CONTACT);
			Matcher m3 = p3.matcher(line);
			line = m3.replaceAll(phoneNumber);

			Pattern p4 = Pattern.compile(REGEX_DATE);
			Matcher m4 = p4.matcher(line);
			line = m4.replaceAll(date);
			return line;
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

