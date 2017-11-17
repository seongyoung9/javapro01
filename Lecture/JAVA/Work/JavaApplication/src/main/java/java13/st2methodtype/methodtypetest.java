package java13.st2methodtype;

public class methodtypetest 
{
    
    public static void main(String[] args)
    {

        Methodtype m = new Methodtype();
        //인스턴스 메서드를 호출할때는 인스턴스이름.매서드명
        m.instanceMethod();
        
        //static 메서드를 호출할때는 클래스이름.메서드명
        Methodtype.staticMethod();
        m.staticMethod();                //잘사용X 사용 하지 말자
        
        
    }
    
}
