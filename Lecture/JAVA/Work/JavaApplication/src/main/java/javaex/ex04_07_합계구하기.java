package javaex;

import java.util.*;

public class ex04_07_합계구하기 
{
    
    public static void main(String[] args)
    {

        Scanner key = new Scanner(System.in);
        
        System.out.print("시작값 입력 : ");
        int 시작 = key.nextInt();
        System.out.print("종료값 입력 : ");
        int 종료 = key.nextInt();
        
        if ( 종료 < 시작)
        {
            int 변환 = 시작 ;
            시작 = 종료;
            종료 = 변환;
        }

        int 합계 = 0;
        
        for ( int i = 시작 ; i <= 종료 ;  i++ )
        {
           
            합계 = 합계 + i ;
 
        }
        
        System.out.println(시작 + "부터 " + 종료 + "까지의 합계는 " + 합계);
    }
    
}
