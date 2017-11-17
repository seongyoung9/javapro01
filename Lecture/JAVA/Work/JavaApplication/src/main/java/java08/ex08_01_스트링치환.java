package java08;

import java.util.Arrays;
import java.util.Collections;

public class ex08_01_스트링치환 
{
    public static void main(String[] args)
    {
        
     // 도전 1. 문자열 치환:
     // ÷(\u00F7) --> /, ×(\u00D7) --> * 바꾸기
     String temp = "\u00F7 \t \u00D7 ";
     System.out.println( "치환 전 : " + temp );
     
     temp = temp.replace("\u00F7", "/");

     temp = temp.replace("\u00D7", "*");
     
     System.out.println( "치환 후 : " + temp );
     
     // 도전 2. 형변환. 문자열 정수로 바꾸기.
     // 문자열 "3"을 정수 3으로 바꾸시오. 구글 검색
     String temp2 = "3";
     int x = Integer.valueOf(temp2);
     System.out.println(x);
     
     // 도전 3. 문자열에서 가장 큰 수를 찾으시오.
     // a. 문자열 자르기 --> String 배열을 얻게 됨.
     // b. 문자열 배열을 정수 배열로 만든다.
     // 이 때 for 문과 Integer.parseInt() 사용
     // c. 정수배열(intArray)를 오름차순 정렬하시오
     // d. 정수배열에서 최대값을 찾는다.
     String temp3 = "74 874 9883 73 9 73646 774";

     String[] arr = temp3.split(" ");
     int[] a = new int[arr.length];
     int i = 0;
     for (i = 0; i <= arr.length -1; i++)
     {
         
         System.out.println(arr[i]);
         
         a[i] = Integer.valueOf(arr[i]);
         
     }
     System.out.println("------------------------------------ \n정렬후 ");
     /*for (i = 0; i <= a.length -1; i++)
     {
         
         for ( int j = i ; j <= a.length -1 ; j++)
         {
             if ( a[i] > a[j])
             {
                 int temp4 = a[i];
                 a[i] = a[j]; 
                 a[j] = temp4;
             }
             
         }
     }*/
     Arrays.sort(a);                             //오름차순정렬해주는 구문
     // Arrays.sort(a, Collections.reverseOrder()); //내림차순
     for ( i = 0; i <= a.length -1; i++) 
     {
         
         System.out.println(a[i]);
         
     }
     System.out.println("------------------------------------ \n최소값 ");
     System.out.println(a[0]);
     System.out.println("------------------------------------ \n최대값 ");
     System.out.println(a[a.length -1]);
        
    }
}
