package assignment2;

import java.util.Scanner;

public class Question11 {

	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter three numbers: ");
	    int a = s.nextInt();
	    int b = s.nextInt();
	    int c = s.nextInt();

	    int largest = a;

	    if (b > largest) 
	    {
	      largest = b;
	    }

	    if (c > largest) 
	    {
	      largest = c;
	    }

	    System.out.println("The largest number is: " + largest);
	  }
	}


