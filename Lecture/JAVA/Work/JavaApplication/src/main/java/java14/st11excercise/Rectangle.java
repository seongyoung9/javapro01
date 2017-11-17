package java14.st11excercise;

public class Rectangle extends Shape {
    
    private int width  = 0;
    private int height = 0;

    
 //-----------------------------------------------------------------\\
    //getter setter
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    //-------------------------------------------------------------------\\
    //toString
    
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height
                + ", toString()=" + super.toString() + "]";
    }
//------------------------------------------------------------------------\\
    //생성자

    public Rectangle() {
        super();
    }

    public Rectangle(String color, String pt, int width, int height) {
        super(color, pt);
        this.width = width;
        this.height = height;
    }
    
    
    
    
}
