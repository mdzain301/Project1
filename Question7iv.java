package assignment2;

public class Question7iv {
public static void main(String[] args) {
		
	
		    int n = 5;
		    int a = n - 1;
		    int b = 1;

		    for (int i = 1; i <= n; i++) 
		    {
		     
		      for (int j = 1; j <= a; j++) //print Spaces
		      {
		        System.out.print(" ");
		      }
		     
		      for (int j = 1; j <= b; j++) //print *
		      {
		        System.out.print("*");
		      }
		      
		      System.out.println();
		      a--;
		      b=b+2;
		     
		    }
		  }
		}

