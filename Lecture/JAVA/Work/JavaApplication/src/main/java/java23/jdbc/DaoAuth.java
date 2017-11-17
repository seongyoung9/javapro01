package java23.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    // 생성자
    public DaoAuth(Connection conn) throws Exception {
        super();
        this.conn = conn;
    }
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        
        int result = -1;
        // SQL문장
        String query = " select count(*) as count from auth ";
        
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
            String query = " select max(authid) as authid from auth ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            // 객체 데이터는 executeQuery() or executeUpdate()
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
        ResultSet rs = null;
        
        // SQL문장
        String query = " select * from auth ";
        try {
            
            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query);
            // SQL 문장 실행 결과로 ResultSet을 반환한다.
            rs = stmt.executeQuery();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        
        String query = " select * from auth where name like ? ";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + auth.getName() + "%");
            
            rs = stmt.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        
        try {
            String query = " select * from auth where name = ? ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, auth.getName());
            
            rs = stmt.executeQuery();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        
        try {
            String query = " select * from auth ";
            query += " where 1 = 1 ";
            if (auth.getAuthid() != null){
                query += " and authid = ? ";
            }
            if (!auth.getName().isEmpty()){
                query += " and name = ? ";
            }
            if (!auth.getBirth().isEmpty()){
                query += " and birth = ? ";
            }
            PreparedStatement stmt = conn.prepareStatement(query);
            int c = 1;
            
            if (auth.getAuthid() != null){
                stmt.setInt(c++, auth.getAuthid());
            }
            if (!auth.getName().isEmpty()){
                stmt.setString(c++, auth.getName());
            }
            if (!auth.getBirth().isEmpty()){
                stmt.setString(c++, auth.getBirth());
            }
            rs = stmt.executeQuery();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        
        int rs = -1;
        
        try {
            String query = " insert into ";
            query += " auth (authid, name, birth)";
            query += " values (?,?,?) ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, auth.getAuthid());
            stmt.setString(2, auth.getName());
            stmt.setString(3, auth.getBirth());
            
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        
        int rs = -1;
        
        try {
            String query = " update auth ";
            query += " set name = ?, birth = ? ";
            query += " where 1=1 and authid = ? ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, setauth.getName());
            stmt.setString(2, setauth.getBirth());
            stmt.setInt(3, whereauth.getAuthid());
            
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        
        int rs = -1;
        
        try {
            String query = " delete from auth where 1 = 1 ";
            query += " and name = ? ";
            query += " and birth = ? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, auth.getName());
            stmt.setString(2, auth.getBirth());
            
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
}
