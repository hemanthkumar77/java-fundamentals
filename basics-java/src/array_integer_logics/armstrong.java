package array_integer_logics;

import java.util.Scanner;

public class armstrong {
private int data;
int copy;
int power;
double armstrong_num=0;
int reminder;
armstrong()
{
	Scanner obj=new Scanner(System.in);
	data=obj.nextInt();
}
void logics()
{
	if(copy!=0)
	{
	 copy=copy/10;
	 power++;
	 logics();
	}
}
void logic()
{
	if(data!=0)
	{
		reminder=data%10;
		armstrong_num=armstrong_num+Math.pow(reminder,power);
		data=data/10;
		logic();
	}
}
public static void main(String args[])
{
	armstrong obj=new armstrong();
	obj.copy=obj.data;
	obj.logics();
	obj.copy=obj.data;
	obj.logic();
	if(obj.armstrong_num==obj.copy)
	{
		System.out.println("it is armstrong number");
	}
	else
	{
		System.out.println("is not a armstrong number");
	}
}
}
