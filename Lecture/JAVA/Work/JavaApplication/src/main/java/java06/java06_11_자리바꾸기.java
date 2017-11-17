package java06;

public class java06_11_자리바꾸기 
{
    
    public static void main(String[] args)
    {
        
        int a = 5;
        int b = 3;
        
        System.out.println("swap 전 : a = " + a + " , b = " + b);
        swap (a,b);                //실제 데이터는 바뀌지 않는다
        System.out.println("swap 후 : a = " + a + " , b = " + b);
        
    }

    public static void swap(int a, int b) 
    {
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("swap 안 : a = " + a + " , b = " + b);
        
    }
    
    
}
