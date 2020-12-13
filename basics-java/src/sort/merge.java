package sort;

import java.util.Scanner;

public class merge {
private int data;
int a[];
Scanner obj_int=new Scanner(System.in);
merge()
{
	System.out.print("enter the number of data: ");
	data=obj_int.nextInt();
	a=new int[data];
	insert(0);
	merge(0,data-1);
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
public void merge(int first,int last)
{
	int mid;
	if(first<last)
	{
		mid=(first+last)/2;
		merge(first,mid);
		merge(mid+1,last);
		sort(first,mid,last);
	}
}
public void sort(int first,int mid,int last)
{
	int i=first;
	int j=mid+1;
	int k=0;
	int temp;
	int b[]=new int[data];
	while(i<=mid && j<=last)
	{
		if(a[i]<a[j])
		{
			b[k]=a[i];
			i++;
			k++;
		}
		else
		{
			b[k]=a[j];
			j++;
			k++;
		}
	}
	while(i<=mid)
	{
		b[k]=a[i];
	   i++;
	   k++;
	}
	while(j<=last)
	{
		b[k]=a[j];
		j++;
		k++;
	}
	for(int y=last;y>=first;y--)
	{
		k--;
	  a[y]=b[k];
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
	new merge();
}
}
