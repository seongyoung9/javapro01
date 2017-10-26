package java14.st8animal;

public class Dog extends Animal 
{
    
    private String bark = "wall";

    //--------------------------------------------------\\
    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
//----------------------------------------------------------------\\
    @Override
    public String toString() {
        return "Dog [bark=" + bark + ", getSleep()=" + getSleep()
                + ", getEat()=" + getEat() + "]";
    }

    public Dog() {
        super();
    }

    public Dog(int sleep, int eat, String bark) {
        super(sleep, eat);
        this.bark = bark;
    }
    
    
    
}
