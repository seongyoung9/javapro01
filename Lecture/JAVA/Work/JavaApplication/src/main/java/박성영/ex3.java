package 박성영;

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int 시작단 = 0;
        int 마지막단 = 0;
                
        for (;true;)
        {
            System.out.print("시작단을 입력해 주세요 : ");
            시작단 = key.nextInt();
            
            System.out.print("마지막단을 입력해 주세요 : ");
            마지막단 = key.nextInt();
            
            if (시작단 > 마지막단)
            {
                int 변환 = 시작단;
                시작단 = 마지막단;
                마지막단 = 변환;
            }
            if (시작단 == 0 || 마지막단 == 0)
            {
                System.out.println("0을 입력하셨습니다.");
                break;
            }
            구구단출력(시작단, 마지막단);
        }
    }

    private static void 구구단출력(int 시작단, int 마지막단) {
        for (int i = 시작단; i <= 마지막단; i++)
        {
            for (int j = 1;j <= 9 ; j++)
            {
                System.out.print( i + " * " + j + " = " + j*j + "  ");
            }
            System.out.println();
        }
    }
    
}
