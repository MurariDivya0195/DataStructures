package com.BridgeLabs.Util;

public class MyStack {

	
	
	private int stackSize;
    private int[] stackArr;
    private int top;
    //Creates stack with given size
    public MyStack(int size) {
        stackSize = size;
        stackArr = new int[stackSize];
        top = -1;
    }
 
  //for pushing
    public void push(int entry) {
        if(isStackFull()){
           System.out.println("Stack is already full. Can not add element.");
        }
        System.out.println("Adding: "+entry);
        stackArr[++top] = entry;
    }
 //for poping 
    public int pop()  {
        if(isStackEmpty()){
            System.out.println("Stack is empty. Can not remove element.");
        }
        int entry = stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
  //for returing last one in stack
    public int peek() {
        return stackArr[top];
    }
 
   //checking if it is empty or not
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
  //checking if it is full or not
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
}


