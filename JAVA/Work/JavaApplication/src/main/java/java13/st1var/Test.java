package java13.st1var;

public class Test 
{
    
    public void sub( int... v)
    {
        
        System.out.println("인수의 개수 : " + v.length);
        for ( int x : v)
        System.out.println();    
        for( int i : v)
        {
        System.out.print( i + "     ");
        }
        System.out.println();
        System.out.println("length -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(int i = 0; i <= v.length -1 ; i++)
        {
            System.out.print( v[i] + "   ");

        }
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
    }
    
}

