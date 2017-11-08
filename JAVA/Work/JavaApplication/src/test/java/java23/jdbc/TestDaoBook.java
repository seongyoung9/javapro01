package java23.jdbc;


//resultset 사용법
//rs.next(); 현재 row에서 다음 row로
//rs.last(); 마지막 row로
//rs.first(); 첫번째 row로
//rs.getInt(컬럼명);
//rs.getString(컬럼명);
//rs.getBoolean(컬럼명);
//rs.getDate(컬럼명);
//rs.getRow();현재 커서의 인덱스 번호


import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoBook {
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        
        DaoBook book = new DaoBook(conn);
        ModelBook model = new ModelBook();
        int result = book.getCount(model);
        
        assertEquals(4, result);
        
    }
    
    @Test
    public void testGetMaxBlock() throws SQLException {
        
        DaoBook book = new DaoBook(conn);
        int result = book.getMaxBlock();
        
        assertEquals(4, result);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        
        DaoBook book = new DaoBook(conn);
        
        java.sql.ResultSet rs = book.selectAll();
        
        rs.next();
        int bookid = rs.getInt("bookid");
        
        assertEquals(1, bookid);
        
        String bookname = rs.getString("bookname");
        
        assertEquals("operating system", bookname);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        
        DaoBook book = new DaoBook(conn);
        ModelBook model = new ModelBook();
        
        model.setBookname("ja");
        java.sql.ResultSet rs = book.selectLike(model);
        
        // resultset을 이용한 검증
        assertNotNull(rs);
        // assertTrue(rs.getRow() >= 1);
        // rs.getRow(); //resultset의 커서가 가르키는 위치
        // 값을 이용한 검증 커서 이동을 해야함
        rs.next(); // 첫번째 로우로 이동
        String name = rs.getString("bookname"); // java가져오게됨
        
        assertTrue(name.contains("ja")); // ja가 포함되어있는지 아닌지
        assertTrue(name.contains(model.getBookname())); // model.getBookname() = ja
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        
        DaoBook book = new DaoBook(conn);
        ModelBook model = new ModelBook();
        
        model.setBookname("mysql");
        java.sql.ResultSet rs = book.selectEqual(model);
        // 인스턴스 검증
        assertNotNull(rs);
        rs.next();// 커서가 첫번째 row로
        String bookname = rs.getString("bookname");
        
        assertEquals("mysql", bookname);
        assertEquals(model.getBookname(), bookname);
        
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        
        ModelBook book = new ModelBook();
        DaoBook dao = new DaoBook(conn);
        //첫번째 검증.  select     *    from book where 1 = 1
        //              select count(*) from book where 1 = 1
        book.setBookid(null);
        book.setBookname("");
        
        java.sql.ResultSet rs = dao.selectDynamic(book);
        
        assertNotNull(rs); //인스턴스 검증
        
        //갯수로 검증
        rs.last();     //커서를 마지막으로
        int rows = rs.getRow();   //현재 커서의 index번호를 가져온다
        assertEquals(dao.getCount(book), rows );
        
        //두번째 검증 select * from book where 1 = 1
        book.setBookid(1);
        book.setBookname("");
        
        rs = dao.selectDynamic(book);

        //인스턴스 검증
        assertNotNull(rs);
        //값으로 검증
        rs.next();     //커서를 다음으로
        int bookid = rs.getInt("bookid");
        String bookname = rs.getString("bookname");
        
        assertEquals(1, bookid);
        assertSame  (book.getBookid(), bookid);
        
        assertEquals("operating system", bookname);
        
        //세번째 검증  select * from book where 1 = 1 and bookname = 'java'
        book.setBookid(null);
        book.setBookname("java");
        
        rs = dao.selectDynamic(book);
        //인스턴스 검증
        assertNotNull(rs);
        
        rs.next();
        bookname = rs.getString("bookname");
        
        assertEquals("java", bookname);
        
        //네번째 검증 select * from book where 1 = 1 and bookid = 2 and bookname = 'mysql';
        book.setBookid(2);
        book.setBookname("mysql");
        
        rs = dao.selectDynamic(book);
        
        assertNotNull(rs);
        
        rs.first();
        
        bookid = rs.getInt("bookid");
        bookname = rs.getString("bookname");
        
        assertEquals(2, bookid);
        assertEquals("mysql", bookname);
        
    }
    
    @Test
    public void testInsertBook() throws SQLException {
        
        // java.util.Date date1 = new java.util.Date();
        
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-08"); // == new java.util.Date(117,10,8);
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date2);
        book.setUse_yn(true);
        book.setAuthid(3);
        
        DaoBook dao = new DaoBook(conn);
        int result = dao.insertBook(book);
        
        // insert검증 되면 1 안되면 0 exception은 -1
        
        assertEquals(1, result);
    }
    
    @Test
    public void testUpdateBook() throws SQLException {
        
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test");
        ModelBook setbook = new ModelBook();
        setbook.setPrice(12000);
        setbook.setYear("2016");
        
        DaoBook dao = new DaoBook(conn);
        int result = dao.updateBook(wherebook, setbook);
        
        // 검증코드
        // 1이상의 숫자가 리턴되는 경우 : 성공
        // 0값이 리턴되는 경우 : 성공 where 을 못찾아서
        assertTrue(result >= 0);
        
    }
    
    @Test
    public void testDeleteBook() throws SQLException {
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        
        DaoBook dao = new DaoBook(conn);
        int result = dao.deleteBook(book); // result = 1
        
        // 검증코드
        // 1이상의 값이 리턴되는 경우 : 성공
        // 0값이 리턴되는 경우 : 성공(where 가 없어서)
        
        assertTrue(result >= 0);
        
        book.setBookname("test2");
        
        result = dao.deleteBook(book); // result = 0
        
        assertTrue(result >= 0);
    }
    
}
