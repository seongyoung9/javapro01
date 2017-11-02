package javaex;

public class rect 
{
    
    private int width = 0;
    private int height = 0;
    
//-----------------------------------------------------------------------  
    
    
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
    
  //-----------------------------------------------------------------------  
    
    
    @Override
    public String toString() {
        return "rect [width=" + width + ", height=" + height + "]";
    }
    
  //-----------------------------------------------------------------------  
    
    
    public rect() {
        super();
    }
    
    
    public rect(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    
  //-----------------------------------------------------------------------  
    
    public int area()
    {
        return width*height;
    }
    public int perimeter()
    {
        return 2*(width+height);
    }
}
