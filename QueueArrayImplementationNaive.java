package queue;
class Queue{
	int size;
	int cap;
	int []arr;
	Queue(int x)
	{
		cap=x;
		size=0;
		arr=new int[cap];
	}
	boolean isFull()
	{
		if(size==cap)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void enque(int x)
	{
		if(isFull())
		{
			System.out.println("The queue is already filled");
			return ;
		}
		arr[size]=x;
		size++;
	}
	void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("The queue is empty");
		}
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
	}
	int Front()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			return arr[0];
		}
	}
	int rear()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			return arr[size-1];
		}
	}
}

public class QueueArrayImplementationNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.enque(10);
		System.out.println(q.Front()+" "+q.rear());
		

	}

}
