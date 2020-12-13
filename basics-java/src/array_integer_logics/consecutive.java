package array_integer_logics;

import java.util.Scanner;

public class consecutive {
	private int data;
	int a[];
	int b[];
	int next;
	int result;
	int increment;
	Scanner obj=new Scanner(System.in);
	consecutive()
	{
		System.out.println("enter the size of the array: ");
		data=obj.nextInt();
		a=new int [data];
		b=new int[data];
		System.out.println("enter the elements one by one : ");
		insert(0);
		sort(0,0);
		System.out.println("\n");
		logic(0);
		display();
		sorted(0,0);
	  System.out.println("largest_number:"+b[increment]);
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
  void sort(int i,int j)
  {
	  int temp;
	  if(i<data-1)
	  {
		  if(i>j)
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
			 sort(i,j);
		  }
		  i++;
		  sort(i,0);
	  }
  }
  void sorted(int i,int j)
  {
	  int temp;
	  if(i<=increment-1)
	  {
		  if(i>j)
		  {
			  j=i+1;
		  }
		  if(j<=increment)
		  {
			 if(b[i]>b[j])
			 {
				 temp=b[i];
				 b[i]=b[j];
				 b[j]=temp;
			 }
			 j++;
			 sorted(i,j);
		  }
		  i++;
		  sorted(i,0);
	  }
  }
  void display()
  {
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.print(a[i]+" ");
	  }
	  System.out.println("\n");
	  for(int j=0;j<=increment;j++)
	  {
		  System.out.println(b[j]+" ");
	  }
		  
  }
  void logic(int i)
  {
	  if(next<=a[data-1])
	  {
		  if(i==0)
		  {
			  next=a[0];
		  }
		  if(a[i]==next)
		  {
			  //System.out.print(a[i]+" ");
			  result++;
			  next++;
			  if(a[i]==a[data-1])
			  {
				  b[increment]=result;
			  }
			  i++;
		  }
		  else
		  {
			  next=0;
			  next=a[i];
			 // System.out.print(next+" ");
			  b[increment]=result;
			  result=0;
			  increment++;
		  }
		  logic(i);
	  }
  }
	
  public static void main(String args[])
  {
	  consecutive object=new consecutive();
  }
}
