package com.BridgeLabs.DataStructures;

import java.util.Scanner;

import com.BridgeLabs.Util.DataStructureUtil;
import com.BridgeLabs.Util.MyStack;

public class BalancedParenthesis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter max size:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		/* Creating Stack */
		 
		MyStack stack= new MyStack(n);
		//Input
		
		System.out.println("Enter Expressions");
		String exp=sc.next();
		System.out.println(DataStructureUtil.paranthesisChecking(stack, exp));
	}
}
