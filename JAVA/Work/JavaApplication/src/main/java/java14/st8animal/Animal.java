package java14.st8animal;

public class Animal 
{

    private int sleep = 0;
    private int eat = 0;
    
    //------------------------------------------------------------------\\
    public int getSleep() {
        return sleep;
    }
    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
    public int getEat() {
        return eat;
    }
    public void setEat(int eat) {
        this.eat = eat;
    }
    //-----------------------------------------------------------------\\
    @Override
    public String toString() {
        return "Animal [sleep=" + sleep + ", eat=" + eat + "]";
    }
    
    //-------------------------------------------------------------\\
    

    public Animal() {
        super();
    }
    
    public Animal(int sleep, int eat) {
        super();
        this.sleep = sleep;
        this.eat = eat;
    }
    
    
}
