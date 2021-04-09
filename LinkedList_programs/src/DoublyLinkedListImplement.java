
public class DoublyLinkedListImplement {

	public static void main(String[] args) {
		DoublyLinkedList dl1=new DoublyLinkedList();
		 dl1.add(5);
		 dl1.add(10);
		 dl1.add(15);
		 dl1.display();
		 
		 dl1.add(1,25);
		// System.out.println("\nAfter adding 25 at index 1");
		 dl1.display();
		 
		 dl1.remove(1);
		 dl1.display();

	}

}
