package Datastructure;

import java.util.Scanner;

public class SingleLinkedList {
private ListNode head;
Scanner obj_int=new Scanner(System.in);
private class ListNode
{
	private int data;
	private ListNode next;
	public ListNode(int data)
	{
		this.data=data;
	}
}
public SingleLinkedList()
{
	this.head=null;
	int ch=0;
	while(ch!=8)
	{
		System.out.print("enter the value to perform the operation : 1.insert_front 2.insert_end 3.reverse 4.search 5.middle 6.remove 7.print 8.terminate");
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
			System.out.print("enter the value : ");
			int val1=obj_int.nextInt();
			insert_end(val1);
			System.out.print("\n");
			break;
		case 3:
			System.out.print("enter the value to search: ");
			int key=obj_int.nextInt();
			if(search(key))
			{
				System.out.print("value found!!!");
			}
			else
			{
				System.out.print("value not found");
			}
			break;
		case 4:
			ListNode new_head=reverse();
			head=new_head;
			print();
			System.out.print("\n");
			break;
		case 5:
			ListNode middle_node=middle();
			System.out.print("middle_value: "+middle_node.data);
			System.out.print("\n");
			break;
		case 6:
			System.out.print("enter the value : ");
			int val3=obj_int.nextInt();
			remove(val3);
			System.out.print("\n");
			break;
		case 7:
			print();
			System.out.print("\n");
			break;
		case 8:
			System.out.print("terminated");
			break;
		default:
			System.out.print("wrongy entered ");
			System.out.print("\n");
			break;
			
		}
	}
}
public void insert_front(int val)
{
	ListNode temp=new ListNode(val);
	temp.next=head;
	head=temp;
}
public void insert_end(int val)
{
	ListNode newnode=new ListNode(val);
	ListNode current=head;
	if(head==null)
	{
		head=newnode;
	}
	else
	{
		while(null!=current.next)
		{
			current=current.next;
		}
		current.next=newnode;
	}
}
public boolean search(int key)
{
	ListNode current=head;
	if(head==null)
	{
		System.out.print("the linkedlist is empty");
	}
	else
	{
		while(current!=null)
		{
			if(current.data==key)
			{
				return true;
			}
			current=current.next;
		}
	}
	return false;
}
public ListNode reverse()
{
	ListNode current=head;
	ListNode next=null;
	ListNode previous=null;
	while(current!=null)
	{
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
	}
	return previous;
}
public ListNode middle()
{
	ListNode fastptr=head;
	ListNode slowptr=head;
	while(fastptr!=null && fastptr.next!=null)
	{
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;
	}
 return slowptr;
}
public void remove(int val)
{
	ListNode current=head;
	ListNode temp=null;
	if(head!=null && current.data==val)
	{
		head=head.next;
		System.out.print("removed successfully!!");
	}
	else
	{
		while(current!=null && current.data!=val)
		{
			temp=current;
			current=current.next;
		}
		if(current==null)
		{
			System.out.print("value removed!!");
		}
		else
		{
			temp.next=current.next;
			System.out.print("value removed!!");
		}
	}
}
public void print()
{
	ListNode current=head;
	while(current!=null)
	{
		System.out.print(current.data+" ");
		current=current.next;
	}
	System.out.print("null");
}
public static void main(String args[])
{
	new SingleLinkedList();
}
}
