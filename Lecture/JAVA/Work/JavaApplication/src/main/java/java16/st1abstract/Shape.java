package java16.st1abstract;

public abstract class Shape 
{
    
    int x = 0, y = 0;
    
    public void move(int x, int y)
    {
        
        this.x = x;
        this.y = y;        
        
    }
    
    public abstract void draw();
}
