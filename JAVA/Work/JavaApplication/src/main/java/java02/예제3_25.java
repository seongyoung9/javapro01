package java02;

import java.util.Scanner;

public class 예제3_25 
{
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);       
        char ch = ' ';
        
        System.out.print("문자 하나를 입력하세요.----->");  
        
        String input = scanner.nextLine();
        ch = input.charAt(0);  //배열 첫번째숫자만 쓰겠다.
        
        if('0' <= ch && ch <= '9')
        {
            System.out.printf("입력하신 문자는 숫자입니다.\n");
        }
        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <='Z'))
        {            
            System.out.printf("입력하신 문자는 영문자 입니다.\n");           
        }
        
    }
    
}
