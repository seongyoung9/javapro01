package java18;

import java.util.Random;
import java.util.Scanner;

public class Java_03_Random
{
    
    public static void main(String[] args)
    {
        
       Random rand = new Random();
       
       for (int i = 1 ; i <= 5 ; i++ )
       {
           double rand1 = new Random().nextDouble()*10;
           System.out.println(rand1);
       }
       
       Scanner key = new Scanner(System.in);
       System.out.print("최대값 입력 : ");
       int max = key.nextInt();
       System.out.print("최소값 입력 : ");
       int min = key.nextInt();
       System.out.println(max);
       System.out.println(min);
       for ( int i = 1 ; i <= 10 ; i++)
       {
       int rand2 = rand.nextInt(max - min + 1) + min;
       System.out.println(rand2);
       }
       
    }
    
}
