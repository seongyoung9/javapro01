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

import board.inf.IServiceUser;
import board.model.ModelUser;
import board.service.ServiceUser;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceUser {
	private static IServiceUser svr = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// classpath를 이용한 설정 파일 로딩
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

		// di를 이용한 servicebook인스턴스 생성
		svr = context.getBean("serviceuser", ServiceUser.class);
		
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
	public void test01_InsertUser() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserid("abcde");
		user.setPasswd("12345");
		user.setRetireYN(false);
		int result = svr.insertUser(user);

		assertTrue(result >= 0);
	}

	@Test
	public void test02_Login() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserid("abcde");
		user.setPasswd("12345");
		List<ModelUser> rs = svr.login(user);

		assertNotNull(rs);
		int result = rs.size();
		assertEquals(1, result);
		ModelUser rrr = rs.get(0);
		String id = rrr.getUserid();
		assertEquals("abcde", id);

	}

	@Test
	public void testLogout() throws Exception {

	}

	@Test
	public void test03_UpdateUserInfo() throws Exception {
		ModelUser updateValue = new ModelUser();
		updateValue.setEmail("qwer1234@naver.com");
		updateValue.setName("qwerty");
		updateValue.setMobile("v30");
		updateValue.setRetireYN(false);
		ModelUser searchValue = new ModelUser();
		searchValue.setUserno(2);
		searchValue.setUserid("abcde");
		int result = svr.updateUserInfo(updateValue, searchValue);
		
		assertTrue(result >= 0);
		
	}

	@Test
	public void test04_UpdatePasswd() throws Exception {
		
		int result = svr.updatePasswd("5678", "12345", "abcde");
		
		assertTrue(result >= 0);
	}

	@Test
	public void test05_DeleteUser() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserid("abcde");
		int result = svr.deleteUser(user);
		assertTrue(result >= 0);
	}

	@Test
	public void test06_SelectUserOne() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserno(2);
		ModelUser result = svr.selectUserOne(user);
		assertNotNull(result);
		assertEquals("abcde", result.getUserid());
	}

	@Test
	public void test07_SelectUserList() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserid("abcde");
		List<ModelUser> result = svr.selectUserList(user);
		assertNotNull(result);
		ModelUser rs = result.get(0);
		assertEquals("abcde", rs.getUserid());
	}

	@Test
	public void test08_Checkuserid() throws Exception {
		String id = "abcde";
		int result = svr.checkuserid(id);
		assertTrue(result >= 0);
	}

}
