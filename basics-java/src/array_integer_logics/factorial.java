package array_integer_logics;

import java.util.Scanner;

public class factorial {
private int data;
int fact=1;
factorial()
{
	Scanner input=new Scanner(System.in);
	System.out.print("enter the factorial number: ");
	data=input.nextInt();
}
void logic(int i)
{
	if(data>i)
	{
		fact=data*fact;
		data--;
		logic(i);
	}
}
public static void main(String args[])
{
	factorial obj=new factorial();
	obj.logic(0);
	System.out.println("factorial number: "+obj.fact);
}

}
