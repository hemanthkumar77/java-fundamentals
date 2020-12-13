package sort;

import java.util.Scanner;

public class quick {
private int data;
int a[];
Scanner obj_int=new Scanner(System.in);
quick()
{
	System.out.print("enter the number of datas: ");
	data=obj_int.nextInt();
	a=new int[data];
	insert(0);
	logic(0,data-1);
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
public void logic(int f,int l)
{
	if(f<l)
	{
		int i=f;
		int pivot=f;
		int j=l;
		int temp;
		while(i<j)
		{
			while(a[i]<=a[pivot]&&i<l)
			{
				i++;
			}
			while(a[j]>a[pivot])
			{
				j--;
			}
			if(i<j)
			{
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			}
		}
		temp=a[pivot];
		a[pivot]=a[j];
		a[j]=temp;
		logic(f,j-1);
		logic(j+1,l);
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
	new quick();
}
}
