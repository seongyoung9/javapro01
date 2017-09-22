package java04;

import java.util.Scanner;

public class java04_13_2단구구단가로 
{
    
    public  static void main(String[] args)
    {
        int y = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("구구단 몇단?? : ");
        int x = scan.nextInt();
        System.out.println(x + "단!!!!");
        for (int i = 1; i <= 9; i++)
        {
            
            y = x * i;
            System.out.print(x + " X " + i + " = " + y );
            if ( i < 9 )
            {
                System.out.print(",   ");
            }
            else
            {
                System.out.println(".");
            }
            
        }
        
        
    }
    
}
