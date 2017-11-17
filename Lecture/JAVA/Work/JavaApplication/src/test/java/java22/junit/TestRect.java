package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    private static Rect re = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // System.out.println("setUpBeforeClass");
        re = new Rect();
        
        re.setHeight(5);
        re.setWidth(2);
    }
    
    @Before
    public void setUp() throws Exception {
        // System.out.println("setUp");
        
    }
    
    @Test
    public void test_area() {
        
        int a = re.area();
        
        assertEquals(10, a);
        
    }
    
    @Test
    public void test_perimeter() {
        
        int p = re.perimeter();
        
        assertEquals(14, p);
    }
    
    @Test
    public void test_assertTrue() {
        
        int a = re.area();
        assertTrue(10 == a);
    }
    
    @Test
    public void test_assertFalse() {
        
        int a = re.area();
        assertFalse(80 == a);
    }
    
    @Test
    public void test_type() {
        Rect o = re.gettype();
        
        assertNull(o);
    }
}
