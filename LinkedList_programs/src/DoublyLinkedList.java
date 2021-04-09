

public class DoublyLinkedList {
	Node head=null;
	
	private class Node{
		Node prev;
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			prev=null;
			next=null;
		}
	}

	// **************INSERTION at end**************
	public void add(int d) {
		Node n1=new Node(d);
		if(head==null)
		{
			head=n1;
		}
		else{
			Node curr=head;
			while(curr.next!=null)
			{
				
				curr=curr.next;
			}
			Node pre=curr;
			//System.out.println("Prev data: "+pre.data);
			curr.next=n1;
			curr=curr.next;
			curr.prev=pre;
		}
	}

	// **************INSERTION by index**************
	public void add(int index, int value) {
		Node n1= new Node(value);
		if(index==0){
			n1.next=head;
			head=n1;
			System.out.println("\nAdded "+value+ " at index "+index);
		}
		else{
			Node curr=head;
			for(int i=0;i<index-1;i++){
				curr=curr.next;
				if(curr==null)
				{
					System.out.println("Can not insert at this index: "+index);
					return;
				}
			}
			n1.prev=curr;
			n1.next=curr.next;
			curr.next=n1;
			System.out.println("\nAdded "+value+ " at index "+index);
		}
		
	}
	
	
	public void display() {
		if(head==null)
			System.out.println("empty linked list");
		else{
			Node curr=head;
			while(curr!=null){
				System.out.println(curr.data);
				curr=curr.next;
			}
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
			head.prev=null;
			 System.out.println("\nRemoved element at index 0");
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
				return;
			}
		}
		//remove reference to index node 
		pre.next=curr.next;
		curr.next.prev=pre;
		 System.out.println("\nRemoved element at index "+index);
		
		
	}
	
	// **************DELETION BY VALUE**************
	/*
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
	}*/

	
}
