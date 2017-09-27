package java06;

import java.util.Scanner;

public class ex06_03_isNumber 
{
    public static void main(String[] args)
    {
        String arr = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열 작성 : ");
        arr = scan.next();
        System.out.println(arr);
        boolean c = isnumber(arr);
        
        System.out.println(c);
       
    }
    
    public static boolean isnumber(String x)
    {  
        boolean result = true;
      
        if ( x.equals(null) || x.equals("") || x.equals("asd"))
        {
            result = false;
        }
               
        
        return result;
        
    }
    
    
    
}
