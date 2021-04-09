import java.util.Scanner;

//Queue Implementation using Array

public class Queue {
	static int[] queue;
	static int front=-1;
	static int rear=-1;
	int n;
	Scanner sc=new Scanner(System.in);
	
	Queue(){
		System.out.println("*********Queue operations using array*********\n");  
	      
		System.out.println("Enter size of Queue");
		n=sc.nextInt();
		queue=new int[n];
	}
	
	// **************Adding an element onto the Queue (Enqueue operation)*************
	public void enqueue(int item) {
		if(isFull()){
			System.out.println("Overflow!");
			return;
		}
		if(front==-1 && rear==-1){
			front=rear=0;
		}
		else{
			rear+=1;
		}
		queue[rear]=item;
		System.out.println("Item inserted!");
		
	}
	
	// **************removing an element onto the Queue (Dequeue operation)*************
	public int dequeue() {
		if(front==-1 || front>rear){
			System.out.println("Underflow!");
			return -1;
		}
		else{
			int i=queue[front];
			if(front==rear)
				front=rear=-1;
			else
				front+=1;
		
			return i;
		}
	}
	
	// **************Check for if queue is full*************
	private boolean isFull() {
		if(rear==n-1)
			return true;
		return false;
	}
	
	// **************Check for if queue is empty*************
	private boolean isEmpty() {
		if(front==-1 && rear==-1)
			return true;
		return false;
	}
	
	// **************Print the item of the Queue (show operation)*************
	public void show() {
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Printing Items");
		for(int i=front;i<=rear;i++){
			System.out.println(queue[i]);
		}
	}

	public int peek() {
		if(isEmpty()){
			return -1;
		}
		return queue[front];
	}
	
}
