package java04;



public class java04_16_더하기 
{
    
    public static void main(String[] args)
    {
        int sum = 0;
       for (int i = 1; i <= 10 ; i++)
       {
           
           for (int j = 1; j <= i; j++)
           {
               
               sum = sum + j;
              
           }
           
       }
       System.out.println(sum);
        
    }
    
}
