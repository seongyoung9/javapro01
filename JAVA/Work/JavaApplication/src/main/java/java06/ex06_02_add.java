package java06;

import java.util.Scanner;

public class ex06_02_add 
{
    
    public static void main(String[] args)
    {
        
        Scanner key = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력해 주세요 : ");
        int a = key.nextInt();
        System.out.print("두번째 정수를 입력해 주세요 : ");
        int b = key.nextInt();
        
        System.out.println(a + " + " + b + " = " + add(a,b) );
        
    }
    
    public static int add( int x , int y)
    {
        
        return x + y ;
        
    }
}
