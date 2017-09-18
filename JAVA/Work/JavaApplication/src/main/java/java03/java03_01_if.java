package java03;

import java.util.Scanner;

public class java03_01_if 
{
         
    public static void main(String[] args)
    {
        int grade = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입혁해 주세요.");
        grade = scan.nextInt();
                
        if ( grade >= 60 )
        {
            System.out.println("합격입니다.");
            System.out.println("장학금도 받을 수 있습니다.");
        }
        else 
        {
            System.out.println("불합격 입니다.");
        }
      
    }
    
}
