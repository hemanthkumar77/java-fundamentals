package sort;

import java.util.Scanner;

public class bubble {
private int data;
int a[];
Scanner obj_int=new Scanner(System.in);
bubble()
{
	System.out.print("enter the number of datas: ");
	data=obj_int.nextInt();
	a=new int[data];
	System.out.print("enter the values in the array: ");
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
	if(i<data)
	{
		if(j<data-1)
		{
			if(a[j]>a[j+1])
			{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
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
	new bubble();
}
}