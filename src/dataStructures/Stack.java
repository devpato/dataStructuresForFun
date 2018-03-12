package dataStructures;

public class Stack {
	private int maxSize;
	private long[] stack;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stack = new long [maxSize];
		this.top = -1;
	}
	
	public void push(long x) {
		if(isFull()) {
			System.out.println("Stack is already full");
		} else {
			top++;
			stack[top] = x;
		}
		
	}
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("Stack is already empty");
			return -1;
		} else {
			int oldTop = top;
			top --;
			return stack[oldTop];
		}
		
	}
	
	public long pick() {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize-1 == top);
	}
}
