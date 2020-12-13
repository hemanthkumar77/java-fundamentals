package array_integer_logics;

import java.util.Scanner;

public class missing {
private int data;
int a[];
Scanner input=new Scanner(System.in);
static int counter=0;
missing()
{
	System.out.println("enter the size of the array: ");
	data=input.nextInt();
	a=new int[data];
	insert(0);
	logic(0);
}
void logic(int i)
{
	if(counter<a[data-1])
	{
		if(a[i]==counter)
		{
			i++;
			counter++;
		}
		else
		{
			System.out.println("missing number: "+counter);
			counter++;
		}
		logic(i);
	}
}
void insert(int i)
{
	if(i<data)
	{
		a[i]=input.nextInt();
		i++;
		insert(i);
	}
}
public static void main(String args[])
{
	missing obj=new missing();
}
}
