package java11.st2;

public class BoxTest 
{
    
    public static void main(String[] args) 
    {
        int tmp;
        
        Box myBox = new Box(100, 100, 100);
        
        myBox.printvolum();
        System.out.println(myBox.toString());
        System.out.println(myBox.getVolum());
    }
    
}
