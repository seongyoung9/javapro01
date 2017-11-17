package java04;

public class for문 
{
   
    public static void main(String[] args)
    {
        
        for (int i = 1; i <= 5; i++) // 줄의양 = 별의양
        {
            
            for (int j=5; j >= i; j--) // 별의 개수 i값만큼 j가 반복
            {
                
                System.out.print("*");
                
            }
            System.out.println("");//띄어쓰기
            
        }
        
    }
    
}
