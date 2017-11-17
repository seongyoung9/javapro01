package java15.st2enum;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Scanner;

public class PhoneHeaderTest 
{
    
    public static void main(String[] args) 
    {
       
        Scanner key = new Scanner(System.in);
        System.out.println("번호를 입력해 주세요.");
        String phone = key.next();
        
        String header = phone.substring(0, 3);
        
        System.out.println(header);
        
        PhoneHeaderClass ph = new PhoneHeaderClass();
        
 //-----------------------------------------------------------\\
        //class
        if(ph.P010 .equals(header))
        {
            System.out.println("general");
        }
        else if (ph.P011 .equals(header))
        {
            System.out.println("SKT");
        }
        else if (ph.P016 .equals(header))
        {
            System.out.println("KT");
        }
        else if (ph.P019 .equals(header))
        {
            System.out.println("LG");
        }
        else
        {
            System.out.println("통신사는 없습니다.");
        }
 //---------------------------------------------------------------\\
        //Enum
        if ( header .equals(PhoneHeaderEnum.P010.getValue()))
        {
            System.out.println("general");
        }
        else if (header .equals(PhoneHeaderEnum.P011.getValue()))
        {
            System.out.println("SKT");
        }
        else if (header .equals(PhoneHeaderEnum.P016.getValue()))
        {
            System.out.println("KT");
        }
        else if (header .equals(PhoneHeaderEnum.P019.getValue()))
        {
            System.out.println("LG");
        }
        else
        {
            System.out.println("통신사는 없습니다.");
        }
        
    }
    
}
