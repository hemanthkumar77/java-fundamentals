package Datastructure;

import java.util.Scanner;

public class stack {
private ListNode head;
private int length;
Scanner obj_int=new Scanner(System.in);
private class ListNode
{
	private ListNode next;
	private int data;
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
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
public stack()
{
	this.head=null;
	this.length=0;
	int ch=0;
	while(ch!=4)
	{
		System.out.print("enter the value to perform the opertion: 1.insert 2.print 3.delete 4.terminate");
		ch=obj_int.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print("enter the value to insert in stack:  ");
			int val=obj_int.nextInt();
			insert(val);
			System.out.print("\n");
			break;
		case 2:
			 print();
			 System.out.print("\n");
			 break;
		case 3:
			delete();
			System.out.print("\n");
			break;
		case 4:
			System.out.print("terminates");
			System.out.print("\n");
			break;
		default:
			System.out.print("entered the wrong option");
			System.out.print("\n");
			break;
		}
	}
}
public void insert(int val)
{
	ListNode object=new ListNode(val);
	object.next=head;
	head=object;
	length++;
}
public void print()
{
	ListNode current=head;
	if(IsEmpty())
	{
		System.out.print("the stack is empty");	
	}
	else
	{
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
}
public void delete()
{
	if(IsEmpty())
	{
		System.out.print("the stack is empty");
	}
	else
	{
		int result=head.data;
		head=head.next;
		System.out.print("the value removed: "+result);
		length--;
	}
}
public static void main(String args[])
{
	new stack();
}
}
