package junittest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestMyUnit {
    private static MyUnit my = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        my = new MyUnit();
    }
    
    @Test
    public void testConcate() {

        String result = my.concate("Str", "ing");
        
        assertNotNull(result);
        assertEquals("String", result);
        assertTrue(result.equals("String"));
        
    }
    
    @Test
    public void testGetBoolean() {

        boolean result = my.getBoolean();
        
        assertFalse(result);
        assertEquals(false, result);
    }
    
    @Test
    public void testGetSameObject() {

        Object result = my.getSameObject();
        
        assertNull(result);
        assertEquals(null, result);
        assertSame(null, result);
    }
    
    @Test
    public void testGetObject() {

        Object result = my.getObject();
        
        assertNull(result);
        assertEquals(null, result);        
        assertSame(null, result);
    }
    
    @Test
    public void testGetStringArray() {

        String[] result = my.getStringArray();
        String[] str = {"one","two","three"};
        
        assertArrayEquals(str, result);

    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetException() {
        my.getException();
    }
    
    @Ignore  // 테스트 하지 않는다.
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEmptyList() {
        ArrayList<String> result = my.getEmptyList();
        
        result.get(0);
        
    }
    
}
