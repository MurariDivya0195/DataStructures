package com.BridgeLabs.Util;

import java.util.*;

public class MyQueue {
	
	protected int Queue[];
	protected int front, rear, size, len;
	
	// ConSTRUCTOR
	
	public MyQueue(int n)
	{
		size=n;
		len=0;
		Queue=new int[size];
		front=-1;
		rear=-1;
	}
	
	// FUNCTION TO CHECK QUEQUE IS EMPTY
	
	public boolean isEmpty(){
		return front==-1;
	}
	
	// FUNCTION TO CHECK QUEUE IS FULL 
	
	public boolean isFull()
	{
		return front==0 && rear==size-1;
		
	}
	
	// FUNCTION TO GET THE SIZE OF THE QUEUE
	
	public int getSize()
	{
		return len;
		
	}
 // FUNCTION TO CHECK THE FRONT ELEMENT OF THE QUEUE
	
	public int peek()
	{
		if(isEmpty())
		
			System.out.println("underflow Exception");
			return Queue[front];
	}
	
	//  FNCTION TO INSERT AN ELEMENT TO THE QUEUE
	
	public void insert(int i)
	{
		if(rear==-1)
		{
			front=0;
			rear=0;
			Queue[rear]=i;
		}
		
		else if(rear+1 >=size)
			System.out.println("OverFlow");
		else if(rear+1<size)
			Queue[++rear]=i;
		len++;
		
	}
   
	/* FUNCTION TO REMOVE  FRONT ELEMENET  FROM A QUEUE */
	
	public int remove()
	{
		if(isEmpty())
			System.out.println("underflo Exception");
		else

			len--;
			int ele=Queue[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
				
				front++;
		
			return ele;
		

		
		
	}

	
	
	
	
	
	
	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

