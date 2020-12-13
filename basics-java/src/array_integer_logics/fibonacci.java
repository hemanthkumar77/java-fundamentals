package array_integer_logics;

import java.util.Scanner;

public class fibonacci {
private int data;
int [] a;
Scanner input=new Scanner(System.in);
fibonacci()
{
	System.out.println("enter the array size: ");
	data=input.nextInt();
	a=new int[data];
}
void logic(int i)
{
	if(i<data)
	{
		if(i<=1)
		{
			a[i]=1;
		}
		else
		{
			a[i]=a[i-1]+a[i-2];
		}
		i++;
		logic(i);
	}
}
void display(int i)
{
	if (i<data)
	{
		System.out.print(a[i]+" ");
		i++;
		display(i);
	}
		
}
public static void main(String args[])
{
	fibonacci obj=new fibonacci();
	obj.logic(0);
	obj.display(0);
}
}
