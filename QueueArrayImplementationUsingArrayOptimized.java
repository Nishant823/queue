package queue;
class MyQueue{
	int size;
	int cap;
	int[] arr;
	int front;
	MyQueue(int x)
	{
		size=0;
		cap=x;
		arr=new int[cap];
		front =0;
	}
	boolean isFull()
	{
		return (size==cap);
	}
	boolean isEmpty()
	{
		return (size==0);
	}
	int getFront()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			return front;
		}
	}
	int getRear()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			return (front+size-1)%cap;
		}
	}
	void enqueue(int x)
	{
		if(isFull())
		{
			return;
		}
		int rear=getRear();
		rear=(rear+1)%cap;
		arr[rear]=x;
		size++;
		
	}
	void dequeue()
	{
		if(isEmpty())
		{
			return;
		}
		front=(front+1)%cap;
		size--;
	}
}

public class QueueArrayImplementationUsingArrayOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
