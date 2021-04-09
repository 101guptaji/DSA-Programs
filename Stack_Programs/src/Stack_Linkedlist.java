

public class Stack_Linkedlist {
	
	Node head; // head of list
	
	 // Linked list Node.
   // Node is a static nested class so main() can access it
	static class Node{
		String data;
		Node next;
		
		//Constructor
		Node(String d){data=d;}
	}
	
	Stack_Linkedlist()
	{
		System.out.println("*********Stack operations using Linked List*********\n");  
	      
	}
	
	// **************Adding a node to the stack (Push operation)**************
	
	public void push(String str) {
		
		// Create a new node with given data
		Node n1=new Node(str);
		n1.next=null;
		
		// If the Linked List is empty, then make the new node as head
		if(head==null)
			head=n1;
		
		else{
			// Else insert the new_node at 1st place
			n1.next=head;
			head=n1;
			System.out.println("Item pushed in linked list");
		}
	}

	// **************Deleting a node from the stack (POP operation)**************
	
	public void pop() {
		if(head==null)
			System.out.println("Underflow!");
		
		else{
			// Else remove item from 1st place
			head=head.next;
			System.out.println("Item popped from stack");
		}
		
	}

	// **************Visiting each element of the stack (Peek operation)**************
	
	public String peek() {
		if(head==null)
			return null;
		
		else{
			// Else remove item from 1st place
			return head.data;
		}
	
	}
	
	// **************Display the nodes (Traversing)**************
	
	public void show() {
		
		Node n1=head;
		//check if list is empty
		if(n1==null){
			System.out.println("stack is empty");
		}
		
		else{
			System.out.println("Stack:\n");
			// Traverse through the LinkedList till end
			while(n1!=null){
				System.out.println(n1.data);
				n1=n1.next;
			}
			System.out.println();
		}
	}
}
