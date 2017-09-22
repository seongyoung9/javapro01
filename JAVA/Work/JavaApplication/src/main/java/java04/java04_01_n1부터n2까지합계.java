package java04;

import java.util.Scanner;

public class java04_01_n1부터n2까지합계
{
    
    public static void main(String[] args)
    {
        
        int n1 = 0, n2 = 0, sum = 0, i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("시작값을 입력해 주세요 : ");
        n1 = scan.nextInt();
        System.out.print("종료값을 입력해 주세요 : ");
        n2 = scan.nextInt();
        
        if ( n1 < n2)
        {
            
            for(i = n1; i <= n2; i++)
            {
                
                System.out.print( i );
                sum = sum + i;
                if (i < n2)
                {
                    System.out.print(" + ");
                }
            }
            
            System.out.println(" = " + sum);
            
        }
        else 
        {
            
            for (i = n1; i >= n2; i--)
            {
                
                System.out.print( i );
                sum = sum + i;
                if ( i > n2)
                {
                    System.out.print(" + ");
                }
                
            }
            System.out.println(" = " + sum);
        }
    }
    
}
