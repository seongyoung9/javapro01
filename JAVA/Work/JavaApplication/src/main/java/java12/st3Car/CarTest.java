package java12.st3Car;

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
        System.out.println("NumberofCars : " + myCar.getNumberofCars());
        
        Car yourCar = new Car();
        
        yourCar.setColor("blue");
        yourCar.setSpeed(60);
        yourCar.setGear(3);
        
        System.out.println(yourCar.toString());
        System.out.println( "NumberofCars : " + myCar.getNumberofCars());
               
        Car othercar = new Car("yellow", 30, 2);
        System.out.println(yourCar.toString());
        System.out.println("NumberofCars : " + myCar.getNumberofCars());

        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("NumberofCars = " + myCar.getNumberofCars());
        System.out.println("NumberofCars = " + myCar.getNumberofCars());
        System.out.println("NumberofCars = " + myCar.getNumberofCars());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        System.out.println(Car.getNumberofCars());  //스테틱이 붙은 아이
        System.out.println(Car.numberofCars); //스테틱이 붙으면 인스턴스명 
                                                                
    }
    
}
