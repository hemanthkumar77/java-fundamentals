package array_string_logics;

import java.util.Scanner;

public class ASSIIC {
private String value;
String s="";
int data;
Scanner input=new Scanner(System.in);
ASSIIC()
{
	System.out.println("enter the string: ");
	value=input.nextLine();
	data=value.length();
	insert(0);
	System.out.println("the words: "+s);
}
void insert(int i)
{
	if(i<data)
	{
		if(value.charAt(i)>='A' && value.charAt(i)<='Z')
		{
			s=s+((char)((int)value.charAt(i)+32));
		}
		i++;
		insert(i);
	}
}
public static void main(String args[])
{
	ASSIIC obj=new ASSIIC();
}
}
