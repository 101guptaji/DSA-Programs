
import java.util.Scanner;

public class Stack_Implement {
	
	
	public static void main(String[] args) {
		
		int choice=0;  
	    Scanner sc = new Scanner(System.in);  
	    Stack_Linkedlist s = new Stack_Linkedlist();  
	    
	    while(choice != 5)  
	    {  
	        System.out.println("Chose one from the below options...");  
	        System.out.println("\n1.Push\n2.Pop\n3.Peek \n4.Show\n5.Exit");  
	        System.out.println("\nEnter your choice \n");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   
	            	System.out.println("Enter item to push");  
	            	String s1=sc.next();
	                s.push(s1);  
	                break;  
	            }  
	            case 2:  
	            {  
	                s.pop();  
	                break;  
	            }  
	            case 3:  
	            {  
	                String item=s.peek();
	                if(item==null)
	                	System.out.println("Stack is Empty");
	                else
	                	System.out.println("Item at top: "+item);
	                break;  
	            } 
	            case 4:  
	            {  
	                s.show();  
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
