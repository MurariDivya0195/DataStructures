package com.BridgeLabs.Util;

public class QueueLinkedList<T> {
	
	/* 
	 * front and rear are the type of nodes
	 * which are declared as private 
	 * to achieve encapsulation 
	 * 
	 */
	
	public Node<T> front, rear;
	public int size=0;
	
	/*
	 * Constructor to intialize the
	 * instance variables of the
	 * class
	 * 
	 */

	public QueueLinkedList()
	{
		front=null;
		rear=null;
		size=0;
		
	}
	
	/*
	 * funtion to check if the queue is empty or not
	 * 
	 * @return true if empty else false
	 * 
	 */
	
	 public  boolean isQueueEmpty()
	 {
		 return front==null;
	 }
	 
	 /*
	  * Funtion  to get the size of the queue
	  * @return size
	  */
	public int getSize(){
		return size;
	}
	
	/**
	 * Function to insert the element at the specific location
	 * 
	 * @param data the element to be inserted into the queue
	 */
	public void insert(T data)
	{
		Node<T> node =new Node<T>(data, null);
		if(rear==null){
			front=node;
			rear=node;
	 }
		else{
			
			rear.setNextRef(node);
			rear=rear.getNextRef();
		}
		size++;
	}
	
	/**
	* Function to remove the element
	*
	* @return the deleted element
	*/
	public T remove(){
	if(isQueueEmpty())
	{
	System.out.println("Underflow");
	}
	Node<T> curr=front;
	front = curr.getNextRef();
	if (front == null){
	rear = null;
	size-- ;
	}
	return curr.getValue();
	}

	/**
	* Function to display all the elements in the queue
	*/
	public void display(){
	if(isQueueEmpty()){
	System.out.println("Queue is empty");
	return;
	}
	else{
	Node<T> tNode=front;
	while(tNode!=null){
	System.out.print(tNode.getValue()+" ");
	tNode=tNode.getNextRef();
}
}
	}
}