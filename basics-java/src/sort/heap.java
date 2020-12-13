package sort;

import java.util.Scanner;

public class heap {
private int data;
int a[];
Scanner obj_int=new Scanner(System.in);
heap()
{
	System.out.print("enter the number of datas: ");
	data=obj_int.nextInt();
	a=new int[data];
	insert(0);
	heap_array(0);
	System.out.print("heap_array: ");
	display(0);
	logic(data-1);
	System.out.print("sorted_array: ");
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
public void heap_array(int i)
{
	if(i<data)
	{
		int c=i;
		int temp;
		do
		{
			int root=(c-1)/2;
			if(a[root]<a[c])
			{
			 temp=a[root];
			 a[root]=a[c];
			 a[c]=temp;
			}
			c=root;
		}while(c!=0);
		i++;
		heap_array(i);
	}
}
public void logic(int j)
{
	if(j>=0)
	{
		int temp=a[0];
		a[0]=a[j];
		a[j]=temp;
		int root=0;
		int c = 0;
		do
		{
		 c=2*root+1;
		 if(c<data)
		 {
			 if(a[c]<a[c+1] && c<j-1)
			 {
				 c++;
			 }
			 if(a[root]<a[c] && c<j)
			 {
				 temp=a[root];
				 a[root]=a[c];
				 a[c]=temp;
			 }
		 }
		 root=c;
		}while(c<=j);
		j--;
		logic(j);
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
	new heap();
}
}
