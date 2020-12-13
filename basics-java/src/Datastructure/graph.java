package Datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class graph {
private LinkedList<Integer>adj[];
private int vertices;
private int Edges;
public graph(int data)
{
	this.vertices=data;
	this.Edges=0;
	this.adj=new LinkedList[data];
	for(int i=0;i<data;i++)
	{
		adj[i]=new LinkedList<Integer>();
	}
}
public void addEdges(int u,int v)
{
	this.adj[u].add(v);
	this.adj[v].add(u);
	Edges++;
}
public String toString()
{
	StringBuffer object=new StringBuffer();
	object.append("vertices :"+vertices+" Edges: "+Edges);
	object.append("\n");
	for(int i=0;i<vertices;i++)
	{
		object.append(i+": ");
		for(int w: adj[i])
		{
			object.append(w+" ");
		}
		object.append("\n");
	}
	return object.toString();
}
public void BFS(int source)
{
	boolean visited[]=new boolean[vertices];
	Queue<Integer>que=new LinkedList<Integer>();
	visited[source]=true;
    que.offer(source);
    while(!que.isEmpty())
    {
    	int poped_val=que.poll();
    	System.out.print(poped_val+" ");
    	for(int w:adj[poped_val])
    	{
    		if(!visited[w])
    		{
    			visited[w]=true;
    			que.offer(w);
    		}
    	}
    }
	
}
public void DFS(int source)
{
	boolean visited[]=new boolean[vertices];
	Stack<Integer>stack=new Stack<Integer>();
	stack.push(source);
	while(!stack.isEmpty())
	{
		int poped_val=stack.pop();
		if(!visited[poped_val])
		{
			System.out.print(poped_val+" ");
			visited[poped_val]=true;
			for(int w:adj[poped_val])
			{
				stack.push(w);
			}
		}
	}
}
public static void main(String args[])
{
	Scanner obj_int=new Scanner(System.in);
	System.out.print("enter the nodes: ");
	int nodes=obj_int.nextInt();
	graph object=new graph(nodes);
	int ch=0;
	while(ch!=5)
	{
		System.out.print("enter the option to perform the operation: 1.addEdges 2.print 3.BFS 4.DFS 5.TERMINATE");
		ch=obj_int.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print("enter the values to connect nodes: ");
			int u1=obj_int.nextInt();
			int v1=obj_int.nextInt();
			object.addEdges(u1, v1);
			System.out.print("\n");
			break;
		case 2:
			System.out.print(object);
			System.out.print("\n");
			break;
		case 3:
			System.out.print("enter the source node: ");
			int source=obj_int.nextInt();
			object.BFS(source);
			System.out.print("\n");
			break;
		case 4:
			System.out.print("enter the source node: ");
			int source1=obj_int.nextInt();
			object.DFS(source1);
			System.out.print("\n");
			break;
		case 5:
			System.out.print("terminated");
			break;
		default:
			System.out.print("wrongly entered the value");
			System.out.print("\n");
			break;
		}
	}
}
}
