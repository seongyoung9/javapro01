package java13.st5Emp;

import java.util.Scanner;

public class EmployeeTest 
{
    
    public static void main(String[] args)
    {
        
        Scanner key = new Scanner(System.in);
        Employee[] em = new Employee[3];
        //em = new Employee[3];
        String x;
        for ( int i = 0 ; i <= em.length -1 ; i ++)
        {
            em[i] = new Employee();
            System.out.print("이름을 입력하시오 : ");
            x = key.next();
            em[i].setName(x);
            System.out.println(em[i].getName());
        }
    }
    
}
