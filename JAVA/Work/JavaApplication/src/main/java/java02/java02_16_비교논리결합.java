package java02;

public class java02_16_비교논리결합 
{
    public static void main(String[] args) 
    {
        
        int x = 3;
        int y = 4;
        
        System.out.println((x == y) && (x != y)); // false && true = false
        
        System.out.println((x > y) || (x < y));   // false || true = true
        
        System.out.println((x >= y) || (x <= y)); // false || true = true
        
        System.out.println((x == y) && (x != y) || (x < y));
                
    }
    
}
