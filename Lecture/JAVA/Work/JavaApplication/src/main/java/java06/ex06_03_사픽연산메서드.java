package java06;

import java.util.Scanner;

public class ex06_03_사픽연산메서드 
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = 0, y = 0;
        System.out.print("첫번째 정수를 입력해 주세요 : ");
        x = scan.nextInt();
        System.out.print("두번째 정수를 입력해 주세요 : ");
        y = scan.nextInt();
        
        int add = Add(x,y);
        int minus = Minus(x,y);
        int mul = Mul(x,y);
        double div = Div(x,y);
        
        System.out.println(add);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(div);
               
    }
    
    public static double Div(int x, int y) {
        double d = (double)x / (double)y;
        return d;
    }
    
    public static int Mul(int x, int y) {
        int m = x * y;
        return m;
    }

    public static int Minus(int x, int y) {
        int mi = x - y;
        return mi;
    }

    public static int Add(int x, int y) {
        
        int a = x + y;
        return a;
    }
    
    
}
