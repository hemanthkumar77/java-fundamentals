package Datastructure;

import java.util.Scanner;

public class queue {
private ListNode front;
private ListNode rear;
private int data;
private int length;
Scanner obj_int=new Scanner (System.in);
private class ListNode
{
	private int data;
	private ListNode next;
	private ListNode previous;
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
		this.previous=null;
	}
}
public queue()
{
	this.data=0;
	this.front=null;
	this.rear=null;
	this.length=0;
	int ch=0;
	while(ch!=4)
	{
		System.out.print("enter the valueto perfrom operation: 1)enqueue 2)dequeue 3)print 4)terminate");
		ch=obj_int.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print("enter the value to queue: ");
			int val=obj_int.nextInt();
			enqueue(val);
			System.out.print("\n");
			break;
		case 2:
			dequeue();
			System.out.print("\n");
			break;
		case 3:
			print();
			System.out.print("\n");
			break;
		case 4:
			System.out.print("terminate");
			System.out.print("\n");
			break;
		default:
			System.out.print("wrongly entered");
			System.out.print("\n");
			break;
		}
	}
}
public boolean IsEmpty()
{
	if(length==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public void enqueue(int val)
{
	ListNode newnode=new ListNode(val);
	if(IsEmpty())
	{
		front=newnode;
	}
	else
	{
		rear.next=newnode;
	}
	rear=newnode;
	length++;
}
public void dequeue()
{
	if(IsEmpty())
	{
		System.out.print("the queue is empty");
	}
	else 
	{
		if(front==rear)
		{
			rear=null;
		}
		int result=front.data;
		front=front.next;
		System.out.print("the dequeue value: "+result);
		length--;
	}
}
public void print()
{
	if(IsEmpty())
	{
		System.out.print("the queue is empty");
	}
	else
	{
		ListNode current=front;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
}
public static void main(String args[])
{
	new queue();
}
}
