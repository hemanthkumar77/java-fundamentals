package array_string_logics;

import java.util.Scanner;

public class split {
private String value;
String parts[];
int data;
Scanner obj=new Scanner(System.in);
split()
{
	System.out.println("enter the sentences: ");
	value=obj.nextLine();
	parts=value.split(",");
	data=parts.length;
	display(0);
}
void display(int i)
{
	if(i<data)
	{
		System.out.print(parts[i]+" ");
		i++;
		display(i);
	}
}
public static void main(String args[])
{
	split jig=new split();
}

}
