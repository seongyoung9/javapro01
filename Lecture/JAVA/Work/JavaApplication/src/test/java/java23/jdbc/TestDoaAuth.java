package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDoaAuth {
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn =  DBConnect.makeConnection();
    }
    
    @Test
    public void testGetCount() throws Exception  {
        DaoAuth dao = new DaoAuth(conn);
        ModelAuth model = new ModelAuth();
        
        int result = dao.getCount(model);
        
        assertEquals(3, result);
        
    }
    
    @Test
    public void testGetMaxAuthId() throws Exception {
        DaoAuth dao = new DaoAuth(conn);
        int result = dao.getMaxAuthId();
        
        assertEquals(7, result);
        
    }
    
    @Test
    public void testSelectAll() throws Exception {
        DaoAuth dao = new DaoAuth(conn);
        ResultSet rs = dao.selectAll();
        
        rs.first();
        
        int result = rs.getInt("authid");
        
        assertEquals(1, result);
        
        rs.next();
        rs.next();
        
        result = rs.getInt("authid");
        assertEquals(7, result);
    }
    
    @Test
    public void testSelectLike() throws Exception {
        DaoAuth dao = new DaoAuth(conn);
        ModelAuth model = new ModelAuth();
        
        model.setName("b");
        
        ResultSet rs = dao.selectLike(model);
        
        assertNotNull(rs);
        
        rs.next();
        
        String result = rs.getString("name");
        assertTrue(result.contains("bob"));
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelAuth model = new ModelAuth();
        DaoAuth dao = new DaoAuth(conn);
        model.setName("kim");
        ResultSet rs = dao.selectEqual(model);
        
        rs.next();
        String result = rs.getString("name");
        
        assertEquals("kim", result);
    }
    
    @Test
    public void testSelectDynamic() throws Exception {

    }
    
    @Test
    public void testInsertAuth() throws Exception {
        DaoAuth dao = new DaoAuth(conn);
        ModelAuth model = new ModelAuth();
        
        model.setAuthid(3);
        model.setName("lee");
        model.setBirth("2017-01-03");
        
        int result = dao.insertAuth(model);
        
        assertEquals(1, result);
    }
    
    @Test
    public void testUpdateAuth() throws Exception {
        DaoAuth dao = new DaoAuth(conn);
        ModelAuth wheremodel = new ModelAuth();
        ModelAuth setmodel = new ModelAuth();
        
        wheremodel.setAuthid(1);
        setmodel.setName("lee");
        setmodel.setBirth("2013-05-30");
        int result = dao.updateAuth(wheremodel, setmodel);
        
        assertTrue(result >= 0);
    }
    
    @Test
    public void testDeleteAuth() throws Exception {
        DaoAuth dao = new DaoAuth(conn);
        ModelAuth model = new ModelAuth();
        model.setName("kim");
        model.setBirth("1980.05.01");
        
        int result = dao.deleteAuth(model);
        
        assertTrue(result >= 0);
    }
    
}
