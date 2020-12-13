package array_integer_logics;

import java.util.Scanner;

public class palindrom {
private int number;
int copy;
int reminder;
int reverse=0;
palindrom()
{
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number to check palindrome or not: ");
	number=input.nextInt();
}
void logics()
{
	if(number!=0)
	{
		reminder=number%10;
		reverse=reverse*10+reminder;
		number=number/10;
		logics();
	}
}
public static void main(String args[])
{
	palindrom obj=new palindrom();
	obj.copy=obj.number;
	obj.logics();
	if(obj.copy==obj.reverse)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindome");
	}
}
}
