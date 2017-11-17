package java07;

public class java07_05_foreach 
{
    
    public static void main(String[] args)
    {
        
        int[] number = {10,20,30};
        
        for (int j = 0; j <= number.length -1; j++)
        {           
            System.out.println(number[j]);           
        }
        for (int value : number){
            System.out.println(value);
        }
        try {
            int x = 1/0;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        System.out.println("ASDASDad");
        String a = "abc";
        print(a);
        
    }
    public static void print(String x)
    {
        
        System.out.println(x);
        
    }
    
}
