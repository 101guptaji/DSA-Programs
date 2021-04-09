import java.util.Scanner;

public class Queue_implement {

	public static void main(String[] args) {
		
		int choice=0;  
	    Scanner sc = new Scanner(System.in);  
	    Queue q1=new Queue(); 
	    
	    while(choice != 5)  
	    {  
	        System.out.println("Chose one from the below options...");  
	        System.out.println("\n1.Enqueue\n2.Dequeue\n3.Peek \n4.Show\n5.Exit");  
	        System.out.println("\nEnter your choice \n");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   
	            	System.out.println("Enter item to insert");  
	            	int i1=sc.nextInt();
	                q1.enqueue(i1);;  
	                break;  
	            }  
	            case 2:  
	            {  
	            	int item=q1.dequeue();
	        		if(item==-1)
	        			System.out.println("Queue is empty");
	        		else
	        			System.out.println("Item deleted="+item);
	                break;  
	            }  
	            case 3:  
	            {  
	                int item=q1.peek();
	                if(item==-1)
	                	System.out.println("Queue is Empty");
	                else
	                	System.out.println("Item at front: "+item);
	                break;  
	            } 
	            case 4:  
	            {  
	                q1.show();  
	                break;  
	            }  
	            case 5:   
	            {  
	                System.out.println("Exiting....");  
	                System.exit(0);  
	                break;   
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }   
	        };  
	    }  
	    
	    sc.close();
	}

}
