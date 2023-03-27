package assignment2;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String choice;
        
        do {
        	System.out.print("Enter the number of terms: ");
            int n = s.nextInt();

           
            int a = 0, b = 1;
            if (n <= 0) {
                System.out.println("Please enter a positive integer");
            
            } else {
                System.out.println("Fibonacci sequence:");
                for (int i = 0; i < n; i++) {
                    System.out.println(a);
                    int c = a + b;
                   
                    a = b;
                    b = c;
                }
        	
            }System.out.println("Do you want to perform this action again ? yes/no");
            choice=s.next();
        

}while(choice.equals(("yes")));
}
}
