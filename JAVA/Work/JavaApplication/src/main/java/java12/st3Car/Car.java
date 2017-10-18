package java12.st3Car;

public class Car 
{
    //필드
    private     String  color = "red";    
    private     int     speed = 100;
    private     int     gear = 4;
    
    private     int     carid = 0;
    
    //static 필드 선언    
   public static int  numberofCars = 0;
    
    
    public static int getNumberofCars() {
        return numberofCars;
    }
        
    //동작 : 메서드
    public void speedUp    ( int s )
    {
        this.speed += s ;                        //this : 나의
    }                                           
    
    public void speedDown  ( int s )
    {
        speed -= s;                    
    }
    
    public void speedPrint()
    {
        System.out.println( "속도 " + speed + "km" );
    }
    
//----------------------------------------------------------------//
    
    //getter & setter
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

 //-----------------------------------------------------------//   
    // 생성자 (constructor)
    public Car() {
        super();
        carid = ++numberofCars;
    }

    public Car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
        carid = ++numberofCars;
    }
    //------------------------------------------------------------------//

    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + ", carid=" + carid + "]";
    }
    
}
