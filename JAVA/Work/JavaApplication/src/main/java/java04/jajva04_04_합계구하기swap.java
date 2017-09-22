package java04;

import java.util.Scanner;

public class jajva04_04_합계구하기swap 
{
 
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("시작값을 입력해 주세요 : ");
        int s = scan.nextInt();
        System.out.print("종료값을 입력해 주세요 : ");
        int f = scan.nextInt();
        int sum = 0;
        int temp = 0;
        int i = 0;
        if ( s > f)
        {
            temp = f;
            f = s ;
            s = temp;
        }
        for (i = s ; i <= f; i++ )
        {
           sum = sum + 1;    // 1 + 1 + 1 + 1 + 1
           temp = temp + i;  // 1 + 2 + 3 + 4 + 5
        }
        System.out.println("for문 돌아가는 횟수 : " + sum + " 입니다.");
        System.out.println("합계는 : " + temp + " 입니다.");
    }
    
}
