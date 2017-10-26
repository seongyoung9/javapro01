package java17.st1shape;

public class ShapeTest 
{
    
    public static void main(String[] args)
    {
        
        Circle c = new Circle();
        c.draw();
        
        Rectangle re = new Rectangle();
        re.draw();
        
        Triangle tr = new Triangle();
        tr.draw();
        
        Shape x = new Rectangle();
        x.draw();
        
    }
    
}
