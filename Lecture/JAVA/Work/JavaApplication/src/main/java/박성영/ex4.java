package 박성영;

import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        Oper op = new Oper();
        
        System.out.print("First num : ");
        op.setFirstNum(key.nextInt());
        
        System.out.print("Second num : ");
        op.setSecondNum(key.nextInt());
        
        System.out.println(op.add());
        System.out.println(op.minus());
        System.out.println(op.mul());
        System.out.println(op.div());
        
    }
    
}
