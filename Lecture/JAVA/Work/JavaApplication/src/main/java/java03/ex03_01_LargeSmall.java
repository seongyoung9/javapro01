package java03;

import java.util.Scanner;

public class ex03_01_LargeSmall 
{
    
    public static void main(String[] args)
    {
        
        int n = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요.");
        n = scan.nextInt();
        
        if ( n >= 100)
        {
            
            System.out.println("Large");
            
        }
            /* else if ( n == 100)
            {
            
                System.out.println("입력한 숫자는 100입니다.");
            
             }*/
        else 
        {
            
            System.out.println("Small");
            
        }
        
        
    }
    
}
