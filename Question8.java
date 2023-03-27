package assignment2;

import java.util.Scanner;

public class Question8 {

	  public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    char choice;
	    do {
	    System.out.print("Enter a number: ");
	    int n = s.nextInt();

	    int a = 0;
	    int b= 0;

	   
	    while (n > 0)
	    {
	      int c = n % 10;
	      
	      if (c % 2 == 0) {
	        // If digit is even, add it to a
	        a =a+c;
	      } else
	      {
	        b = b+c;
	      }
	      
	    n=n/10;
	    }

	   
	    System.out.println("Sum of even digits: " + a);
	    System.out.println("Sum of odd digits: " + b);
	    
	    System.out.println("Do You want perform this action again? Y/N");
	    
        choice=s.next().charAt(0);

	    
	    }while(choice=='y'|| choice=='Y');
	

	}
}
