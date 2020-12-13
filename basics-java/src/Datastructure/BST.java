package Datastructure;

import java.util.Scanner;

public class BST {
   private TreeNode root;
   private class TreeNode
   {
	   private TreeNode left;
	   private TreeNode right;
	   private int data;
	   public TreeNode(int data)
	   {
		   this.data=data;
		   this.left=null;
		   this.right=null;
	   }
   }
 public BST()
 {
	 this.root=null;
	
 }
 public void insert(int val)
 {
	 root=insert(root,val);
 }
 public TreeNode insert(TreeNode root,int val)
 {
	 if(root==null)
	 {
		 root=new TreeNode(val);
		 return root;
	 }
	 else if(val<root.data)
	 {
		 root.left=insert(root.left,val);
	 }
	 else
	 {
		 root.right=insert(root.right,val);
	 }
	 return root;
 }
 public TreeNode search (int key)
 {
	 return search(root,key);
 }
 public TreeNode search(TreeNode root,int key)
 {
	 if(root==null || root.data==key)
	 {
		 return root;
	 }
	 else if(key<root.data)
	 {
		 return search (root.left,key);
	 }
	 else
	 {
		 return search(root.right,key);
	 }
 }
 public void preorder()
 {
	 preorder(root);
 }
 public void preorder(TreeNode root)
 {
	 if(root==null)
	 {
		 return;
	 }
	 System.out.print(root.data+" ");
	 preorder(root.left);
	 preorder(root.right);
 }
 public void inorder()
 {
	 inorder(root);
 }
 public void inorder(TreeNode root)
 {
	 if(root==null)
	 {
		 return;
	 }
	 inorder(root.left);
	 System.out.print(root.data+" ");
	 inorder(root.right);
 }
 public void postorder()
 {
	 postorder(root);
 }
 public void postorder(TreeNode root)
 {
	 if(root==null)
	 {
		 return ;
	 }
	 postorder(root.left);
	 postorder(root.right);
	 System.out.print(root.data+" ");
 }
 public static void main(String args[])
 {
	BST OBJ= new BST();
	 Scanner obj_int=new Scanner(System.in);
	 int ch=0;
	 while(ch!=6)
	 {
		 System.out.print("enter the option to perform the operation: 1.insert 2.search 3.preorder 4.inorder 5.postorder 6.terminate");
		 ch=obj_int.nextInt();
		 switch(ch)
		 {
		 case 1:
			 System.out.print("enter the value to insert: ");
			 int val=obj_int.nextInt();
			OBJ.insert(val);
			 System.out.print("\n");
			 break;
		 case 2:
			 System.out.print("enter the value to insert: ");
			 int val1=obj_int.nextInt();
			 if(null!=OBJ.search(val1))
			 {
				 System.out.print("value found!!!");
			 }
			 else
			 {
				 System.out.print("value not found!!");
			 }
			 System.out.print("\n");
			 break;
		 case 3:
			 OBJ.preorder();
			 System.out.print("\n");
			 break;
		 case 4:
			 OBJ.inorder();
			 System.out.print("\n");
			 break;
		 case 5:
			OBJ. postorder();
			 System.out.print("\n");
			 break;
		 case 6:
			 System.out.print("terminated");
			 System.out.print("\n");
			 break;
		default:
			System.out.print("enter the wrong option");
			System.out.print("\n");
			 break;
		 }
	 }
 }
}
