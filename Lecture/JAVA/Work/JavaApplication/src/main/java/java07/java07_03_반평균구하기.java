package java07;

import java.util.Scanner;

public class java07_03_반평균구하기 
{
    
    public static void main(String[] args)
    {
        
        int[] ban = new int[3];
        
        Scanner key = new Scanner(System.in);
        
        for (int i = 0 ; i <= ban.length -1 ; i++)
        {   
            System.out.print(i+1 + "번째 숫자를 입력해 주세요 : ");
            ban[i] = key.nextInt();
        }
        System.out.print("배열의 값은 : ");
        for (int i = 0 ; i <= ban.length -1 ; i++)
        {
            System.out.print(ban[i]);
            if ( i == ban.length -1 )
            {
                
            }
            else
            {
                System.out.print("," + "  ");
            }
        }
        
        
    }
    
    
}
