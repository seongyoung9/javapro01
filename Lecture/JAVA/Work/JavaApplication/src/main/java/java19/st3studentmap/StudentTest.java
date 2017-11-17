package java19.st3studentmap;

import java.util.HashMap;
import java.util.Map;

public class StudentTest 
{
    
    public static void main(String[] args) 
    {
        
        Map<Integer, Student> m = new HashMap   <Integer, Student>();

        m.put(170101, new Student(170101,"구준표"));
        m.put(170102, new Student(170102,"금잔디"));
        m.put(170103, new Student(170103,"윤지후"));
        
        printmap(m);
              
       for (Integer str : m.keySet()) 
       {
           System.out.println(str + "   "  +  m.get(str));
       }

       m.remove(170101);
       
       printmap(m);
       
       
      // m.put(170103, new Student(170103,"윤지후"));
       int key = 0;
       for (Student s : m.values())
       {
           if ( s.getName().equals("윤지후"))
           {
               key = s.getNumber();
               break;
           }
       }
       m.put(key, new Student(170103,"윤후"));
       
       
       printmap(m);
    }
    
    
    
    private static void printmap(Map<Integer, Student> m) {
        System.out.println("entrySet 출력 >> ");

       for (Map.Entry<Integer, Student> en : m.entrySet())
       {    
           int no = en.getValue().getNumber();
           String na = en.getValue().getName();
           System.out.println(no + "   "  +  na);
       }
        System.out.println();
    }
    
}
