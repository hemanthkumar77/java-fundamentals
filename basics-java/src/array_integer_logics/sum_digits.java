package array_integer_logics;

import java.util.Scanner;

public class sum_digits {
private int n;
int reminder;
int sum=0;
sum_digits(int i)
{
 n=i;
}
void logics()
{
	if(n!=0)
	{
		reminder=n%10;
		sum=sum+reminder;
		n=n/10;
		logics();
	}
}
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	int inp=input.nextInt();
	sum_digits obj=new sum_digits(inp);
	obj.logics();
	System.out.println("results: "+obj.sum);
}
}
