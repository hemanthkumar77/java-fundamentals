package array_integer_logics;

import java.util.Scanner;

public class sum_array {
private int n;
int sum=0;
int a[];
Scanner input=new Scanner (System.in);
void setters()
{
	System.out.println("enter the size of the array: ");
	n=input.nextInt();
	a=new int[n];
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
void logics(int a[],int i)
{
	if(i<n)
	{
		sum=sum+a[i];
		i++;
		logics(a,i);
	}
}
void operation()
{
	setters();
	System.out.println("enter the values in array: ");
	insert(a,0);
	logics(a,0);
	System.out.println("the sum of the array: "+sum);
}
public static void main(String args[])
{
	sum_array obj=new sum_array();
	obj.operation();
}
}
