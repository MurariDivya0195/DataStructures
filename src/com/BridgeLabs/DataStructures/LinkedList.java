package com.BridgeLabs.DataStructures;

public class LinkedList {
	
	Node head;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;  // the data that is coming from the user
		node.next=null;
		// check whether the head is empty or not
		
		if(head==null){
			head=node;
			
		}
		else
		{
			head=data;
		
			
		}
		
	}

}
