package sort;

import java.util.Scanner;

public class selection {
private int data;
int a[];
Scanner obj_int=new Scanner(System.in);
selection()
{
	System.out.print("enter the number of datas: ");
	data=obj_int.nextInt();
	a=new int[data];
	System.out.print("enter the numbers one by one: ");
	insert(0);
	logic(0,0);
	display(0);
}
public void insert(int i)
{
	if(i<data)
	{
		a[i]=obj_int.nextInt();
		i++;
		insert(i);
	}
}
public void logic(int i,int j)
{
	int temp;
	if(i<data-1)
	{
		if(i>=j)
		{
			j=i+1;
		}
		if(j<data)
		{
			if(a[i]>a[j])
			{
			  temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			}
			j++;
			logic(i,j);
		}
		i++;
		logic(i,0);
	}
}
public void display(int i)
{
	if(i<data)
	{
		System.out.print(a[i]+" ");
		i++;
		display(i);
	}
}
public static void main(String args[])
{
	new selection();
}
}
