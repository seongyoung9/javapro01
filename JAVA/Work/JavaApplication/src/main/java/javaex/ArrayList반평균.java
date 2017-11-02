package javaex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList반평균 {
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        List<Integer> list = null;
                      list = new ArrayList<Integer>();
        
        System.out.print("학생수를 입력해 주세요 : ");
        int 학생수 = key.nextInt();              
        int 합계 = 0; 
        for (int i = 0; i < 학생수 ; i++)
        {   
            System.out.print("점수를 입력하세요 : ");
            list.add(key.nextInt());
            합계 = 합계 + list.get(i);
        }
        
        System.out.println("합계는 : " + 합계);
        System.out.println("평균은 : " + (합계/학생수));
        
    }
    
}
