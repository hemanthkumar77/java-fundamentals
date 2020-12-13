package array_integer_logics;

import java.util.Scanner;

public class transpose extends Thread {
private int rows;
private int columns;
int total=rows*columns;
int y;
int [][]a;
Scanner obj=new Scanner(System.in);
transpose()
{
	System.out.println("enter the rows: ");
	rows=obj.nextInt();
	System.out.println("enter the columns: ");
	columns=obj.nextInt();
	a=new int[rows][columns];
}
public void run()
{
	try
	{
		matrix();
		display();
		Thread.sleep(3000);
		System.out.println("\n");
		transpose_method();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
void matrix()
{
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<columns;j++)
		{
			a[i][j]=obj.nextInt();
		}
	}
}
void display()
{
	for(int i=0;i<rows;i++)
	{
	for(int j=0;j<columns;j++)
	{
      System.out.print(a[i][j]+" ");	
	}
	System.out.println("\n");
	}
}
void transpose_method()
{
	for(int i=0;i<columns;i++)
	{
	for(int j=0;j<rows ;j++)
	{
      System.out.print(a[j][i]+" ");	
	}
	System.out.println("\n");
	}
}
public static void main(String args[])
{
	transpose object=new transpose();
	object.start();
	//object.matrix();
	//object.display();
	//object.transpose_method(0, 0);
}
}
