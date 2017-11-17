package java17.st1shape;

import java.lang.reflect.Array;
import java.util.Arrays;

public class spl 
{
    
    public static void main (String[] args)
    {          
        String prov = "abc defg ijklm nop qrs wx yz";
     
        int leng = prov.length();
        System.out.println(leng);
        
        String s = prov.substring(4, 8);
        System.out.println(s);
        
        String r = prov.replace("ijk", "*#$%^");
        System.out.println(r);
        
        String num = "74 874 9883 73 9 73646 774";
        
        String[] arr = num.split(" ");
        
        int[] a = new int[arr.length];
        
        for ( int i = 0 ; i <= arr.length -1 ; i++ )
        {
            
             a[i] = Integer.valueOf(arr[i]);
            
        }
            Arrays.sort(a);
            
            
        System.out.println(a[arr.length-1]);
        double sum = 0;
        
        for ( int j = 0 ; j <= arr.length -1 ; j++ )
        {
            sum = a[j] + sum ;
        }
        System.out.println(sum);
        System.out.println(sum/(arr.length -1));
        
    }
    
}
