package javaex;

import java.util.Scanner;

public class recttest {
    public static void main(String[] args) {
        
        rect r = new rect();
        Scanner key = new Scanner(System.in);
        
        System.out.print("가로를 입력해 주세요 : ");
        r.setWidth(key.nextInt());
        
        System.out.print("세로를 입력해 주세요 : ");
        r.setHeight(key.nextInt());
        System.out.println();
        
        System.out.println("사각형의 넓이 : " + r.area());
        System.out.println("사각형의 부피 : " + r.perimeter());
        
    }
}
