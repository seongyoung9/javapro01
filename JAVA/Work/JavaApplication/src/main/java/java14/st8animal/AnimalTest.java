package java14.st5animal;

public class AnimalTest {
    
    public static void main(String[] args) 
    {
        Animal ani = new Animal(6, 2);
        
        Dog wall = new Dog(4, 3, "kkkkkKKKkkk");
                
        Cat yaong = new Cat(18, 4, "mmmmmmMMMMM");
        
        System.out.println(ani.toString());
        System.out.println(wall.toString());
        System.out.println(yaong.toString());
        
    }
    
}
