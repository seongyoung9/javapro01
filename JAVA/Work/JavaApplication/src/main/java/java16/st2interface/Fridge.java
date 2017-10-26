package java16.st2interface;

public class Fridge implements RemoteControl {
    
    @Override
    public void turnOn() {
        System.out.println("Fridge.turnOn");
    }
    
    @Override
    public void turnoff() 
    {
        System.out.println("Fridge.turnoff");
    }

    @Override
    public void moveLeft() {
        System.out.println("Fridge.moveLeft");
    }

    @Override
    public void moveRight() {
        System.out.println("Fridge.moveRight");
    }
    
}
