package javaex;

import java.util.Scanner;

public class EmploteeTest {
    
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);
        
        Employee[] emp = new Employee[2];
        String x = "";
        int x2= 0;
        for (int i = 0 ; i <= emp.length -1 ; i ++)
        {
            
            emp[i] = new Employee();
            
            System.out.print("이름을 입력하세요 : ");
            x = scan.next();
            emp[i].setName(x);
            
            System.out.print("주소을 입력하세요 : ");
            x = scan.next();
            emp[i].setAddress(x);
            
            System.out.print("주민번호을 입력하세요 : ");
            x2 = scan.nextInt();
            emp[i].setSalary(x2);
            
            System.out.print("월급을 입력하세요 : ");
            x = scan.next();
            emp[i].setRrn(x);
                 
        }
        System.out.println();
        
        for (int i = 0 ; i <= emp.length -1 ; i ++)
        {
            System.out.println("이름 >> " + emp[i].getName());
            System.out.println("주소 >> " + emp[i].getAddress());
            System.out.println("주민번호 >> " + emp[i].getSalary());
            System.out.println("월급 >> " + emp[i].getRrn());
            System.out.println();
        }
        
    }
    
    
    
}
