package java07;

import java.util.Scanner;

public class ex07_05_랜덤숫자맛추기 
{
    
    public static void main(String[] args)
    {
        
        Scanner key = new Scanner(System.in);
        
        int ran = (int)(Math.random()*99);
        System.out.println("수를 결정하였습니다. 맞추어 보세요");
        int x = 100, min = 0, max = 99;
        for (int i = 1 ;; i ++ )
        {
            System.out.print(i  + ">>" );
            int input = key.nextInt();
            
            
            if (input < ran ) 
            {
                System.out.println("더 높게");
                min = input;
            }
            else if (input > ran)
            {
                System.out.println("더 낮게");
                max = input;
            }
            else
            {
                break;
            }
            System.out.println(min + " ~ " + max);
            
        }
        System.out.println("맞았습니다!!!!!~!~!~!~!");
        
    }
    
}
