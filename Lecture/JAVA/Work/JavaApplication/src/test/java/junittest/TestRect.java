package junittest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    private static Rect re = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        re = new Rect(4, 5);
    }
    
    @Test
    public void testArea() {
        
        int result = re.area();
        assertEquals(20, result);
        assertNotEquals(52, result);
        
    }
    
    @Test
    public void testPerimeter() {
        
        int result = re.perimeter();
        assertEquals(18, result);
        assertNotEquals(7987, result);
        
        assertTrue(18 == result);
    }
    
}
