package Datastructure;

import java.util.Scanner;

public class circular {
private ListNode last;
private int length;
Scanner obj_int=new Scanner(System.in);
private class ListNode
{
	private int data;
	private ListNode next;
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public circular()
{
	this.last=null;
	int ch=0;
	while(ch!=4)
	{
		System.out.print("enter the option to perform operation : 1.insert 2.delete 3.print 4.terminate");
		ch=obj_int.nextInt();
		switch(ch)
		{
		case 1:
			 System.out.print("enter the value : ");
			 int val=obj_int.nextInt();
			 insert(val);
			 System.out.print("\n");
			 break;
		case 2:
			delete();
			System.out.print("\n");
			 break;
		case 3:
			print();
			System.out.print("\n");
			 break;
		case 4:
			System.out.print("terminated ");
			System.out.print("\n");
			 break;
		default:
			System.out.print("wrong;y entered!!");
			System.out.print("\n");
			 break;
		}
	}
}
public void insert(int val)
{
	ListNode newnode=new ListNode(val);
	if(last==null)
	{
		last=newnode;
	}
	else
	{
		newnode.next=last.next;
	}
	last.next=newnode;
	length++;
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
public void delete()
{
	if(IsEmpty())
	{
		System.out.print("the linkedlist is empty!!");
	}
	else
	{
		ListNode current=last.next;
	   if(last.next==last)
	   {
		   last=null;
		   length--;
	   }
	   else
	   {
		   last.next=current.next;
		   current.next=null;
		   length--;
	   }
	}
}
public void print()
{
	ListNode current=last.next;
	while(current!=last)
	{
		System.out.print(current.data+" ");
		current=current.next;
	}
	System.out.print(last.data);
}
public static void main(String args[])
{
	new circular();
}
}
