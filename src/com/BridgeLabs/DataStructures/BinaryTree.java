package com.BridgeLabs.DataStructures;

import java.util.Scanner;
import java.util.function.Function;

import com.BridgeLabs.Util.DataStructureUtil;

public class BinaryTree {
	
	public static void main(String[] args) {
		
		System.out.println("enter no of nodes");
		Scanner sc = new Scanner(System.in);
		int nodes=sc.nextInt();
		int[] intArr= new int[nodes];
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println("enter the "+ i + "th number :");
			intArr[i]=sc.nextInt();
		}
		int[] numbertimes= new int[intArr.length];
		for(int i=0;i<intArr.length;i++)
		{
			numbertimes[i]=DataStructureUtil.binaryCount(intArr[i]);
		}
		for(int i=0;i<numbertimes.length;i++)
		System.out.println("count of BST possibilities for " + intArr[i] + " nodes is " +numbertimes[i]);
	}

}
