package java02;

public class ex02_형변환
{
    
    public static void main(String[] args)
    {
        
        int result = 1 + '2';               //정수 실수 문자  사이에만 형변환 가능
        System.out.println(result);
        
        result = '2' + ((true)? 1 : 0);
        System.out.println(result);
        
        result = Integer.parseInt("15") - 5;
        System.out.println(result);
        
        result = Integer.parseInt("1") + 'k';
        System.out.println(result);
        
        result = ((false)? 1 : 0) + ((true)? 1 : 0);
        System.out.println(result);
        
        result = Integer.parseInt("1");
        System.out.println(result);
        
        result = 'k';
        System.out.println(result);
        
        result = ((1 >= 0)? 9 : 2);
        System.out.println(result);
        
        String g = String.valueOf(5);
        System.out.println(g);
        
    }
    
}
