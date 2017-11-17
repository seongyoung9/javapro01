package java11.st2;

public class Oper 
{
    
    private int x = 0 ;
    private int y = 0 ;
    
//----------------------------------------------------------------\\    
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
//-----------------------------------------------------------------\\  
    
 public Oper() {
        super();
    }

    
      public Oper(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }     
 //---------------------------------------------------------------------\\   
    
    public int Add()
    {
        return x + y;        
    }
    public int Minus()
    {
        return x - y;
    }
    public int Mul()
    {
        return x * y;
    }
    public double Div()
    {
        return (double)x / (double)y;
    }
    public void printresult()
    {
        System.out.println( x + " + " + y + " = " + Add());
        System.out.println( x + " - " + y + " = " + Minus());
        System.out.println( x + " * " + y + " = " + Mul());
        System.out.println( x + " / " + y + " = " + Div());
    }
    
}
