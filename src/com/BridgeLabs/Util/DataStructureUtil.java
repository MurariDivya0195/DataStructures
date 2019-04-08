package com.BridgeLabs.Util;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class DataStructureUtil {
	public static void main(String[] args) throws Exception  {
		ArrayList<String> arrayList = new ArrayList<String>();
		File file =new File("C:\\Users\\DIVYA.M\\Documents\\TTT\\Hello.txt");
		Scanner sc = new Scanner(file);
		System.out.println("enter the String to add in the text file");
		Scanner input = new Scanner(System.in);
		String str=input.next();
		while(sc.hasNext())
				{
				
				arrayList.add(sc.next());
	}
		
		for(String s:arrayList)
		{
			System.out.println(s);
		}
		
		
		
		arrayList.remove("divya");
		System.out.println("Now the size of the arrayList:" + arrayList.size());
	//let us print all the available values in the list
		
		/*for(String s1 : arrayList)
		{
			System.out.println(s1);
		}
		*/
		if(arrayList.contains(str))
		{
			arrayList.remove(str);
		}
		
		else
			arrayList.add(str);
		
	
		
	for(String s1 : arrayList)
	{
		System.out.println(s1);
	}
	}
	
	
	/****************************************************************************************************************
	 * LOGIC TO BALANCED PARENTHESIS
	 * @param stack
	 * @param exp
	 * @return
	 * @throws Exception
	 ****************************************************************************************************************/
	
	
	public static boolean paranthesisChecking(MyStack stack, String exp) throws Exception {
        int len = exp.length();
        System.out.println("Matches and Mismatches: ");

        for (int i = 0; i < len; i++)
        {    
        char ch = exp.charAt(i);

            if (ch == '('||ch=='{'||ch=='[')
            {
            stack.push(i);
            }
                else if (ch == ')'||ch=='}'||ch==']')
                {
                    stack.pop();
                }            
            }
        while (!stack.isStackEmpty() )
        {
        return false;
        }
        return true;
    }

	
	/***********************************************************************************************************
	leap year	
	******************************************************************************/
	
	public static int day(int month, int day, int year){
		int y= year-(14-month)/12;
		int x=y+y/4-y/100+y/400;
		int m= month+12*((14-month)/12)-2;
		int d=(day+ x+(31*m)/12)%7;
		return d;
	}	
		
		// return true if the given year is leap year
		
		public static boolean isLeapyear(int year)
		{
			if((year%4==0) && (year%100!=0))
			return true;
			if(year%400==0)
				return true;
			return false;
		}
		
		// LOGIC TO PRINT ANAGRAM
		public static boolean isAnagram(char[] s1, char[] s2) {
			// TODO Auto-generated method stub

			int n1 = s1.length;
			int n2 = s2.length;
			if (n1 != n2)
				return false;

			Arrays.sort(s1);
			Arrays.sort(s2);

			for (int i = 0; i < n1; i++)
				if (s1[i] != s2[i])
					return false;
			return true;

		}

		// logic TO PRINT THE PRIME NUMBERS

		public static List<Integer> primeNumber(int n) {
			List<Integer> a = new ArrayList<>();
			int i, j, k;
			for (i = 2; i <= n; i++) {
				k = 0;
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						k = 1;
						break;
					}
				}

				if (k == 0) {
					a.add(i);
				}

			}
			return a;

		}


		public static List<Integer> isAnagram(List<Integer> primes) {
			// TODO Auto-generated method stub
			return null;
		}

		// Logic to print the binary tree
		
		public static int binominalCoeff(int n, int k)
		{
			int res=1;
			if(k>n-k)
				k=n-k;
			for(int i=0;i<k;++i){
				res *=(n-1);
				res /=(i+1);
			}
			
			return res;
		}
		
		public static int binaryCount(int n){
			
			int c=binominalCoeff(2*n,n);
			int count=c/(n+1);
			return count;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
