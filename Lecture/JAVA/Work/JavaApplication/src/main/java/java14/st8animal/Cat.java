package java14.st8animal;

public class Cat extends Animal 
{
    
    private String play = "";
    
//---------------------------------------------------------\\
    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }
//---------------------------------------------------------------------\\
    @Override
    public String toString() {
        return "Cat [play=" + play + ", getSleep()=" + getSleep()
                + ", getEat()=" + getEat() + "]";
    }
//-----------------------------------------------------------------\\
    public Cat() {
        super();
 
    }

    public Cat(int sleep, int eat, String play) {
        super(sleep, eat);
        this.play = play;
    }
    
    
    
}
