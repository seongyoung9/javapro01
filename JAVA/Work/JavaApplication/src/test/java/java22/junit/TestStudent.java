package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent {
    
    private static Student st = null;
    
    @BeforeClass
    public static void setUpBeforeClass(){
        
        st = new Student();
       
    }
    

    @Test
    public void test_getgrade() {
            
        assertEquals("A", st.getgrade(101));
        assertEquals("A", st.getgrade(90));
        
        assertEquals("B", st.getgrade(89));
        assertEquals("B", st.getgrade(80));
        
        assertEquals("C", st.getgrade(79));
        assertEquals("C", st.getgrade(70));
        
        assertEquals("D", st.getgrade(69));
        assertEquals("D", st.getgrade(60));
        
        assertEquals("F", st.getgrade(59));
    }
    
}
