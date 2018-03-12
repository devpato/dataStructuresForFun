package dataStructures;

public class Queue {
	private int size; //size of the queue
	private long[] queue; //slot to maintain the data
	private int front; //The index position for the element in the front 
	private int rear; // the index position of the back of the queue
	private int nItems; //counter to maintain the number of items in our queue
	
	public Queue(int size) {
		this.size = size;
		queue = new long [size];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long x) {
		rear++;
		queue[rear] = x;
		nItems++;	
	}
	
	public void view() {
		System.out.print("[ ");
		int i = 0;
		while( i < queue.length) {
			System.out.print(queue[i]+ " ");
			i++;
		}
		System.out.print("]");
	}
	
	public long remove() { //remove item from the front of the queue
		long temp = queue[front];
		front++;
		if (front == size) {
			 front = 0;
		}
		nItems--;		
		return temp;
	}
	
	public long peekFront() {
		return queue[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == size);
	}
}
