package queue;
class Node{
	int data;
	Node next;
	Node(int x)
	{
		data=x;
		next=null;
	}
}
class Myqueue{
	
	Node front,rear;
	Myqueue(){
		
		front=null;
		rear=null;
	}
	void enqueue(int x)
	{
		Node temp=new Node(x);
		
		if(front==null)
		{
			front=temp;
			rear=temp;
			return;
		}
		rear.next=temp;
		rear=temp;
	}
	void dequeue()
	{
		if(front==null)
		{
			return;
		}
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
	}
}

public class ImplementationUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
