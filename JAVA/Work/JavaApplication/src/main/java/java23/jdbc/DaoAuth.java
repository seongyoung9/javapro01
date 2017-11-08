package java23.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    // 생성자
    public DaoAuth() {
        super();
        this.conn = conn;
    }
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        
        int result = -1;
        // SQL문장
        String query = "select count(*) as count from auth";
        
        try {
            // SQL객체 생성
            PreparedStatement stmt = conn.prepareStatement(query);
            // SQL객체 실행 rs로 저장
            ResultSet rs = stmt.executeQuery();
            // 커서 이동
            rs.next();
            // 데이터 빼오기
            result = rs.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getMaxAuthId() throws SQLException {
        
        int result = -1;
        try {
            String query = "select max(authid) as authid from auth ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            //객체 데이터는 executeQuery() or executeUpdate()
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
            
            result = rs.getInt("authid");
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
