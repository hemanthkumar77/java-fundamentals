package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class generic_operations {
static int data;
private int age,id;
private String name,Nationality;
LinkedList<generic_operations>object=new LinkedList();
static Scanner obj_int=new Scanner(System.in);
Scanner obj_string = new Scanner(System.in);

public generic_operations()
{
	System.out.println("enter the how many datas you want to enter: ");
	data=obj_int.nextInt();
}
public generic_operations(int identity,String fullname,String nationality,int AGE) {
	this.id=identity;
	this.age=AGE;
    this.name=fullname;
    this.Nationality=nationality;
}
 void setters(int i)
{
    if(i<data)
    {
       	System.out.println("enter the id of the employee: ");
       int	id=obj_int.nextInt();
        System.out.println("enter the name of the employee: ");
       String fullname=obj_string.nextLine();
        System.out.println("enter the nationality please: ");
       String nationality=obj_string.nextLine();
        System.out.println("enter the age please: ");
       int AGE=obj_int.nextInt();
       object.add(new generic_operations(id,fullname,nationality,AGE));
       i++;
       setters(i);
    }
}
 void getters()
{
	for(generic_operations obj:object)
	{
		System.out.print("id of the employee: "+obj.id+"  ");
		System.out.print("Name of the employee: "+obj.name+"  ");
		System.out.print("Nationality of the employee: "+obj.Nationality+"  ");
		System.out.print("Age of the employee: "+obj.age+"  ");
	}
}
 void operations()
 {
	 setters(0);
	 getters();
 }
 public static void main(String args[])
 {
    generic_operations inter=new generic_operations();
    inter.operations();
 }
}
