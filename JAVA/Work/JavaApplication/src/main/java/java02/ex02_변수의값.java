package java02;

public class ex02_변수의값 
{
    
    public static void main(String[] args) 
    {
        
        int x = 1;
        int y = 1;
        
        int a = ++x * 2;  //4  
        // -> x = x+1 -> a = x*2
                
        int b = y++ * 2;  //2
        // -> b = y*2 -> y = y+1       
        
        System.out.println(a);
        System.out.println(b);
        
        
    }
    
}
