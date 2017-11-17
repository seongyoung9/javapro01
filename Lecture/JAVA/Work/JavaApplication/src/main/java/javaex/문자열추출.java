package javaex;

import java.util.Scanner;

public class 문자열추출 {
    
    public static void main(String[] args) {

        
        
        Scanner key = new Scanner(System.in);
        System.out.print("입력하시오 : ");
        String input = key.next();
        //String input = "ab4cd";
        
        char ch = input.charAt(0);
        
        if( ('a' <= ch &&  ch <= 'z') || ( 'A' <= ch && ch <= 'Z') )
        {
            System.out.println("영문자 입니다.");
        }
        else if('0' <= ch && ch <= '9')
        {
            System.out.println("숫자입니다.");
        }
        else if(('!' <= ch && ch <= '/')||(':' <= ch && ch <= '?')||('[' <= ch && ch <= '_')||('{' <= ch && ch <= '~'))
        {
            System.out.println("기호 입니다..");
        }
        
        else
        {
            System.out.println("???????");
        }
        System.out.println(ch);
    }
    
}
