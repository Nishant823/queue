package queue;
class Dequeue
{
	int size;
	int cap;
	int []arr;
	Dequeue(int x)
	{
		size=0;
		cap=x;
		arr=new int[cap];
	}
	boolean isFull()
	{
		return (cap==size);
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
		return arr[0];
	}
	int getRear()
	{
		if(isEmpty())
		{
			return -1;
		}
		return arr[size-1];
	}
	void insertRear(int x)
	{
		if(isFull())
		{
			return;
		}
		arr[size]=x;
		size++;
	}
	void deleteRear()
	{
		if(isEmpty())
		{
			return;
		}
		size--;
	}
	void deleteFront()
	{
		if(isEmpty())
		{
			return;
		}
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
	}
	void insertFront(int x)
	{
		if(isFull())
		{
			return;
		}
		for(int i=size-1;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=x;
		size++;
	}
	void print()
	{
		for(int i=0;i<cap;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
}

public class ArrayImplementationOfDequeNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dequeue sb=new Dequeue(7);
		sb.insertFront(30);
		sb.insertRear(20);
		sb.insertFront(50);
		sb.insertRear(40);
		sb.insertFront(100);
		sb.insertRear(200);
		sb.insertFront(300);
		
		System.out.println(sb.getFront());
		System.out.println(sb.getRear());
		sb.print();

	}

}
