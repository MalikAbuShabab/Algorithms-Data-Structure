import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        int m;
        
        do {
            System.out.print("Enter the number of lines: ");
            n = input.nextInt();
        }
        while( n<=0 );
        
        do {
            System.out.print("Enter the number of columns: ");
            m = input.nextInt();
        }
        while( m<=0 );
        
        for (int i=1; i<=n; i++)
        {
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            
            for (int j=1; j<=m; j++)
            {
                System.out.print("*");
            }
        
            System.out.println();
        }
        
    }
    
}
