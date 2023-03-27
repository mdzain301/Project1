package assignment2;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
	        
	        Scanner s = new Scanner(System.in);
	        int a, b, sum;
	        char choice;
	        
	        do {
	            System.out.print("Enter the first number: ");
	            a = s.nextInt();
	            System.out.print("Enter the second number: ");
	            b= s.nextInt();
	            
	            sum = a + b;
	            System.out.println("The sum of " + a + " and " + b + " is " + sum);
	            
	            System.out.print("Do you want to perform the operation again? (y/n): ");
	            choice = s.next().charAt(0);
	        } while (choice == 'y' || choice == 'Y');
	        
	       
	    }

	}


