package java12.st1rect;

import java.util.Scanner;
import java12.st1rect.Rect;

public class RectTest 
{
    
    public static void main (String[] args)
    {
        Scanner key = new Scanner(System.in);
        Rect tangle = new Rect();
       
        System.out.print("가로를 입력해 주세요 : ");
        tangle.setWidth(key.nextInt());
        System.out.print("세로를 입력해 주세요 : ");
        tangle.setHeight(key.nextInt());
        
        System.out.println("사각형의 넓이 : " + tangle.getArea());
        System.out.println("사각형의 둘레 : " + tangle.getPerimiter());
    }
    
}
