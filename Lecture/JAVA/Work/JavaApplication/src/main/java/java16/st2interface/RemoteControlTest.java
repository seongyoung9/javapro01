package java16.st2interface;

public class RemoteControlTest 
{
    public static void main(String[] args) 
    {
      
        
    
        RemoteControl rm = new Television();
    
        rm.turnOn();
        rm.turnoff();
        
    
        rm = new Fridge();
    
        rm.turnOn();
        rm.turnoff();
    
    
    
    }
}
