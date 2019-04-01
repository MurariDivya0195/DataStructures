package com.BridgeLabs.Util;
public class NodeD<E> {
public E data;
public NodeD<E> next;
public NodeD<E> prev;

public NodeD()
{
    this.next=null;
    this.prev=null;
}

public NodeD(E temp)
{
    this.data=temp;
    this.next=null;
    this.prev=null;
}
}


