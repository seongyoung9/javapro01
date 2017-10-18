package java11.st2;

public class CarTest 
{
    
    public static void main (String[] args)
    {
        
        Car myCar = new Car();                  //클래스와 메서드의 이름을 동일
                                                //               ↘ 생성자
        myCar.speedUp(100);                     //mtCar의 speed에서 100더하기
        myCar.speedPrint();
        
        myCar.speedDown(20);
        myCar.speedPrint();
        
        System.out.println(myCar.toString());
        
        Car yourCar = new Car();
        
        yourCar.setColor("blue");
        yourCar.setSpeed(60);
        yourCar.setGear(3);
        
        System.out.println(yourCar.toString());
               
    }

    
}
