package java17.st1shape;

public class Triangle extends Shape 
{
    
    public int base = 0;
    public int height = 0;
    
  //--------------------------------------------------------------
    //getter setter
    
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
  //--------------------------------------------------------------
    //toString
    
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", toString()="
                + super.toString() + "]";
    }
    
    
    //------------------------------------------------------------
    public Triangle() {
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
        System.out.println("Triangle draw");
        
    }
    
}
