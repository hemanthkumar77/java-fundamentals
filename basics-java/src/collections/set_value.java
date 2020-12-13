package collections;

import java.util.HashSet;
import java.util.Scanner;

public class set_value {
Scanner input=new Scanner(System.in);
HashSet<Integer>object1=new HashSet<Integer>();
HashSet<Integer>object2=new HashSet<Integer>();
private int data;
set_value()
{
	System.out.println("enter the value of the input: ");
	data=input.nextInt();
	System.out.println("enter the values one by one in set: ");
	insert(0);
	System.out.println("enter the values one by one in set: ");
    insert2(0);
	union();
	intersection();
	difference();
}
void insert(int i)
{
	if(i<data)
	{
		int val=input.nextInt();
		object1.add(val);
		val=0;
		i++;
		if(i==data)
		{
			System.out.println("the first set: "+object1);
		}
		insert(i);
	}
}
void insert2(int i)
{
	if(i<data)
	{
		int val=input.nextInt();
		object2.add(val);
		val=0;
		i++;
		if(i==data)
		{
			System.out.println("the second set: "+object2);
		}
		insert2(i);
	}
}
void union()
{
	HashSet<Integer>obj=new HashSet<Integer>(object1);
	obj.addAll(object2);
	System.out.println("values of the union: "+obj);
}
void intersection()
{
	HashSet<Integer>obj=new HashSet<Integer>(object1);
	obj.retainAll(object2);
	System.out.println("values of the intersection: "+obj);
}
void difference()
{
	HashSet<Integer>obj=new HashSet<Integer>(object1);
	obj.removeAll(object2);
	System.out.println("values of the difference: "+obj);
}
public static void main(String args[])
{
	set_value inter=new set_value();
}
}
