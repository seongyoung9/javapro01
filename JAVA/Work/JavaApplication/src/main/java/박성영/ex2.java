package 박성영;

import java.util.Arrays;

public class ex2 {
    
    public static void main(String[] args) {
        
        int[] 배열 = {23,96,35,42,81,19,8,77};
        System.out.print("정렬전: ");
        
        출력(배열);
        
        System.out.println();
        
  //-----------------------------------------------------
        
        Arrays.sort(배열);
        
        System.out.print("정렬후: ");
        
        출력(배열);
    }

    private static void 출력(int[] 배열) {
        for (int i = 0; i <= 배열.length -1;i++)
        {
            System.out.print(배열[i] + " ");
        }
    }
    
}
