package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class list_operations {
private int data;
private int controls;
private int inputs;
private int search;
ArrayList<Integer>object=new ArrayList<Integer>();
LinkedList<Integer>object_1=new LinkedList<Integer>();
Scanner obj=new Scanner(System.in);
list_operations()
{
	System.out.println("enter the size to maintain in the list: ");
	data=obj.nextInt();
	//System.out.println("enter the size to trim the list: ");
	//controls=obj.nextInt();
	System.out.println("please enter the how many input you want to insert to the list: ");
	//input=obj.nextInt();
	input(0);
	object.ensureCapacity(data);
	print(object);
	object.trimToSize();
	System.out.println("after the triming size: "+object.size());
	Collections.sort(object);
	System.out.println("the sorted elements in the list: ");
	print(object);
	Collections.reverse(object);
	System.out.println("reverse sorted: ");
	print(object);
	object_1.addAll(object);
	System.out.println("the elements are copied successfully to linkedlist: ");
	print_copy(object_1);
	System.out.println("enter the value to search: ");
	search=obj.nextInt();
	boolean returned=object.contains(search);
	System.out.println("the value is present in list: "+returned );
	//object.clear();
	//System.out.println("check the arraylist size is empty: "+object.isEmpty());
	ArrayList<Integer>instant=(ArrayList<Integer>)object.clone();
	System.out.println("copied to another arraylist: ");
     print(instant);
     Collections.swap(instant,0,instant.size()-1);
     System.out.println("swapped values in new arraylist: ");
     print(instant);
     instant.set(2,99);
     System.out.println("updated values for the new arraylist: ");
     print(instant);
}
void input(int i)
{
	if(i<data)
	{
		inputs=obj.nextInt();
		object.add(inputs);
		inputs=0;
		i++;
		input(i);
	}
}
void print(ArrayList<Integer>list)
{
	for(int values:list)
	{
		System.out.print(values+" ");
	}
}
void print_copy(LinkedList<Integer>list_val)
{
	for(int values:list_val)
	{
		System.out.print(values+" ");
	}
}
	public static void main(String[] args) {
        
	list_operations instances=new list_operations();	
	}

}
