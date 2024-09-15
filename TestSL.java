import java.util.*;
class Node
{
int data;
Node next;
 
Node(int x)
  {
  data = x;
  next = null;
  }
}




class SingleList
{
	Node head,tail;
	SingleList()
	{
	 head = tail = null;
	}
	void create(int x)
	{
 	Node n = new Node(x);
 	if(head == null)
	{
	head = tail = n;
	}
	else
	{
	tail.next = n;
	tail = n;
	}
	}

void display()
{ 
	if(head == null)
	{
	System.out.println("List is empty");
	return;
	}
	Node temp = head;
	while(temp != null)
	{
	System.out.println(temp.data+" ");
 	temp = temp.next;
	}
}
void insertFirst(int x)
{
	Node n = new Node(x);
	if( head == null )
	head = tail = n;
	else
	{
		n.next = head;
                head = n;
	}
}
void insertPosition(int x,int pos)
{
        Node n = new Node(x);
	if(head == null)
	head = tail = n;
	else
	{
	 Node temp = head;
	int count = 2;
	while(count < pos && temp.next != null)
	{
	  count++;
	  temp = temp.next;
	}
	if(temp.next == null)
	{
	  temp.next = n;
	  tail = n;
        }
	else
	{ 
		n.next = temp.next;
		temp.next = n;
	}
}
}
void deleteFirst()
{
	if(head == null)
	{
	  System.out.println("List is Empty");
          return;
	}
System.out.println(head.data+"is deleted");
head = head.next;
}










void deleteLast()
{
	if(head == null)
	{
           System.out.println("List is empty");
	  return;
	}
	Node temp = head;
	if(temp.next == null)
	{
	System.out.println(temp.data+" is deleted");
head = tail = null;
return;
}
while(temp.next.next != null)
{
temp= temp.next;
System.out.println(temp.next.data+"is deleted");
temp.next = null;
tail = temp;
}
}









void deletePosition(int pos)
{
	if(head == null)
	{
          System.out.println("List is empty");
	return;
	}
	Node temp = head;
	int count = 2;
	if(temp.next == null)
	{
 	System.out.println(temp.data+"is deleted");
	head = tail = null;
	return;
	}
        while(count < pos && temp.next.next != null)
	{
	  count++;
          temp = temp.next;
 	}
	if(temp.next.next == null)
	{
	 System.out.println(temp.next.data+" is deleted");
	temp.next = null;
	tail = temp;
	}
	else
	{
	System.out.println(temp.next.data+" is deleted");
	Node temp1 = temp.next;
        temp.next = temp.next.next;
	temp1.next = null;
	}
}   
}

class TestSL
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
SingleList s1 = new SingleList();
for(;;)//in linked list we can take many inputs so infinite loop we are considering
{
System.out.println();
System.out.println("1.Create\n2.Print\n3.InsertFirst\n4.Insert any position\n5.Delete First\n6.Delete Last\n7.Delete any position\n8.Exit");
System.out.println("Enter your choice");
int ch = sc.nextInt();
if(ch == 1)
{
int x;
System.out.println("Enter an Element");
x = sc.nextInt();
s1.create(x);
}
else if(ch ==2 )
{
 s1.display();
}
else if(ch == 3)
{
int x;
System.out.println("Enter an element");
x = sc.nextInt();
s1.insertFirst(x);
}

else if(ch == 4)
{
int x,pos;
System.out.println("Enter element and Position");
x= sc.nextInt();
pos = sc.nextInt();
s1.insertPosition(x,pos);
}

else if(ch == 5)
s1.deleteFirst();
else if(ch == 6)
s1.deleteLast();
else if(ch == 7)
{
	int pos;
	System.out.println("Enter Position");
 	pos = sc.nextInt();
	s1.deletePosition(pos);
}
else if(ch == 8)
 break;


else
System.out.println("Invalid choice");

}
}
}








        

	
	
    	







