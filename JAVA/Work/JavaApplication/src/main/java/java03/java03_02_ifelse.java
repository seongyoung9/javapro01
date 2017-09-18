package java03;

import java.util.Scanner;

public class java03_02_ifelse 
{
    
    public static void main(String[] args)
    {
        
        int grade = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요");
        grade = scan.nextInt();
        
        if( grade >= 60)
        {
            
            System.out.println("합격입니다.");
            System.out.println("장학금을 받을수 있습니다.");
                        
        }
        else 
        {
            
            System.out.println("불합격입니다.");
            System.out.println("장학금을 받을수 없습니다");
            
        }
        
        
    }


    
}
