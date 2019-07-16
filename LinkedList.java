import java.io.*;
import java.util.*;
import java.lang.*;
class Node
{
    int data;
    Node next;
    Node(int d){data=d; next=null;}
}
class LinkedList 
{
	public static void main (String[] args) 
	{
	    
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        Insertlist z=new Insertlist();
	        int n=sc.nextInt();
	        sc.nextLine();
	        for(int i=0;i<n;i++)
	        {
	            int a1=sc.nextInt();
	            int a2=sc.nextInt();
	            if(a2==0)
	                z.InsertAtBeginning(a1);
	            else
	                z.InsertAtEnd(a1);
	        }
	        z.printList();
	    }
	}
}
class Insertlist
{
    Node head;
    void InsertAtBeginning(int x)
    {
        Node new_node=new Node(x);
        new_node.next=head;
        head=new_node;
    }
    void InsertAtEnd(int x)
    {
       Node new_node=new Node(x);
       if(head==null)
       {
           head=new Node(x);
           return;
       }
       new_node.next=null;
       Node last=head;
       while(last.next!=null)
       {
           last=last.next;
       }
       last.next=new_node;
       return;
    }
    void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
