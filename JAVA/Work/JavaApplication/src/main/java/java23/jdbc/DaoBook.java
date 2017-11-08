package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DaoBook implements IBook {
    private java.sql.Connection conn = null;
    
    public DaoBook(Connection conn) {
        super();
        this.conn = conn;
    }
    
    @Override
    public int getCount(ModelBook book) throws SQLException {
        
        int result = -1;
        
        // SQL 문장
        String query = "select count(*) as total from book";
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행 결과로 ResultSet을 반환한다.
            java.sql.ResultSet rs = stmt.executeQuery();
            
            rs.next(); // 커서 이동 ResultSet 첫번째 로우로.
            result = rs.getInt("total"); // total컬럼의 값을 가져온다.
        } // rs.getInt(0)도 가능
        catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public int getMaxBlock() throws SQLException {
        int result = -1;
        
        // SQL 문장
        String query = "select max(bookid) as maxid from book";
        
        try {
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행 결과로 ResultSet을 반환한다.
            java.sql.ResultSet rs = stmt.executeQuery();
            
            rs.next(); // 커서 이동 ResultSet 첫번째 로우로.
            result = rs.getInt("maxid"); // total컬럼의 값을 가져온다.
        } // rs.getInt(0)도 가능
        catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        java.sql.ResultSet rs = null;
        
        String query = "select * from book order by bookid asc";
        
        try {
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            rs = stmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelBook book) throws SQLException {
        
        java.sql.ResultSet rs = null;
        
        try {
            String query = "select * from book where bookname like ? ";
            
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + book.getBookname() + "%");
            
            rs = stmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelBook book) throws SQLException {
        
        java.sql.ResultSet rs = null;
        
        try {
            String query = "select * from book where bookname = ? ";
            
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            
            rs = stmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelBook book) throws SQLException {
        java.sql.ResultSet rs = null;
        
        try {
            String query = "select * from book  \n";
            query += " where 1 = 1   \n";
            if (book.getAuthid() != null) {
                query += " and bookid = ?  \n";
            }
            if (!book.getBookname().isEmpty()) {
                query += " and bookname = ? \n";
            }

            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            int c = 1;
            
            if (book.getAuthid() != null) {
                stmt.setInt(c++, book.getBookid());
            }
            if (!book.getBookname().isEmpty()) {
                stmt.setString(c++, book.getBookname());
            }
            
            rs = stmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertBook(ModelBook book) throws SQLException {
        
        int rs = -1;
        
        try {
            String query = "insert into ";
            query += "BOOK(BOOKNAME,PUBLISHER,YEAR,PRICE,DTM,USE_YN,AUTHID)";
            query += "VALUES(?,?,?,?,?,?,?)";
            
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, book.getBookname());
            stmt.setString(2, book.getPublisher());
            stmt.setString(3, book.getYear());
            stmt.setInt(4, book.getPrice());
            stmt.setDate(5, (java.sql.Date) book.getDtm());
            stmt.setBoolean(6, book.getUse_yn());
            stmt.setInt(7, book.getAuthid());
            
            rs = stmt.executeUpdate();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws SQLException {
        
        int rs = -1;
        try {
            String query = "update book  \n";
            query += " set year = ?, price = ?   \n";
            query += " where bookname = ?  ";
            
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, setbook.getYear());
            stmt.setInt(2, setbook.getPrice());
            stmt.setString(3, wherebook.getBookname());
            
            rs = stmt.executeUpdate();
            
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int deleteBook(ModelBook book) throws SQLException {
        
        int rs = -1;
        
        try {
            String query = "delete from book where bookname = ?";
            
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, book.getBookname());
            
            rs = stmt.executeUpdate();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
}
