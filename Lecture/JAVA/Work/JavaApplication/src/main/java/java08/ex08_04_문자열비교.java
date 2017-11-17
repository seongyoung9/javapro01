package java08;

import java.util.Scanner;

public class ex08_04_문자열비교 
{
    
    public static void main(String[] args)
    {
        
        Scanner key = new Scanner(System.in);
        System.out.print("첫번째 문자열을 입력해 주세요");
        String str1 = key.next();
        System.out.print("두번째 문자열을 입력해 주세요");
        String str2 = key.next();
        
        // equals을 이용
        
        if (str1.equals(str2))
        {
            System.out.println("str1.equals(str2) : same ");
        }
        else
        {
            System.out.println("str1.equals(str2) : not same ");
        }
        
        // ==을 이용
        
        if (str1 == str2)
        {
            System.out.println("str1 == str2 : same ");
        }
        else
        {
            System.out.println("str1 == str2 : not same ");
        }
    }
    
}
