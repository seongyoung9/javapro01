package java14.st11excercise;

public class Circle extends Shape
{
    
    private int radius = 0;

    //-----------------------------------------------------------\\
    //getter setter
    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    //-------------------------------------------------------------------\\
    //toString
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", toString()=" + super.toString()
                + "]";
    }
    //---------------------------------------------------------\\
//생성자
    public Circle() {
        super();
    }

    public Circle(String color, String pt, int radius) {
        super(color, pt);
        this.radius = radius;
    }
    
    
    
}
