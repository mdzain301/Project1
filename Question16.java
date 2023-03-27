package assignment2;
import java.util.Scanner;
public class Question16 {


    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        char choice;
        do {
        System.out.print("Enter first number: ");
        double a = s.nextDouble();
        
        System.out.print("Enter second number: ");
        double b = s.nextDouble();
        
        if (a > 0 && a < 1 && b > 0 && b < 1) 
        {
            System.out.println("Both numbers are between 0 and 1.");
        } else 
        {
            System.out.println("At least one number is not between 0 and 1.");
        }
        System.out.println("Continue Y/N:");
        choice=s.next().charAt(0);
        }while(choice=='y'||choice=='Y');
    }
}


