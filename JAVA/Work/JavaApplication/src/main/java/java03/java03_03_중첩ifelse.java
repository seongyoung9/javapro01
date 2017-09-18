package java03;

import java.util.Scanner;

public class java03_03_중첩ifelse 
{
    
    public static void main(String[] args)
    {
        
        int grade = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요");
        grade = scan.nextInt();
        
        System.out.print(grade);
        
        if ( grade >= 90)
        {
            System.out.println("점의 학점은 A입니다.");
        }
        else if ( grade >= 80 )
        {
            System.out.println("점의 학점은 B입니다.");
        }
        else if ( grade >= 70 )
        {
            System.out.println("점의 학점은 C입니다.");
        }
        else
        {
            System.out.println("점의 학점은 F입니다.");
        }
    }
    
}
