package javaex;

import java.util.*;

public class java07_05_반평균 {
    
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        System.out.print("학생수를 입력하시오 : ");
        int 학생수 = key.nextInt();
        
        int[] 성적 = new int[학생수];
        int 합계 = 0;
        int 평균 = 0;
        for (int i = 0; i <= 성적.length - 1; i++) {
            System.out.print("성적을 입력하시오 : ");
            성적[i] = key.nextInt();
            합계 = 합계 + 성적[i];
        }
        평균 = 합계 / 학생수;
        System.out.println("합계는 : " + 합계);
        System.out.println("평균은 : " + 평균);
        
    }
    
}
