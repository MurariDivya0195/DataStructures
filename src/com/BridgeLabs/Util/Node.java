package com.BridgeLabs.Util;

 class Node<T> implements Comparable<T> {
	    private T value;
	    private Node<T> nextRef;
		public String data1;
		public int data;
		public Node<?> nextNode;
	    public Node()
	    {
	    	this.nextRef=null;
	    }
	     
	    public Node(T data2, Node<T> object) {
			this.value=data2;
			this.nextRef=object;
		}

		public T getValue() {
	        return value;
	    }
	    public void setValue(T value) {
	        this.value = value; 
	    }
	    public Node<T> getNextRef() {
	        return nextRef;
	    }
	    public void setNextRef(Node<T> ref) {
	        this.nextRef = ref;
	    }
		@SuppressWarnings("unused")
		public void setData(String data1)
		{
			this.data1=data1;
			Object nextNode = null;
		}
		
		public void setData(int data)
		{
			this.data=data;
			@SuppressWarnings("unused")
			Object nextNode = null;
		}
	    @Override
	    public int compareTo(T arg) {
	        if(arg == this.value){
	            return 0;
	        } else {
	            return 1;
	        }
	    }
	}
	 


