package javaex;

import java.util.Arrays;
import java.util.Scanner;;

public class ex07_05_유효점수 {
    
    public static void main(String[] args) 
    {
     
        Scanner key = new Scanner(System.in);
        System.out.print("심사위원 숫자를 입력해 주세요 : ");
        int 심사위원수 = key.nextInt();
        int[] 점수 = new int[심사위원수];
        
        for(int i = 0; i <= 점수.length -1 ; i++)
        {
            System.out.print(심사위원수 + "명의 점수 입력 : ");
            
            점수 [i] = key.nextInt();   
            
            
        }
        
        Arrays.sort(점수);
        int 합계 = 0;
        System.out.print("유효점수는 : ");
        for (int j = 1; j <= 점수.length -2 ; j++)
        {   
            System.out.print(점수[j] + "  ");
            합계 = 합계 + 점수[j];
            
        }
        System.out.println();
        System.out.println("합계는 : " + 합계 ); 
        //System.out.printf("평균은 %s",); 
        
        double 평균 = (double)합계 / (심사위원수-2);
            
        System.out.printf("%.2f", 평균);

       
 
    }
    
}
