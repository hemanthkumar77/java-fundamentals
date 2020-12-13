package array_integer_logics;

import java.util.Scanner;

public class duplicate {
private int data;
int[]a;
int[]b;
int increment;
static int exist=0;
Scanner obj=new Scanner(System.in);
duplicate()
{
	System.out.println("enter the size of the array: ");
	data=obj.nextInt();
	a=new int[data];
	b=new int[data];
	insert(0);
	logic(0);
	display(0);
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
void logic(int i)
{
	if(i<data-1)
	{
		for(int j=i+1;j<data;j++)
		{
			if(a[i]==a[j])
			{
				exist=1;
				break;
			}
		}
		if(a[i]==a[data-2])
		{
			b[increment]=a[data-1];
		}
		if(exist==0)
		{
			b[increment]=a[i];
			increment++;
		}
		else
		{
			exist=0;
		}
		i++;
		logic(i);
	}
}
void display(int i)
{
	if(i<=increment)
	{
		System.out.print(b[i]+" ");
		i++;
		display(i);
	}
}
public static void main(String args[])
{
	duplicate object=new duplicate();
}

}
