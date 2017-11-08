package 박성영;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("시작값을 입력하세요.  ");
        int 첫숫자 = key.nextInt();
        System.out.print("종료값을 입력하세요.  ");
        int 마지막숫자 = key.nextInt();
        int 합계 = 0;
        if (첫숫자 > 마지막숫자) {
            int 변환 = 첫숫자;
            첫숫자 = 마지막숫자;
            마지막숫자 = 변환;
        }
        
        출력(첫숫자, 마지막숫자);
        for (int i = 첫숫자; i <= 마지막숫자; i++) {
            합계 = 합계 + i;
        }
        System.out.println(합계);   
        
    }
    
    private static void 출력(int 첫숫자, int 마지막숫자) {
        for (int i = 첫숫자; i <= 마지막숫자; i++) {
            if (i == 마지막숫자) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " + ");
            }
            
        }
    }
    
}
