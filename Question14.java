package assignment2;
import java.util.Scanner;
public class Question14 {
	   public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        boolean z = true;
	        while (z) {
	            System.out.println("Please choose an option:");
	            System.out.println("1. Add two numbers");
	            System.out.println("2. Subtract two numbers");
	            System.out.println("3. Multiply two numbers");
	            System.out.println("4. Exit");
	            int choice = s.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter two numbers to add:");
	                    int a = s.nextInt();
	                    int b = s.nextInt();
	                    int sum = a + b;
	                    System.out.println("The sum of " + a + " and " + b + " is " + sum);
	                    break;
	                case 2:
	                    System.out.println("Enter two numbers to subtract:");
	                    int c = s.nextInt();
	                    int d = s.nextInt();
	                    int diff = c - d;
	                    System.out.println("The difference between " + c + " and " + d + " is " + diff);
	                    break;
	                case 3:
	                    System.out.println("Enter two numbers to multiply:");
	                    int x = s.nextInt();
	                    int y = s.nextInt();
	                    int product = x * y;
	                    System.out.println("The product of " + x + " and " + y + " is " + product);
	                    break;
	                case 4:
	                    z = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	      
	    }
	}



