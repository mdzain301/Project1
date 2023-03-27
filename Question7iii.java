package assignment2;

public class Question7iii {
	public static void main(String[]args) {
	for(int i=1;i<=5;i++) //for rows 
	{
		for(int j=5;j>i;j--) // for left spaces
		{
			System.out.print(" ");			
			
		}
		for(int k=1;k<=i;k++) //For columns 
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
