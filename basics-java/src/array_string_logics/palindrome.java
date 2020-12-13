package array_string_logics;

import java.util.Scanner;

public class palindrome {
private String input;
private String reverse="";
int length=0;
Scanner object=new Scanner(System.in);
palindrome()
{
	System.out.println("enter the name: ");
	input=object.nextLine();
	length=input.length();
     logic(length-1);
     if(reverse.equals(input))
     {
    	 System.out.println("it is palindrome");
     }
     else
     {
    	 System.out.println("it is not palindrome");
     }
}
void logic(int i)
{
	if(i>=0)
	{
		reverse=reverse+input.charAt(i);
		i--;
		logic(i);
	}
}
public static void main(String args[])
{
	palindrome object=new palindrome();
}
}
