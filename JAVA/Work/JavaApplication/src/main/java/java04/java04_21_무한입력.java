package java04;

import java.util.Scanner;

public class java04_21_무한입력 
{
    
    public static void main (String[] args)
    {
        int s = 0;
        Scanner scan = new Scanner(System.in);
        
        for ( ; true ; )
        {
            
            System.out.print("정수를 입력하시오 : ");
            s = scan.nextInt();
            
            
            if (s < 0)
            {
                System.out.println("정상 종료합니다.");
                break;
            }
            else
            {
                System.out.printf("입력한 값은 %d 입니다.\n",s);
            }
            
            
        }
        
    }
    
    
}
