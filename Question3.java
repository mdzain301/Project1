package assignment2;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String choice;

        do {
        	 System.out.print("Enter an integer: ");
             int a = s.nextInt();
             int r = 0;
        while (a != 0)
        {
            int sum = a%10;
            r = r * 10 + sum;
            a =a/ 10;
        }
        
        System.out.println("Reversed Number: " + r);
        System.out.println("Do you wish to continue");
        choice=s.next();
        
      }
    while(choice.equals(("yes")));
      

}
}


