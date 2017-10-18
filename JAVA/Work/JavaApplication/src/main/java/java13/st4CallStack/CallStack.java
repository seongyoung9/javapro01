package java13.st4CallStack;

public class CallStack {
    
    public static void main(String[] args) 
    {    
        FirstMethod();        
    }

    public static void FirstMethod() 
    {
        SecondMethod();
    }

    public static void SecondMethod() 
    {
        System.out.println("SecondMethod");
    }
    
}
