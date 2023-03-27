package assignment2;

public class Question7v {
		  public static void main(String[] args) {
		    int a = 5;
		    int b = a - 1;
		    int x = 1;

		    for (int i = 0; i < a; i++)
		    {
		     
		      for (int j = 1; j <= b; j++)// Print spaces
		      {
		        System.out.print(" ");
		      }
		      
		      for (int j = 1; j <= x; j++) // Print digits
		      {
		        System.out.print(i+1);
		      }
		      
		      System.out.println();

		      
		      b--;
		      x += 2;
		    }
		  }
		}

	


