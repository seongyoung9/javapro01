package java04;

import java.util.Scanner;

public class java04_21_무한구구단
{
    
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        
        
        for ( ; true ; )
        {
            
            System.out.print("시작단을 입력해 주세요 : ");
            a = scan.nextInt();
            System.out.print("끝단을 입력해 주세요 : ");
            b = scan.nextInt();
            
            if (a > b)
            {
                c = a; 
                a = b;
                b = c;
            }
            if ( a == 0 || b == 0)
            {
                System.out.println("숫자에 0이 있습니다....");
                break;
            }
            for ( int i = a; i <= b; i++)
            {  
                for( int j = 1; j <= 9; j++)
                System.out.println( i + " X " + j + " = " + i*j);                
            }
            
            
        }
        
    }
    
}
