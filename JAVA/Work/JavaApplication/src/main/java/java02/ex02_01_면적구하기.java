package java02;

import java.util.Scanner;

public class ex02_01_면적구하기 
{
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int w = 0;
        int h = 0;
        int area = 0;
        int pe = 0;
        String x;
    
        System.out.print("가로의 길이를 입력해 주세요 : ");
        w = keyboard.nextInt();
        
        System.out.print("세로의 길이를 입력해 주세요 : ");
        h = keyboard.nextInt();  
        
        System.out.print("문자를 입력해 주세요 : ");
        x = keyboard.next();
               
        area = w * h;
        pe = 2*(w+h);
        
        System.out.println("사각형의 넓이는 : " + area);
        System.out.println("사각형의 둘레는 : " + pe);
        System.out.println(x);
    }
    
}
