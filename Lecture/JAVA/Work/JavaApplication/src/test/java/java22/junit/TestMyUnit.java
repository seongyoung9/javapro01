package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestMyUnit {
    private static MyUnit myunit = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
       myunit = new MyUnit();
    }

    @Test
    public void testConcate() {
        String result = myunit.concate("ab", "12");
        assertEquals("ab12", result);
    }
    
    @Test
    public void testgetBoolean() {
        boolean boo = myunit.getBoolean();
        assertFalse(boo);
        assertEquals(boo, false);
        assertSame(boo, false);
    }
    
    @Ignore   // 생략
    @Test
    public void testgetSameObject() {
        Object sameobj = myunit.getSameObject();
        assertNull(sameobj);
        assertEquals(null, sameobj);
        assertSame(null, sameobj);
    }
    
    @Test
    public void testgetObject() {
        Object obj = myunit.getObject();
        assertNull(obj);
        assertEquals(null, obj);
        assertSame(null, obj);
    }
    
    @Test
    public void testgetStringArray() {
        String[] arrstr = myunit.getStringArray();
        String[] ott = {"one","two","three"};
        assertArrayEquals(ott, arrstr);

    }
    
    @Test(expected = ArithmeticException.class) //정상으로 처리해줌
    public void testGetException(){
        double result = myunit.getException();  // ArithmeticException
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEmptyList(){
        ArrayList<String> list = myunit.getEmptyList();
        list.get(0);
    }
}
