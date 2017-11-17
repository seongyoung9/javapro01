package java07;

import java.util.Scanner;

public class ex07_01_동적배열
{
    
    public static void main(String[] args)
    {
        
        Scanner key = new Scanner(System.in);
        System.out.print("사이즈를 입력해 주세요 : ");
        int size = key.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("사이즈는 : " + arr.length);
        
    }
    
}
