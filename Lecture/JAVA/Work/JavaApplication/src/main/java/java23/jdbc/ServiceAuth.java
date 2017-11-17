package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class ServiceAuth implements IAuth {
    private Connection conn = null;
    
    public ServiceAuth() throws Exception {
        super();
        this.conn = DBConnect.makeConnection();
    }
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        int rs = -1;
        
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            // dao의 sql문 작성
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.getCount(auth);
            
            // 트랜잭션 커밋
            this.conn.commit();
        } catch (Exception e) {
            
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int getMaxAuthId() throws SQLException {
        
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            // 트랜잭션 커밋
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.getMaxAuthId();
            this.conn.commit();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        ResultSet rs = null;
        // 트랜잭션 시작
        try {
            this.conn.setAutoCommit(false);
            // 트랜잭션 커밋
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.selectAll();
            
            this.conn.commit();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.selectLike(auth);
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.selectEqual(auth);
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
            
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.selectDynamic(auth);
            // 트랜잭션 커밋
            this.conn.commit();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.insertAuth(auth);
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.updateAuth(whereauth, setauth);
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
        }
        return rs;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.deleteAuth(auth);
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // 트랜잭션 종료
            this.conn.rollback();
        }
        return rs;
    }
    
}
