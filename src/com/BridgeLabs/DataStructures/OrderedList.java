package com.BridgeLabs.DataStructures;

import org.w3c.dom.Node;

public class OrderedList<T extends Comparable<T>> {
	
	
		Node head;
		Node tail;
		int size =0;
		
		public void add( T data)
		{
			Node n= head;
			Node temp=new Node(data);
			size++;
			
			if(head==null)
			{
				head=temp;
				head.next=tail;
				tail=head;
			}
			else if(data.compareTo(T) head.data)<0)


{
	temp.next=head;
	head=temp;
	
	
}


		}
	

}
