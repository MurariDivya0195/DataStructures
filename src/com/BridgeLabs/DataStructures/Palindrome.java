package com.BridgeLabs.DataStructures;

import java.util.Scanner;

import com.BridgeLabs.Util.MyDequeue;

public class Palindrome {

	public static void main(String[] args) {
		MyDequeue<Character> dequeue = new MyDequeue<Character>();
		System.out.println("enter a String  to check :");
		Scanner sc = new Scanner(System.in);
		String word= sc.next();
		for(int i =0 ; i<word.length();i++)
		{
			char item=word.charAt(i);
			dequeue.addLast(item);
		}
		
		int flag=0;
		while(dequeue.size()>1)
		{
			if(dequeue.removeFront()!=dequeue.removeLast())
			{
				flag=1;
				break;
				
			}
			
		}
		
		if(flag==0)
		{
			System.out.println(word +  " is Palindrome");
		}
		
		else
			System.out.println( word + " is not a Palindrome");
	}
}
