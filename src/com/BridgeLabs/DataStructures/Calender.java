package com.BridgeLabs.DataStructures;

public class Calender {

	
/***************************************************************************************************************
 * Given the month day, and year, return which day
 * of the week it falls on according to the Gegorian calender
 * For month, use 1 for January, 2 for February and so forth,
 * Returns 0 for sunday, 1 for Monday, and so forth.	
*****************************************************************************************************************
 */
	
	public static int day(int month, int day,int year)
	{
		int y =year-(14-month)/12;
		int x=y+ y/4-y/100+y/400;
		int m=month+12 * ((14-month)/12)-2;
		int d=(day+x+(31*m)/12)%7;
		return d;
	}
	
	// return true if the given year is a leap year
	
	public static boolean isLeapYear(int year)
	{
		
		if((year %4 ==0)&&(year %100!=0)) return true;
		if(year% 400==0)return true;
		return false;
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int month=Integer.parseInt(args[0]); // month (jan=1, dec=12)
		int year=Integer.parseInt(args[1]); // year
		
		String[] months={"", "january", "february","March", "April", "May", "June", "July","August", "September",
				        "October", "November", "December"};
		int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
		//check for leap year
		
		if(month==2 && isLeapYear(year))
			days[month]=29;
		
		//print calender header
		System.out.println(" " +months[month]+ " " + year);
		System.out.println(" S  M  T  W  TH F  S");
		
		//starting day
		int d=day(month,1,year);
		
		//print the calender
		
		for(int i=0;i<d;i++)
			System.out.print("   ");
		for(int i=1;i<=days[month];i++)
		{
			System.out.printf("%2d " , i);
			if(((i+d)%7==0)||(i==days[month]))
				System.out.println();
			
		}
		
	
	}

	
	
}
