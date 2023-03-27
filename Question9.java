package assignment2;
import java.util.Scanner;

public class Question9{
	public static void main(String[]args) {
	
		Scanner s=new Scanner(System.in);
	 String Choice;
	 do {
		System.out.println("Enter the Number:");
		int a=s.nextInt();
		int b=0;
		for(int i=2;i<=a-1;i++) 
		{
			if(a%i==0) 
			{
				b++;
			}
			if(b==0) 
			{
				System.out.println("Prime Number");
				break;
			}else 
			{
				System.out.println("Not Prime Number");
				break;
			}
		}System.out.println("Want To Continue YES/NO");
		Choice=s.next();
	}while(Choice.equals(("YES")));
}
}