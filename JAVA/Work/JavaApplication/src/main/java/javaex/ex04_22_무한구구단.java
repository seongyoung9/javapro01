package javaex;

import java.util.*;

public class ex04_22_무한구구단 
{
    
    public static void main(String[] args) 
    {
        
        Scanner key = new Scanner(System.in);
        int 시작 = 0;
        
        for (;true;)
        {
        System.out.println("구구단 시작 (1)    종료 (0)");
       
        시작 = key.nextInt();
        
            if (시작 == 0)
            {
                break;
            }   
        System.out.print("시작단을 입력해 주세요 : ");        
        int 첫단 = key.nextInt();    
        System.out.print("마지막단을 입력해 주세요 : ");     
        int 막단 = key.nextInt();
        
            if (첫단 > 막단)
            {
                int 변환 = 첫단;
                첫단 = 막단;
                막단 = 변환;
            }
        
        구구단(첫단, 막단);
            
            
        }
    }

    private static void 구구단(int 첫단, int 막단) {
        for (int i = 첫단 ; i <= 막단 ; i++)
        {
            
            for (int j = 1 ; j <= 9 ; j++)
            {
                System.out.print(i + " * " + j + " = " + i*j + "  ");
            }
            System.out.println();
        }
    }
    
}
