package java19.st3studentmap;

import java.util.*;

public class Student 
{
    
    private int number = 0;
    private String name = "";
  
  //-----------------------------------------------------------
    
    
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
 //----------------------------------------------------------------
    
    public Student() {
        super();
    }
    
    public Student(int number, String name) {
        super();
        this.number = number;
        this.name = name;
    }
    
  //--------------------------------------------------------------
    
    
    @Override
    public String toString() {
        return "number = " + number + ", name = " + name;
    }
    
    
    
}
