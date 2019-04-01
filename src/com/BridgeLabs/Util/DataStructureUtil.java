package com.BridgeLabs.Util;
import java.io.*;
import java.util.ArrayList;
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
