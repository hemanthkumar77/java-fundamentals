package array_integer_logics;

import java.util.Scanner;

public class sum_pairs {

	private int data;
	int key;
	int [] a;
	Scanner obj=new Scanner(System.in);
	sum_pairs()
	{
		System.out.println(" enter the size of the array: ");
		data=obj.nextInt();
		a=new int[data];
		System.out.println("enter the key to search it in array: ");
		key=obj.nextInt();
		System.out.println("enter the values one by one: ");
		insert(0);
		logics(0,0);
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
	void logics(int i,int j)
	{
		if(i<data-1)
		{
			for(j=i+1;j<data;j++)
			{
				if(a[i]+a[j]==key)
				{
					System.out.println("the pairs: "+a[i]+","+a[j]);
					break;
				}
			}
			i++;
			logics(i,0);
		}
	}
	public static void main(String[] args) {
		sum_pairs object=new sum_pairs();

	}

}
