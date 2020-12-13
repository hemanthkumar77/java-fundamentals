package array_string_logics;

import java.util.Scanner;

public class whitespace {
private String input;
int number;
String value="";
Scanner inp=new Scanner(System.in);
whitespace()
{
	System.out.println("enter the sentences");
	input=inp.nextLine();
    number=input.length();
    logic(0);
    System.out.println("the new string value after removal of white line: "+value);
    
}
void logic(int i)
{
	if(i<number)
	{
		if(input.charAt(i)!=' ')
		{
			value=value+input.charAt(i);
		}
		i++;
		logic(i);
	}
}
public static void main(String args[])
{
	whitespace object=new whitespace();
}
}
