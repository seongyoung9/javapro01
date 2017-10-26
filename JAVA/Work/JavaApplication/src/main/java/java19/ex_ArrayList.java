package java19;

import java.util.*;

public class ex_ArrayList 
{
    
    public static void main(String[] args) 
    {
        
        List<Integer> list = null;
                list = new ArrayList<Integer>();
        List<Integer> list1 = null;
                list1 = new ArrayList<Integer>();
        Scanner key = new Scanner(System.in);
        list.add(1);
        list.add(4);
        System.out.println("학생수를 입력하시오 : ");
        list.add( 1, key.nextInt());
        
        for ( int i = 0 ; i <= list.size() -1 ; i++ )
        {
            System.out.println("성적을 입력하시오 : ");
            list1.add(i,key.nextInt());
        }
        
    }
    
}
