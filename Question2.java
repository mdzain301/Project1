package assignment2;

import java.util.Scanner;

public class Question2 {
	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        
	        String choice;
	        do {
	        
	        	System.out.print("Enter a positive integer: ");
		        int a = s.nextInt();
		        
		        if (a <= 0) {
		            System.out.println("Invalid! Please enter a positive integer");
		        }
		        else {
		            System.out.println("Multiplication table of " + a + ":");
		            for (int i = 1; i <= 10; i++) 
		            {
		                System.out.println(a+"x"+i+"="+(a*i));
		               
		            }
		            }
		            System.out.println("Do you wish to Continue Yes/No");
	                choice=s.next();
	            
	        }  while(choice.equals(("yes")));
	    }
}


	
	
	


