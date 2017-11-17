package java06;

import java.util.Scanner;

public class ex06_03_isNumber2 
{
    
    public static void main(String[] args)
    {
        
        Scanner key = new Scanner(System.in);
        System.out.println("문자열을 입력해 주세요 : ");
        String s = key.nextLine();
         
        System.out.println(boo(s));
    }
    public static boolean boo(String x)

    {
        boolean re = true;
        
        if ( x.equals(null) || x.equals("") || x.equals("qwer"))
        {
            re = false;
        }
        else 
        {
            re = true;
        }
        return re; 
        
    }
}
