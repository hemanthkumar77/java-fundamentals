package array_integer_logics;

import java.util.Scanner;

public class merge_sort {
private int data1;
private int data2;
int total;
int a[];
int b[];
int c[];
int first_incre;
int second_incre;
int third;
Scanner input=new Scanner(System.in);
merge_sort()
{
	System.out.println("enter the size of the array: ");
	data1=input.nextInt();
	System.out.println("enter the size of the array2: ");
	data2=input.nextInt();
	total=data1+data2;
	a=new int[data1];
	b= new int [data2];
	c=new int[total];
	System.out.println("enter the values in sorted manner: ");
	insert1(0);
	System.out.println("enter the values in sorted manner: ");
	insert2(0);
	logic();
	System.out.println("sorted array: ");
	display(0);
	
}
void insert1(int i)
{
	if(i<data1)
	{
		a[i]=input.nextInt();
		i++;
		insert1(i);
	}
}
void insert2(int i)
{
	if(i<data2)
	{
		b[i]=input.nextInt();
		i++;
		insert2(i);
	}
}
void logic()
{
	while(first_incre<data1 && second_incre<data2 )
	{
		if(a[first_incre]<b[second_incre])
		{
			c[third]=a[first_incre];
			first_incre++;
			third++;
		}
		else
		{
			c[third]=b[second_incre];
			second_incre++;
			third++;
		}
	}
	while(first_incre<data1)
	{
		c[third]=a[first_incre];
		first_incre++;
		third++;
	}
	while(second_incre<data2)
	{
		c[third]=b[second_incre];
		second_incre++;
		third++;
	}
}
void display(int i)
{
	if(i<total)
	{
		System.out.print(c[i]+" ");
		i++;
		display(i);
	}
}
public static void main(String args[])
{
	merge_sort obj=new merge_sort();
}
}
