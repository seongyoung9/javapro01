package java23.jdbc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDBConnect {
    
    @Test
    public void test_connectionMYSQL()  throws Exception{
        java.sql.Connection conn = DBConnect.connectionMySQL();
        
        if (conn != null){
            assertTrue("db connect success", true);
        }
        else{
            assertTrue("db connect fail", false);
        }
    }
    
    @Test
    public void test_makeConnection() throws Exception{
        java.sql.Connection conn = DBConnect.makeConnection();
        
        if (conn != null){
            assertTrue("db connect success",true);
        }
        else{
            assertTrue("db connect fail",false);
        }
    }
    
}
