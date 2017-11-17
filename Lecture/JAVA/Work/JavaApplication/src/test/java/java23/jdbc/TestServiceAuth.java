package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndViewDefiningException;

public class TestServiceAuth {
    private static ServiceAuth svr = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        svr = new ServiceAuth();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelAuth model = new ModelAuth();
        
        int result = svr.getCount(model);
        
        assertNotNull(result);
        
        assertEquals(3, result);
    }
    
    @Test
    public void testGetMaxAuthId() throws SQLException {
        
        int result = svr.getMaxAuthId();
        
        assertNotNull(result);
        
        assertEquals(7, result);
        
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        
        ResultSet result = svr.selectAll();
        
        result.next();
        
        int rs = result.getInt("authid");
        
        assertNotNull(rs);
        
        assertEquals(1, rs);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        
        ModelAuth model = new ModelAuth();
        
        model.setName("p");
        
        ResultSet result = svr.selectLike(model);
        
        // assertNull(result);
        result.first();
        String rs = result.getString("name");
        
        assertTrue(rs.contains("park"));
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        
        ModelAuth model = new ModelAuth();
        
        model.setName("park");
        
        ResultSet result = svr.selectEqual(model);
        
        assertNotNull(result);
        result.next();
        
        String rs = result.getString("name");
        assertEquals("park", rs);
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        
        ModelAuth model = new ModelAuth();
        //아무것도 없을때
        model.setAuthid(null);
        model.setName("");
        model.setBirth("");
        ResultSet result = svr.selectDynamic(model);
        result.next();
        String rs = result.getString("name");
        assertEquals("lee", rs);
        
        //번호만 줄때
        model.setAuthid(7);
        result = svr.selectDynamic(model);
        result.first();
        rs = result.getString("name");
        assertEquals("park", rs);
        
        //이름만 줄때
        model.setAuthid(null);
        model.setName("park");
        result = svr.selectDynamic(model);  
        result.first();
        rs = result.getString("name");
        assertEquals("park", rs);
        
        //생일만 줄때
        model.setName("");
        model.setBirth("2017-01-03");
        result = svr.selectDynamic(model); 
        result.first();
        rs = result.getString("name");
        assertEquals("lee", rs);
        }
    
    @Test
    public void testInsertAuth() throws SQLException {
        
        ModelAuth model = new ModelAuth();
        
        model.setAuthid(57);
        model.setName("sin");
        model.setBirth("2017-12-31");
        
        int result = svr.insertAuth(model);
        
        assertTrue(result >= 0);
    }
    
    @Test
    public void testUpdateAuth() throws SQLException {
        ModelAuth wheremodel = new ModelAuth();
        ModelAuth setmodel = new ModelAuth();
        
        setmodel.setName("koo");
        setmodel.setBirth("1234-56-78");
        wheremodel.setAuthid(57);
        
        int result = svr.updateAuth(wheremodel, setmodel);
        
        assertTrue(result >= 0);
        
    }
    
    @Test
    public void testDeleteAuth() throws SQLException {
        ModelAuth model = new ModelAuth();
        
        model.setName("koo");
        model.setBirth("1234-56-78");
        
        int result = svr.deleteAuth(model);
        
        assertTrue(result >= 0);
    }
    
}
