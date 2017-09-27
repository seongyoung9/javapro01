package javaex;

import java.util.Scanner;

public class javaex_각자릿수합 
{
    
    public static void main(String[] args)
    {
        
        Scanner key = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int num = key.nextInt();
        
        System.out.println(gag(num));
    }
    public static int gag(int x)
    {
        int sum = 0;
        int a;
        while (x != 0)
        {
            a = x % 10;
            sum = sum + a;
            x = x / 10;
        }
        
                
        return sum;
        
    }
    
}
