package assignment2;

public class Question12 {
		  public static void main(String[] args)
		  {
		     int a = 0;
		    
		    
		    for (int i = 101; i < 200; i++) // Iterate over all integers from 101 to 199
		    {
		      
		      if (i % 7 == 0)// If the integer is divisible by 7, add it to the sum
		      {
		        a += i;
		      }
		    }
		     
		   
		    System.out.println("The sum : " + a); // Output the sum of all integers divisible by 7
		  }
		}

