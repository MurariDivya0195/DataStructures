package com.BridgeLabs.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class DataStructureUtil {
	
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
		public static List<Integer> primeAnagrams(List<Integer> primes) {
			List<Integer> anagram= new ArrayList<Integer>();
			for (int i = 0; i < primes.size(); i++) {
				for (int j = i + 1; j < primes.size(); j++) {

					if (isAnagram(primes.get(i), primes.get(j))) {
						System.out.println(primes.get(i) + " " + primes.get(j));
						anagram.add(primes.get(i));
						anagram.add(primes.get(j));
					}
				}
			}
			return anagram;
		}

		// CHECKING THE ANAGRAMS OF THE NUMBERS

		public static boolean isAnagram(int n1, int n2) {
			int[] num1 = intArray(n1);
			int[] num2 = intArray(n2);
			if (num1.length != num2.length)
				return false;
			else {
				for (int i = 0; i < num1.length; i++) {
					if (num1[i] != num2[i])
						return false;
				}
			}
			return true;
		}

		// logic to print the count 
		public static int[] intArray(int n1) {
			int[] count = new int[10];
			int temp = n1;
			while (temp != 0) {
				int r = temp % 10;

				count[r]++;
				temp = temp / 10;
			}

			return count;
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
		
		
	// Logics to Write Read the input from scanner 
		
		static Scanner scanner1=new Scanner(System.in); //scanner class declaration

		//method for scanner class of integer type 
		/**
		 * static function to read integers input from the user
		 * @return integer values that are read
		 */
		public static int readInteger() {
			return scanner1.nextInt();}

		//method for scanner class of double type 
		/**
		 * static function to read double input from the user
		 * @return double values that are read
		 */
		public static double readdouble() {
			return scanner1.nextDouble();}

		//method for scanner class of String type 
		/**
		 * static function to read string input from the user
		 * @param file 
		 * @return strings that are read
		 */
		public static String readString() {
			return scanner1.next();}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
