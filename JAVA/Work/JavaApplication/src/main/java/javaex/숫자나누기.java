package javaex;

import java.util.Arrays;

public class 숫자나누기 
{
    
    public static void main(String[] args) 
    {

        String s = "74 874 9883 73 9 73646 774";        
        
        String[] 분리 = s.split(" ");
        
        int[] 숫자 = new int[분리.length];
        int 합계 = 0;
        for (int i = 0; i < 분리.length ; i++)
        {
            숫자[i] = Integer.valueOf(분리[i]);
            
            합계 = 합계 + 숫자[i];
        }
        Arrays.sort(숫자);
         
        
        System.out.println("합계는 : " + 합계);
        System.out.println("평균은 : " + (합계 / 분리.length));
        System.out.println("최대값은 : " + 숫자[(분리.length)-1]);
        System.out.println("최소값은 : " + 숫자[0]);
        
        
    }
    
}
