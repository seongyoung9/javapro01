package java07;

import java.util.Scanner;

public class ex07_03_유효점수 
{
    
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("심사위원의 수를 입력하시오 : ");  
        int size = key.nextInt();
        
        int[] sim = new int[size];
        int i = 0, sum = 0;
        double ave = 0;
        
        for ( i = 0; i <= sim.length-1; i ++)
        {
            System.out.print(i+1 + "번째 점수를 입력해 주세요 : ");
            sim[i] = key.nextInt();            
        }
        System.out.print(sim.length + "명의 심사위원 점수는 : ");
        for ( i = 0; i <= sim.length-1; i++)
        {
            System.out.print(sim[i] + "  ");
        }
        for(i = 0; i <= sim.length -1; i++)
        {
            for (int j = i; j <= sim.length -1; j++)
            {
                if (sim[i] > sim[j])
                {   
                    int temp = sim[i];
                    sim[i] = sim[j];
                    sim[j] = temp;
                }
            }
        }//숫자 정렬
        System.out.print("\n유효점수 : ");
        for ( int j = 1; j <= sim.length -2; j++)
        {
            System.out.print(sim[j] + "  ");
            sum = sum + sim[j];
        }
            ave = (double)sum / (sim.length-2);
        System.out.println("\n합계는 : " + sum);
        System.out.println("평균은 : " + ave);
    }
    
    
}
