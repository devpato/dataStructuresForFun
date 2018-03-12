package dataStructures;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class App {
	
	public static void main (String[] args) {
		
		//Stack
			//Stack stack = new Stack(10);
			
			/*while(!stack.isEmpty()) {
				System.out.println(stack.pop());
			}*/
			
			//reverseArray(123456);
		
		//Queue
			/*Queue queue = new Queue(5);
			queue.insert(1);
			queue.insert(2);
			queue.insert(3);
			queue.insert(4);
			queue.insert(5);
			queue.view();*/
		
	
	}	
	
	
	//Reverse Array
	public static void reverseArray(int x) {
		int []temp = populateArray(x);
		int z = temp.length-1;
		while(z>=0) {
			System.out.println(temp[z]);
			z--;
		}
	}
	
	//Populate Array of numbers
	public static int[] populateArray(int number) {
		String size = number+"";
		int [] arr = new int[size.length()];
		int i = 0;
		do { 
			arr[i] = number % 10; 
			number /= 10; 
			i++; 
		} while (number != 0); 
		
		return arr;
	}
}



