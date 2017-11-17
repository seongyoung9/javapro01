package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceBook implements IServiceBook {
    
    private Connection conn = null;
    
    public ServiceBook() throws Exception {
        super();
        this.conn = DBConnect.makeConnection();
    }
    
    @Override
    public int getCount(ModelBook book) throws SQLException {
        
        int rs = -1;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.getCount(book);
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
    }
    
    @Override
    public int getMaxBlock() throws SQLException {
        int rs = -1;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.getMaxBlock();
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        java.sql.ResultSet rs = null;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.selectAll();
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
        
    }
    
    @Override
    public ResultSet selectLike(ModelBook book) throws SQLException {
        
        java.sql.ResultSet rs = null;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.selectLike(book);
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelBook book) throws SQLException {
        
        java.sql.ResultSet rs = null;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.selectEqual(book);
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelBook book) throws SQLException {
        java.sql.ResultSet rs = null;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.selectDynamic(book);
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
    }
    
    @Override
    public int insertBook(ModelBook book) throws SQLException {
        int rs = -1;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.insertBook(book);
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws SQLException {
        int rs = -1;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.updateBook(wherebook, setbook);
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
    }
    
    @Override
    public int deleteBook(ModelBook book) throws SQLException {
        int rs = -1;
        
        try {
            // 트랜잭션 시작
            conn.setAutoCommit(false);
            DaoBook dao = new DaoBook(conn);
            rs = dao.deleteBook(book);
            
            conn.commit(); // 트랜잭션 저장 or 종료
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            conn.rollback(); // 트랜잭션 롤벡
        }
        return rs;
    }
    
    @Override
    public int transCommit(ModelBook b1, ModelBook b2) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int transRollback(ModelBook b1, ModelBook b2) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
