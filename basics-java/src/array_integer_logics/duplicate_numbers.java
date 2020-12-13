package array_integer_logics;

import java.util.Scanner;

public class duplicate_numbers {
private int n;
int a[];
int first,second;
Scanner input=new Scanner(System.in);
void setters()
{
	System.out.println("enter the array size: ");
	n=input.nextInt();
}
void insert(int a[],int i)
{
	if(i<n)
	{
		a[i]=input.nextInt();
		i++;
		insert(a,i);
	}
}
void logic(int a[],int i,int j)
{
	int temp;
	if(i<n)
	{
		if(j<n-1)
		{
			if(a[j]>a[j+1])
			{
			   temp=a[j];
			   a[j]=a[j+1];
			   a[j+1]=temp;
			}
			j++;
			logic(a,i,j);
		}
		i++;
		logic(a,i,0);
	}
}
void duplicates(int a[],int i)
{
	if(i<n-1)
	{
		if(a[i]==a[i+1])
		{
			System.out.print(a[i]+" ");
		}
		i++;
		duplicates(a,i);
	}
}
void display(int a[],int i)
{
	if(i<n)
	{
		System.out.print(a[i]+" ");
		i++;
		display(a,i);
	}
	
}
void call_method()
{
	System.out.println("enter the size of the array: ");
	insert(a,0);
	logic(a,0,0);
	System.out.println("duplicates: ");
	duplicates(a,0);
	System.out.println("sorted values: ");
	display(a,0);
	System.out.println("first largest number: "+a[n-1]);
	System.out.println("second largest number: "+a[n-2]);
}
public static void main(String args[])
{
	duplicate_numbers obj=new duplicate_numbers();
	obj.setters();
	obj.a=new int[obj.n];
	obj.call_method();
}
}
