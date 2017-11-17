package java04;

import java.util.Scanner;

public class java04_15_대소문자교체 
{
    
    public static void main(String[] args) 
    {
        char ch = ' ';
        int x = 0;
        char n = ' ';
        Scanner scan = new Scanner(System.in);
        System.out.print("문자 하나를 입력해 주세요(아닐시 첫글자만됨) : ");
        String in = scan.next();
        ch = in.charAt(0);
        
        if('a' <= ch && ch <= 'z')
        {  
           x = (int)ch -32;
           n = (char)x;
           System.out.println(n + "입니다.");
            
        }
        if('A' <= ch && ch <= 'Z')
        {  
           x = (int)ch + 32;
           n = (char)x;
           System.out.println(n + "입니다.");
            
        }
        
    }
    
}
