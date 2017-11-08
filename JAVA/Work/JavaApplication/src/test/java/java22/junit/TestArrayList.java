package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayList {
    
    private static List<String> emplist = null;
    
    @BeforeClass
    public static void setUpClass() {
        emplist = new ArrayList<String>();
        emplist.add("0");
        emplist.add("1");
        emplist.add("2");
        emplist.add("3");
        emplist.add("4");
    }
    
    @Test
    public void test01() {
        assertNotNull(emplist);
    }
    
    @Test
    public void test02() {
        assertEquals(5, emplist.size());
    }
    
    @Test
    public void test03() {
        for (int i = 0; i <= emplist.size() - 1; i++) {
            assertNotEquals("10", emplist.get(i));
        }
        
        int result = emplist.indexOf("10");
        assertEquals(-1, result);
        
        boolean boo = emplist.contains("10");
        assertEquals(false, boo);
        assertFalse(boo);
    }
    
    @Test
    public void test04() {
        String name[]  = { "y2kpooh", "hwang" };
        String name2[] = { "y2kpooh", "hwang" };
        
        assertArrayEquals(name, name2);
    }
}
