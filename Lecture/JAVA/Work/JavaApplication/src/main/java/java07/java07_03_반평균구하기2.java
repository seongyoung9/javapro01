package java07;

import java.util.Scanner;

public class java07_03_반평균구하기2 
{
    
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("사이즈를 입력해 주세요 : ");
        int size = key.nextInt();
        int[] ban = new int[size];       
        int sum = 0; 
        int vud = 0;
        for (int i = 0 ; i <= ban.length -1 ; i++)
        {   
            System.out.print(i+1 + "번째 숫자를 입력해 주세요 : ");
            ban[i] = key.nextInt();
            sum = sum + ban[i];
            vud = sum / ban.length;
        }
        System.out.print("배열의 값은 : ");
        for (int i = 0 ; i <= ban.length -1 ; i++)
        {
            System.out.print(ban[i]);
            if ( i == ban.length -1 )
            {
                System.out.println();
            }
            else
            {
                System.out.print("," + "  ");
            }
        }
        System.out.println("합계는 : " + sum);
        System.out.println("평균은 : " + vud);
        
        
    }  
}
