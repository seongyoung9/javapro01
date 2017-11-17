package java14.st11excercise;

public class Shape 
{
    
    protected String color = "";
    protected String pt = "";
 //------------------------------------------------------------\
    //getter setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPt() {
        return pt;
    }
    public void setPt(String pt) {
        this.pt = pt;
    }
  //-----------------------------------------------------------\\
    @Override
    public String toString() {
        return "Shape [color=" + color + ", pt=" + pt + "]";
    }
    
  //------------------------------------------------------------\\
    //생성자
    public Shape() {
        super();
    }
    
    public Shape(String color, String pt) {
        super();
        this.color = color;
        this.pt = pt;
    }
    
    
}
