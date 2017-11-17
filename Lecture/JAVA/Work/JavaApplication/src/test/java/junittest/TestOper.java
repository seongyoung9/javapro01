package junittest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    private static Oper op = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        op = new Oper(3,5);
    }
    
    @Test
    public void testAdd() {
        int result = op.add();
        
        assertEquals(8, result);
        assertNotEquals(10, result);
        assertTrue(8 == result);
        assertFalse(10 == result);
    }
    
    @Test
    public void testMinus() {
        int result = op.minus();
        
        assertEquals(-2, result);
        assertNotEquals(5, result);
        assertTrue(-2 == result);
        assertFalse(46 == result);

    }
    
    @Test
    public void testMul() {
        int result = op.mul();
        
        assertEquals(15, result);
        assertNotEquals(10, result);
        assertTrue(15 == result);
        assertFalse(123 == result);

    }
    
    @Test
    public void testDiv() {
        double result = op.div();
        
        assertEquals(0.6, result,0.1);
        assertNotEquals(10, result);
        assertTrue(0.6 == result);
        assertFalse(10 == result);
    }
    
}
