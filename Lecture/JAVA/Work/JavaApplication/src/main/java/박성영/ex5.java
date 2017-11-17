package 박성영;

import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Employee[] employees = new Employee[3];
        
        for (int i = 0; i <= employees.length-1 ; i++)
        {
            employees[i] = new Employee();
            
            System.out.print(i+1 + "번째 이름 입력 : " );
            employees[i].setName(scan.next());
            
            System.out.print(i+1 + "번째 주소 입력 : " );
            employees[i].setAddr(scan.next());
            
            System.out.print(i+1 + "번째 월급 입력 : " );
            employees[i].setSalary(scan.nextInt());
            
            System.out.print(i+1 + "번째 rnn 입력 : " );
            employees[i].setRnn(scan.next());
            

        }
        
        for (int i = 0; i <= employees.length-1 ; i++)
        {
            System.out.println(employees[i].toString());
        }
    }
    
}
