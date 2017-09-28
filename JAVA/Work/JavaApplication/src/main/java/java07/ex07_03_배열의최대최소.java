package java07;

import java.util.Scanner;

public class ex07_03_배열의최대최소 
{
    
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];
        int min = 9999, max = 0,i=0;
        for (i = 0 ; i <= arr.length -1; i++ )
        {
            System.out.print("숫자를 입력해 주세요");
            
            arr[i] = key.nextInt();
                        
        }
        System.out.print("배열정렬전 : ");
        for (i = 0 ; i <= arr.length -1 ; i++)
        {
            System.out.print(arr[i]);
            if ( i == arr.length -1 )
            {
                System.out.println("");
            }
            else
            {
                System.out.print(",");
            }
        }
        
        for (i = 0 ; i <= arr.length-1; i++)
        {
            if ( min > arr[i])
            {
                min = arr[i];
            }            
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        
        System.out.println("최소값은 : " + min);
        System.out.println("최대값은 : " + max);
        
        for (i = 0; i < arr.length -1; i++)
        {
            
            for ( int j = i ; j <= arr.length -1 ; j++)
            {
                if ( arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j]; 
                    arr[j] = temp;
                }
                
            }
        }
        System.out.print("배열정렬후 : ");
        for (i = 0 ; i <= arr.length -1 ; i++)
        {
            System.out.print(arr[i]);
            
            if ( i == arr.length -1 )
            {
                System.out.println("");
            }
            else
            {
                System.out.print(",");
            }
        }
    }
    
}
