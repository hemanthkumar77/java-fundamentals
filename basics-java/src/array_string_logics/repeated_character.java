package array_string_logics;

import java.util.Scanner;

public class repeated_character {
private String value;
int data;
static int exist;
Scanner obj=new Scanner(System.in);
repeated_character()
{
	System.out.println("enter the sentences: ");
	value=obj.nextLine();
	data=value.length();
	logic(0);
}
void logic(int i)
{
	if(i<data-1)
	{
		for(int j=i+1;j<data;j++)
		{
			if(value.charAt(i)==value.charAt(j))
			{
				//System.out.print(value.charAt(i));
				exist=1;
				break;
			}
		}
		if(exist==0)
		{
			System.out.println(value.charAt(i));
			i=data-1;
		}
		else
		{
			exist=0;
		}
		i++;
		logic(i);
	}
}
	public static void main(String[] args) {
		repeated_character obj=new repeated_character();

	}

}
