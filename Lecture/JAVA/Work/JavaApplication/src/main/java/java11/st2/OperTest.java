package java11.st2;

import java.util.Scanner;

public class OperTest 
{

    public static void main(String[] args) 
    {
        
        Scanner key = new Scanner(System.in);
        
        Oper my = new Oper();
        System.out.print("First number : ");
        my.setX(key.nextInt());
        System.out.print("second number : ");
        my.setY(key.nextInt());
        
        my.printresult();
    }
    
    
}
