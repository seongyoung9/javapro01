package java17.st1shape;

public class Circle extends Shape 
{
    
    public int radius = 0;

    //--------------------------------------------------------------
    // getter setter
    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
  //--------------------------------------------------------------
    //toString
    
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", toString()=" + super.toString()
                + "]";
    }
    
  //--------------------------------------------------------------
    //생성자
    
    public Circle() {
        super();
    }
    
    @Override
    public Shape getShape()
    {
        return null;       
    }
    @Override
    public void draw()
    {
        System.out.println("Circle draw");
        
    }
    
}
