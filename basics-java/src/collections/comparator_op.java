package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class comparator_op {
private int data;
LinkedList<comparator_op> object=new LinkedList<comparator_op>();
Scanner obj_int=new Scanner(System.in);
Scanner obj_string=new Scanner(System.in);
private int id,age;
private double salary,taxes;
private String name;
comparator_op()
{
	System.out.println("enter how many sets you want enter to list: ");
	data=obj_int.nextInt();
}
public comparator_op(int id, int age, double salary, double taxes, String name) {
	super();
	this.id = id;
	this.age = age;
	this.salary = salary;
	this.taxes = taxes;
	this.name = name;
}
void insert(int i)
{
	if(i<data)
	{
		System.out.println("enter the id of the employee: ");
		int id1=obj_int.nextInt();
		System.out.println("enter the age of the employee: ");
		int age1=obj_int.nextInt();
		System.out.println("enter the name of the employee: ");
		String name1=obj_string.nextLine();
		System.out.println("enter the salary of the employee: ");
		double salary1=obj_int.nextDouble();
		double taxes1=salary1*0.14;
		object.add(new comparator_op(id1,age1,salary1,taxes1,name1));
     i++;
     insert(i);
	}
}
void sort()
{
	Comparator<comparator_op>obje=new Comparator<comparator_op>()
			{
				public int compare(comparator_op o1, comparator_op o2) {
					int value= o1.name.compareTo(o2.name);
					if(value>0)
						return 1;
					if(value<0)
						return -1;
					else
						return 0;
				}
			};
			Collections.sort(object,obje);
}

void operations()
{
	insert(0);
	sort();
	System.out.println(object);
}
public static void main(String args[])
{
	//comparator_op inter=new comparator_op();
	new comparator_op().operations();
	
}
@Override
public String toString() {
	return "comparator_op [id=" + id + ", age=" + age + ", salary=" + salary
			+ ", taxes=" + taxes + ", name=" + name + "]";
}
}
