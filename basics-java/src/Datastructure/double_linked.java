package Datastructure;

import java.util.Scanner;

public class double_linked {
private ListNode head;
private ListNode tail;
private int length;
Scanner obj_int=new Scanner(System.in);
private class ListNode
{
	private int data;
	private ListNode next;
	private ListNode previous;
	public ListNode(int data)
	{
		this.data=data;
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
public double_linked()
{
	this.head=null;
	this.tail=null;
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
			 insert_front(val);
			 System.out.print("\n");
			 break;
		case 2:
			delete_front();
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
public void insert_front(int val)
{
	ListNode newnode=new ListNode(val);
	if(head==null)
	{
		tail=newnode;
	}
	else
	{
		head.previous=newnode;
	}
	newnode.next=head;
	head=newnode;
	length++;
}
public void delete_front()
{
	if(IsEmpty())
	{
		System.out.print("the linkedlist is empty");
	}
	else
	{
	if(head==tail)
	{
		tail=null;
	}
	else
	{
		head.next.previous=null;
	}
	head=head.next;
	length--;
 }
}
public void print()
{
	ListNode current=head;
	if(IsEmpty())
	{
		System.out.print("the linkedlist is empty");
	}
	else
	{
		while(current!=null)
		{
			System.out.print(current.data+"<-->");
			current=current.next;
		}
		System.out.print("null");
	}
}
public static void main(String args[])
{
	new double_linked();
}
}
