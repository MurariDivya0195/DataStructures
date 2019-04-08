package com.BridgeLabs.Util;

public class MyQueue1 {
	private int arr[];
	private  int front=0;
	private  int last=-1;
	private int capacity;
	private int count=0;
	
	public MyQueue1(int size)
	{
		this.capacity=size;
		arr=new int[this.capacity];
		
	}
	
	
	//To add the elements in to the list
	
	public void add(int values)
	{
		if(isFull()){
			System.out.println("cant able to take");
		}
		else
		{
			last=(last+1)%capacity;
			arr[last]=values;
			count++;
		}
	}
	
	// To remove the elements into the list
		public void remove()
		{
			if(isFull()){
				System.out.println(" cant able to remove the element");
			}else
			{
				front=(front+1)%capacity;
				System.out.println(" removed");
				count--;
		}
		
	}
		
		//checking whether it is empty or not
		
		public boolean isEmpty()
		{
			if(size()==0){
				return true;
			}else
				return false;
		}
		
	// checking whether it is full or not
		
		public boolean isFull()
		{
			if(size()==capacity)
			{
				return true;
			}
			else
				return false;
		}
	// to check the size
		
		public int size()
		{
			return count;
		}

}
