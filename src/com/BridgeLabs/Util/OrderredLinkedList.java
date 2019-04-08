package com.BridgeLabs.Util;

import java.io.IOException;
import java.util.Scanner;

public class OrderredLinkedList {
	
	
	 Node<?> start;
	    NodeUtility nu=new NodeUtility();
	  

	    // get data From a file
	    public void getDataFromFile()
	    {
	        int[] retArry =nu.integerFileReader();
	        int size =retArry.length;
	        System.out.println("Array Size is  "+size);
	        for(int i=0;i<size;i++)
	        {

	            addItem(retArry[i]);
	        }
	    }

	    // Function for Lsit
	    public void List()
	    {
	        if(start ==null)
	        {
	            System.out.println("List is Empty ");
	        }
	    }

	    // add item Function
	    public void addItem(int data)
	    {
	        Node<?> head =start;
	        Node<?> temp =new Node<Object>();
	        temp.data =data;
	        temp.nextNode =null;
	        if(start == null)
	        {
	            start = temp;
	        }
	        else
	        {
	            while(head.nextNode != null)
	            {
	                head=head.nextNode;
	            }
	            head.nextNode=temp;
	        }
	    }

	   // Display Function
	   public  void display()
	   {
	        Node<?> temp =start;
	        while( temp != null)
	        {
	            System.out.print( temp.data +" ");
	            temp=temp.nextNode;
	        }
	        System.out.println(" ");
	    }

	   // Size of Function
	   public  int size()
	   {
	        int count=0;
	        Node<?> temp =start;
	        while( temp.nextNode != null)
	        {
	            temp=temp.nextNode;
	            count++;
	        }
	        System.out.println("size of Linked List "+count);
	        return count;
	   }

	   // Serching of a Word Function
	   public void searchData()
	   {
	        Node<?> temp = start;
	        int count=0;
	        System.out.println("Enter a number to Search");
	        Scanner sc = new Scanner(System.in);
	         int s =sc.nextInt();
	        int flag=0;
	        while(temp.nextNode != null)
	        {
	        	 count++;	
	            if( temp.data==s)
	            {
	                System.out.println(" number is found At "+count);
	                flag++;
	                
	                break;
	            }
	            temp=temp.nextNode;
	        }

	        if(flag == 1)
	        {
	            removeData(count-1);
	        }
	        else
	        {
	            addItem(s);
	            System.out.println("After Adding a LIst ");
	            
	            display();
	        }
	       
	    }

	    // removeWord From a Linked lIst
	    void removeData(int count)
	    {
	        Node<?> temp = start;
	        if(count==0)
	        {
	            start =start.nextNode;
	            System.out.println("After Deleting LIst is ");
	            display();
	        }
	        else
	        {
				for(int i=0;i<count-1;i++)
				{
					temp=temp.nextNode;
				}
	        temp.nextNode =temp.nextNode.nextNode;
	        System.out.println("After Deleting LIst is ");
	        display();
	        }
	    }
		public void toWrite()
		{
		     nu.writeFile(start);
		}

		public static void bubble(OrderredLinkedList obj) {
		    int i, temp;

		    for (i = 0; i < obj.size() - 1; i++) {
		        for (int j = 0; j < obj.size() - i - 1; j++) {

		            if (obj.get(j) > obj.get(j + 1)) {
		                temp = obj.get(j);
		                obj.set(j, obj.get(j + 1));
		                obj.set(j + 1, temp);

		            }
		        }
		    }
		}
	  
	    private void set(int j, int i) {
	    	Node<?> temp1=start;
	    	Node<?> temp2=start;
	    	for(int k=0;k<i;k++) {
	    		
	    		temp1=temp1.nextNode;
	    		
	        	}
	    	int x=temp1.data;
	    	for(int k=0;k<j;k++) {
	    		
	    		temp2=temp2.nextNode;
	    		
	        	}
	    	temp2.data=temp1.data;
			
		}

		private int get(int i) {
	    	Node<?> temp=start;
	    	for(int j=0;j<i;j++) {
			
			temp=temp.nextNode;
			
	    	}
			return temp.data;
		}
	    

		public static void main(String[] args) throws IOException
	    {
	        OrderredLinkedList obj = new OrderredLinkedList();
	        obj.getDataFromFile();
	        obj.display();
	        obj.size();
	       	obj.searchData();
	       	bubble(obj);
	      obj.toWrite();
	       	
	    }
	}


