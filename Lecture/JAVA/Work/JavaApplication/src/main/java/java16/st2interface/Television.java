package java16.st2interface;

public class Television implements RemoteControl,SerialCommunication
{

    @Override
    public void turnOn() 
    {
        System.out.println("Television.turnOn");
    }

    @Override
    public void turnoff() 
    {
        System.out.println("Television.turnoff");
    }

    @Override
    public void moveLeft() {
        System.out.println("Television.moveLeft");
    }

    @Override
    public void moveRight() {
        System.out.println("Television.moveRight");
    }

    @Override
    public void send() {
        
    }

    @Override
    public void receive() {
        
    }
    
}