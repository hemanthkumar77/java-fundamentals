package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map_val {
private int data;
private int key_val;
private String string_val;
HashMap<Integer,String>obj=new HashMap<Integer,String>();
Scanner input=new Scanner(System.in);
Scanner input1=new Scanner(System.in);
map_val()
{
	System.out.println("enter the number of values need to store in map: ");
	data=input.nextInt();
	insert(0);
	display();
}
void insert(int i)
{
	if(i<data)
	{
		System.out.print("enter the key: ");
		key_val=input.nextInt();
		System.out.print("enter the value: ");
		string_val=input1.nextLine();
		obj.put(key_val, string_val);
		key_val=0;
		string_val=" ";
		i++;
		insert(i);
	}
}
void display()
{
  for(Map.Entry val:obj.entrySet())
  {
	  System.out.println("key: "+val.getKey()+" value: "+val.getValue());
  }
}
public static void main(String args[])
{
	map_val reve=new map_val();
}
}
