package java06;

public class java06_01_메서드쓰는이유2
{
    public static int getSum(int start, int end)
    {
        
        int sum = 0;
        
        for (int i = start; i <= end; i++)
        {
            
            sum = sum + i;
            
        }
        
        return sum;
        
    }
    
    public static void main(String[] args)
    {
        int sum = getSum(1, 10);
        System.out.println("sum = " + sum);
        
        int sum2 = getSum(1, 100);
        System.out.println("sum2 = " + sum2);
        
        int sum3 = getSum(100, sum2);
        System.out.println("sum3 = " + sum3);
    }
}
