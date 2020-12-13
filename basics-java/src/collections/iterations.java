package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class iterations {
private int data=4;
private double value1;
private float value2;
private String name;
private char k;
Scanner obj_int=new Scanner(System.in);
Scanner obj_string=new Scanner(System.in);
Scanner obj_strin=new Scanner(System.in);
ArrayList object=new ArrayList();

void setters(int i)
{
  	if(i<data)
  	{
  		if(i==0)
  		{
  		System.out.println("enter the double: ");
  		value1=obj_int.nextDouble();
  		 object.add(value1);
  		}
  		if(i==1)
  		{
  		System.out.println("enter the float: ");
  		value2=obj_int.nextFloat();
  		 object.add(value2);
  		}
  		if(i==2)
  		{
  		System.out.println("enter the string: ");
  		name=obj_strin.nextLine();
  		 object.add(name);
  		}
  		else
  		{
  			System.out.println("enter the character: ");
  			k=obj_string.next().charAt(0);
  			object.add(k);
  		}
  		i++;
  		setters(i);
  	}
}
void getters()
{
	Iterator val=object.iterator();
	while(val.hasNext())
	{
		System.out.println(val.next());
	}
}
public static void main(String args[])
{
	iterations inter=new iterations();
	inter.setters(0);
    inter.getters();
}
}
