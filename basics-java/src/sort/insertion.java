package sort;

import java.util.Scanner;

public class insertion {
private int data;
int a[];
Scanner obj_int=new Scanner(System.in);
insertion()
{
	System.out.print("enter numbers of data: ");
	data=obj_int.nextInt();
	a=new int[data];
	insert(0);
	logic(1);
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
public void logic(int i)
{
	if(i<data)
	{
		int temp=a[i];
		int k=i-1;
		while(k>=0 && a[k]>=temp)
		{
			a[k+1]=a[k];
			k--;
		}
		a[k+1]=temp;
		i++;
		logic(i);
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
	new insertion();
}
}
