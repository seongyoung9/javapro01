package java24.mybatis;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;
import java24.mybatis.svr.ServiceBook;

public class TestServiceBook {
	private static IServiceBook service = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// classpath를 이용한 설정 파일 로딩
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

		// di를 이용한 servicebook인스턴스 생성
		service = context.getBean("servicebook", ServiceBook.class);

	}

	@Test
	public void testGetCount() throws Exception {

		int rs = service.getCount();
		assertEquals(4, rs);
	}

	@Test
	public void testGetMaxBookid() throws Exception {

		int rs = service.getMaxBookid();
		assertEquals(4, rs);
	}

	@Test
	public void testSelectAll() throws Exception {
		ModelBook book = new ModelBook();
		List<ModelBook> rs = service.selectAll(book);
		// 인스턴스 검증
		assertNotNull(rs);
		// 값으로 검증
		ModelBook m = rs.get(0);
		assertSame(1, m.getBookid());
		assertEquals("operating system", m.getBookname());
		// 갯수로 검증
		assertEquals(4, rs.size());
	}

	@Test
	public void testSelectLike() throws Exception {
		ModelBook book = new ModelBook();
		book.setBookname("%op%");
		book.setPublisher(null);
		List<ModelBook> rs = service.selectLike(book);
		ModelBook result = rs.get(0);
		int id = result.getBookid();

		assertNotNull(rs);

		assertEquals(1, id);
		
		book.setBookname(null);
		book.setPublisher("%w%");
		
		rs = service.selectLike(book);
		assertTrue(rs.size() == 2);

	}

	@Test
	public void testSelectEqual() throws Exception {
		ModelBook book = new ModelBook();
		book.setBookid(2);
		book.setBookname(null);
		book.setPublisher(null);
		book.setPrice(null);
		List<ModelBook> rs = service.selectEqual(book);

		assertNotNull(rs);
		ModelBook result = rs.get(0);
		assertEquals("oreilly", result.getPublisher());
		assertSame(2, result.getBookid());
		
		book.setBookid(null);
		book.setBookname("mysql");
		book.setPublisher(null);
		book.setPrice(null);
		
		rs = service.selectEqual(book);
		result = rs.get(0);
		assertEquals("2009", result.getYear());
		
		
		book.setBookid(null);
		book.setBookname(null);
		book.setPublisher("hall");
		book.setPrice(null);
		rs = service.selectEqual(book);
		result = rs.get(0);
		assertEquals("java", result.getBookname());
		
		
		book.setBookid(null);
		book.setBookname(null);
		book.setPublisher(null);
		book.setPrice(30700);
		rs = service.selectEqual(book);
		result = rs.get(0);
		assertEquals("operating system", result.getBookname());
	}

	@Test
	public void testInsert() throws Exception {
		ModelBook book = new ModelBook();
		book.setBookname("sql");
		book.setPublisher("yong");
		int rs = service.insert(book);

		assertEquals(5, rs);

	}

	@Test
	public void testInsertMap() throws Exception {

		int rs = service.insertMap("asdf", Date.valueOf("2017-01-01"),123);

		assertTrue(rs >= 0);
	}

	@Test
	public void testUpdateBook() throws Exception {
		ModelBook wherebook = new ModelBook();
		wherebook.setBookid(9);
		ModelBook setbook = new ModelBook();
		setbook.setAuthid(233);
		setbook.setPrice(100);
		int rs = service.updateBook(wherebook, setbook);
		System.out.println(rs);
		assertTrue(rs >= 0);
	}

	@Test
	public void testDeleteBook() throws Exception {
		ModelBook delbook = new ModelBook();
		delbook.setBookid(7);		
		int rs = service.deleteBook(delbook);
		
		assertTrue(rs >= 0);
		
	}

	@Test
	public void testSelectDynamic() {
		fail("Not yet implemented");
	}

}
