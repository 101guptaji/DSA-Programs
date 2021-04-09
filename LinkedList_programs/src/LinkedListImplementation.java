// Java program to implement a Singly Linked List
class LinkedList{
	Node head; // head of list
	
	 // Linked list Node.
    // Node is a static nested class so main() can access it
	static class Node{
		String data;
		Node next;
		
		//Constructor
		Node(String d){data=d;}
	}
	
	// **************INSERTION**************
	public void add(String str) {
		
		// Create a new node with given data
		Node n1=new Node(str);
		n1.next=null;
		
		// If the Linked List is empty, then make the new node as head
		if(head==null)
			head=n1;
		
		else{
			// Else traverse till the last node and insert the new_node there
			Node r1=head;
			while(r1.next!=null){
				r1=r1.next;
			}
			//System.out.println("Adding "+ str);
			// Inserting the new_node at last node
			r1.next=n1;
			//System.out.println(head.data);
		}
	}
	
	// **************INSERTION by index**************
	public void add(int index, String value) {
		Node n1=new Node(value);
		n1.next=null;
		if(index==0){
			n1.next=head;
			head=n1;
			
		}
		else{
			Node r1=head;
			for(int i=0;i<index-1;i++){
				r1=r1.next;
				if(r1==null)
				{
					System.out.println("Can not insert at this index: "+index);
					return;
				}
			}
			
			n1.next=r1.next;
			r1.next=n1;
			//System.out.println(head.data);
		}
		
	}
	
	
	
	// **************TRAVERSAL**************
	
	// Method to print the LinkedList.
	public void display() {
		
		Node n1=head;
		//check if list is empty
		if(n1==null){
			System.out.println("LinkedList is empty");
		}
		
		else{
			//System.out.println("Linked List:\n");
			// Traverse through the LinkedList till end
			while(n1!=null){
				System.out.print(n1.data+" ");
				n1=n1.next;
			}
			System.out.println();
		}
	}

	// **************DELETION BY INDEX**************

	public void remove(int index) {
		Node pre = null;
		Node curr=head;
		
		// CASE 1:
        // If index is 0, then head node itself is to be deleted
		
		if(index==0 && curr!=null)
		{
			head=curr.next;
			return;
		}
		
		// CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
		//traverse before that index
		for(int i=0;i<index;i++){
			pre=curr;
			curr=curr.next;
			//if the index is not present
			if(curr==null){
				System.out.println("out of index");
			}
		}
		//remove reference to index node 
		pre.next=curr.next;
		
		
	}
	
	// **************DELETION BY VALUE**************
	
	public void remove(String ele) {
		Node curr=head;
		boolean flag=false; //flag if that value is present  
		
		// CASE 1:
        // If head node itself holds the key to be deleted
 
		if(curr!=null && curr.data==ele){
			head=curr.next;
			return;
		}
		
		else{
			
			Node pre=head; //to store reference to previous node of current node
			curr=head.next; ////to store reference to current node
		while(curr!=null){
			
			if(curr.data==ele){
				flag=true;
				break;
			}
			pre=curr;
			curr=curr.next;
		}
		
		if(flag)
			pre.next=curr.next;
		else
			System.out.println("No element in list");
		}
	}





	
	
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList(); //empty linkedlist
		
		l1.add("IIIT");
		l1.add("Nagpur");
		l1.add(0,"Himanshu");
		l1.add(1,"Gupta");
		
		l1.display();
		
		l1.remove(2);
		
		l1.display();
		
		l1.add("live");
		l1.add("Jaipur");
		
		l1.display();
		
		l1.remove("Himanshu");
		l1.display();
		
		l1.remove("live");
		l1.display();
	}

}
