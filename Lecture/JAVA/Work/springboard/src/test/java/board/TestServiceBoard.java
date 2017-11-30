package board;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceBoard;
import board.model.ModelBoard;
import board.service.ServiceBoard;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceBoard {
	private static IServiceBoard svr = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// classpath를 이용한 설정 파일 로딩
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

		// di를 이용한 servicebook인스턴스 생성
		svr = context.getBean("serviceboard", ServiceBoard.class);
		
		javax.sql.DataSource dataSource = (DataSource) context.getBean("dataSource");
		org.apache.ibatis.jdbc.ScriptRunner runner = new
		org.apache.ibatis.jdbc.ScriptRunner( dataSource.getConnection() );
		runner.setAutoCommit(true);
		runner.setStopOnError(true);
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile();
		
		java.io.Reader br = new java.io.BufferedReader( new java.io.FileReader(sf) );
		runner.runScript( br);
		runner.closeConnection();
	}


	@Test
	public void test01_GetBoardName() throws Exception {

		String result = svr.getBoardName("data");
		assertNotNull(result);
		assertEquals("자료실", result);
	}

	@Test
	public void test02_GetBoardOne() throws Exception {
		ModelBoard result = svr.getBoardOne("data");
		assertNotNull(result);
		assertEquals("자료실",result.getBoardnm());
	}

	@Test
	public void test03_GetBoardList() throws Exception {
		
		List<ModelBoard> result = svr.getBoardList();
		assertNotNull(result);
		ModelBoard rs = result.get(0);
		assertEquals("qna", rs.getBoardcd());
	}

	@Test
	public void test04_InsertBoard() throws Exception {
		ModelBoard board = new ModelBoard();
		board.setBoardcd("abcd");
		board.setBoardnm("1234");
		board.setUseYN(false);
		board.setInsertDT(null);
		board.setInsertUID(null);
		board.setUpdateDT(null);
		board.setUpdateUID(null);
		int result = svr.insertBoard(board);
		assertTrue(result >= 0);
	}

	@Test
	public void test05_UpdateBoard() throws Exception {
		ModelBoard updateValue = new ModelBoard();
		updateValue.setBoardnm("java");
		ModelBoard searchValue = new ModelBoard();
		searchValue.setBoardnm("자료실");
		int result = svr.updateBoard(updateValue, searchValue);
		assertTrue(result >= 0);
		System.out.println(result);
	}

	@Test
	public void test06DeleteBoard() throws Exception {
		ModelBoard board = new ModelBoard();
		board.setBoardcd("qna");
		int result = svr.deleteBoard(board);
		assertNotNull(result);
	}

	@Test
	public void test07GetBoardSearch() throws Exception {
		ModelBoard board = new ModelBoard();
		board.setBoardcd("data");
		board.setBoardnm("");
		List<ModelBoard> result = svr.getBoardSearch(board);
		assertNotNull(result);
		assertTrue( result.size() == 1);
		
		board.setBoardcd("");
		board.setBoardnm("자유게시판");
		result = svr.getBoardSearch(board);
		assertNotNull(result);
		assertTrue( result.size() == 1);
	}

	@Test
	public void test08GetBoardTotalRecord() throws Exception {
		int result = svr.getBoardTotalRecord("data", "");
		assertTrue(result >= 0);
		
		result = svr.getBoardTotalRecord("", "자유게시판");
		assertTrue(result >= 0);
	}

	@Test
	public void test09GetBoardPaging() throws Exception {
		List<ModelBoard> result = svr.getBoardPaging("", "", 1, 3);
		assertEquals(3, result.size());
		
		result = svr.getBoardPaging("data", "", 1, 3);
		assertEquals(1, result.size());
	}

	@Test
	public void test10InsertBoardList() {
		
	}

	@Test
	public void test11GetArticleTotalRecord() {
		fail("Not yet implemented");
	}

	@Test
	public void test12GetArticleList() {
		fail("Not yet implemented");
	}

	@Test
	public void test13GetArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void test14InsertArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void test15UpdateArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void test16DeleteArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void test17IncreaseHit() {
		fail("Not yet implemented");
	}

	@Test
	public void test18GetNextArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void test19GetPrevArticle() {
		fail("Not yet implemented");
	}

	@Test
	public void test20GetAttachFile() {
		fail("Not yet implemented");
	}

	@Test
	public void test21GetAttachFileList() {
		fail("Not yet implemented");
	}

	@Test
	public void test22InsertAttachFile() {
		fail("Not yet implemented");
	}

	@Test
	public void test23DeleteAttachFile() {
		fail("Not yet implemented");
	}

	@Test
	public void test24GetComment() {
		fail("Not yet implemented");
	}

	@Test
	public void test25GetCommentList() {
		fail("Not yet implemented");
	}

	@Test
	public void test26InsertComment() {
		fail("Not yet implemented");
	}

	@Test
	public void test27UpdateComment() {
		fail("Not yet implemented");
	}

	@Test
	public void test28DeleteComment() {
		fail("Not yet implemented");
	}
	
}
