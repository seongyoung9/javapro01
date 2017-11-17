package java06;

public class java06_01_메서드쓰는이유4 
{
    
    public static void main(String[] args)
    {
        
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        int i;
        
        for ( i = 1; i <= 10; i++)
        {
            
            sum = sum + i;
            
        }
        System.out.println("sum = " + sum);
        
        for ( i = 1; i <= 100; i++)
        {
            
            sum2 = sum2 + i;
            
        }
        System.out.println("sum2 = " + sum2);
        
        for ( i = 100; i <= sum2; i++)
        {
            
            sum3 = sum3 + i;
            
        }
        System.out.println("sum3 = " + sum3);
        
    }
    
}
