package assignment2;

public class Question5 {
	    public static void main(String[] args) {
	
	          for (int i = 1; i <= 500; i++) {
	             int sum = 0;
	               int t = i;
	               while (t > 0) {
	            	   int digit = t % 10;
	                      sum =sum + (digit * digit * digit);
	                     t=t/10;
	                   }
	                    if (i == sum) {
	                        System.out.println(i + " is an Armstrong number.");
	                    }
	                }
	            }
	  }
