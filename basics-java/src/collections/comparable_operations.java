package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class comparable_operations implements Comparable<comparable_operations> {
private int data;
Scanner obj_int=new Scanner(System.in);
Scanner obj_string =new Scanner(System.in);
ArrayList<comparable_operations> object=new ArrayList();
private int id,age;
private String name;
private double salary;
comparable_operations()
{
	System.out.println("enter the number of values to enter: ");
	data=obj_int.nextInt();
	insert(0);
	sort();
}
@Override
public String toString() {
	return "employee_details [id=" + id + ", age=" + age + ", name="
			+ name + ", salary=" + salary + "]";
}
public comparable_operations(int id, int age, String name, double salary) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.salary = salary;
}
void insert(int i)
{
	if(i<data)
	{
		System.out.println("enter the id of the employee: ");
		int id1=obj_int.nextInt();
		System.out.println("enter the name of the employee: ");
		String name1=obj_string.nextLine();
		System.out.println("enter the salary of the employee: ");
		double salary1=obj_int.nextDouble();
		System.out.println("enter the age of the employee: ");
		int age1=obj_int.nextInt();
		object.add(new comparable_operations(id1,age1,name1,salary1));
		i++;
		insert(i);
	}
}
@Override
public int compareTo(comparable_operations o) 
{
	int val=this.name.compareTo(o.name);
	if(val>0)
		return 1;
	else if(val<0)
		return -1;
	else
		return 0;
	/*if(this.salary>o.salary)
	{
		return 1;
	}
	else if(this.salary<o.salary)
	{
		return -1;
	}
	else
	{
	return 0;
    }*/
}
void sort()
{
	Collections.sort(object);
	System.out.println(object);
}
public static void main(String args[])
{
	comparable_operations vertex=new comparable_operations();
}
}
