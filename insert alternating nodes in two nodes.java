import java.util.*;
public class linkedlist
{
    Node head=null;
    Node first=null;
    Node last=null;
    
    
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
    data=d;
    }
    }
    void add(int data)
    {
    Node o=new Node(data);
    o.next=null;
    if (head==null)
    {
    head=o;
    return;
    }
    Node last=head;
    while(last.next!=null)
    {
    last=last.next;
    }
    last.next=o;
    }
void AlternatingSplit()
{
    Node h=head;
while(h!=null && h.next!=null)
{
    if (first==null&&last==null)
    {               
  first=h;
  last=h.next;       // 0 1 0 1 0 1 
    }
    Node l=h.next;
    h.next=l.next;
   
    if (h.next!=null && h.next.next!=null)
    {
   l.next=h.next.next;    
    }
    else
    {
   l.next=null;
    }
    h=h.next;
}
}
void print()
{
while(first!=null)
{
System.out.print(first.data+" ");
first=first.next;
}
while(last!=null)
{
System.out.print(last.data+" ");
last=last.next;
}
}

public static void main(String g[])
{
    Scanner sc=new Scanner(System.in);
    linkedlist obj=new linkedlist();
    System.out.println("enter no. of elements ");
   int n=sc.nextInt();
   int a;
   for(int i=0;i<n;i++)
   {
a=sc.nextInt();
      obj.add(a);
}
   obj.AlternatingSplit();
   obj.print();
      
}
}