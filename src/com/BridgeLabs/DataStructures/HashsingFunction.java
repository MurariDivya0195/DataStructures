package com.BridgeLabs.DataStructures;

import java.util.Scanner;

import com.BridgeLabs.Util.NodeUtility;
import com.BridgeLabs.Util.OrderredLinkedList;

public class HashsingFunction {
	
	
  	OrderredLinkedList[] order=new OrderredLinkedList[11];
  	NodeUtility nu=new NodeUtility();

  	public  HashsingFunction()
  	{
		int[] retArray = nu.integerFileReader();

		for(int i=0; i<retArray.length; i++)
		{
			int rem = retArray[i]%11;
			if(order[rem]== null)
			{
				order[rem] = new OrderredLinkedList();
				order[rem].addItem(retArray[i]);
			}
			else
			{
				order[rem].addItem(retArray[i]);
            }
		}
		for(int i=0;i<11;i++)
		{
			System.out.println(i+"-->" );
			if(order[i] !=null)
			{
				order[i].display();
			}
		}
	}

    public static void main(String[] args)
    {
      	HashsingFunction hs=new HashsingFunction();
    }

}
