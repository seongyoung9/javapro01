package java07;

public class java07_01_배열의선언과생성 
{
    
    public static void main(String[] args)
    {
        
        // int[] num = new int[6];
        
        int size = 6;
        int[] number = new int[size];
        
        for (int j = 0; j < number.length; j++)
        {
            number[j] = j;
            //number [0] = 0
            System.out.println( number[j]);
            
        }
        
    }

}
