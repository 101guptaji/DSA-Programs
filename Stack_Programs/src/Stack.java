import java.util.Scanner;

public class Stack {
	static String[] stack;
	static int n;
	static int top=-1;
	
	Scanner sc=new Scanner(System.in);
	Stack(){
		System.out.println("*********Stack operations using array*********\n");  
		System.out.println("Enter size of stack");
		n=sc.nextInt();
		stack=new String[n];
	}
	
	// **************Adding an element onto the stack (push operation)*************
	
	public void push(String data) {
		if(isFull()){
			System.out.println("Overflow!");
			return;
		}
		top=top+1;
		stack[top]=data;
		System.out.println("item pushed");
		
	}
	
	boolean isFull() {
		if(top==n-1)
			return true;
		return false;
	}
	
	// **************Deletion of an element from a stack (Pop operation)*************
	
	void pop() {
		if(isEmpty()){
			System.out.println("Underflow!");
			return;
		}
		//System.out.println(stack[top]);
		top=top-1;
		System.out.println("item popped");
	}

	boolean isEmpty() {
		if(top==-1){
			return true;
		}
		return false;
	}
	
	// **************Visiting each element of the stack (Peek operation)*************
	
	public String peek() {
		if(isEmpty()){
			return null;
		}
		return stack[top];
	}
	
	void show() {
		
		if(top==-1){
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Printing Items");
		for(int i=top;i>=0;i--){
			System.out.println(stack[i]);
		}
		
	}
	
}
