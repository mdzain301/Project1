package assignment2;

public class Question10 {
    public static void main(String[] args) 
    {
        int i, j;
        
        for (i = 2; i <= 20; i++) {
            int a = 0;
            
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    a++;
                }
            }
            
            if (a == 0) {
                System.out.print(i + " ");
            }
        }
    }
}



