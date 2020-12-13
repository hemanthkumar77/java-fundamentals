package array_integer_logics;

import java.util.Scanner;

public class subarray {
private int data;
int[]a;
int[]b={23,25,12,15,18,9,27};
static int matcher;
Scanner obj=new Scanner(System.in);
subarray()
{
	System.out.println("enter the array size: ");
	data=obj.nextInt();
	a=new int[data];
	System.out.println("please enter the array values without duplicate: ");
	insert(0);
	logics(0);
	if(matcher==b.length)
	{
		System.out.println("it is a subarray");
	}
	else
	{
		System.out.println("it is not subarray");
	}
}
void logics(int i)
{
	if(i<data)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				matcher++;
				break;
			}
		}
		i++;
		logics(i);
	}
}
void insert(int i)
{
	if(i<data)
	{
		a[i]=obj.nextInt();
		i++;
		insert(i);
	}
}
public static void main(String args[])
{
	subarray obj=new subarray();
}
}
