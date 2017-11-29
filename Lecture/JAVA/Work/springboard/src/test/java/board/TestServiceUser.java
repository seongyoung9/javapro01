package board;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceUser;
import board.model.ModelUser;
import board.service.ServiceUser;

public class TestServiceUser {
	private static IServiceUser svr = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// classpath를 이용한 설정 파일 로딩
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

		// di를 이용한 servicebook인스턴스 생성
		svr = context.getBean("serviceuser", ServiceUser.class);
	}

	@Test
	public void testInsertUser() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserid("abcde");
		user.setPasswd("12345");
		user.setRetireYN(false);
		int result = svr.insertUser(user);

		assertTrue(result >= 0);
		System.out.println(result);
	}

	@Test
	public void testLogin() throws Exception {
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
	public void testUpdateUserInfo() throws Exception {
		ModelUser updateValue = new ModelUser();
		updateValue.setEmail("qwer1234@naver.com");
		updateValue.setName("qwerty");
		updateValue.setMobile("v30");
		updateValue.setRetireYN(false);
		ModelUser searchValue = new ModelUser();
		searchValue.setUserno(9);
		searchValue.setUserid("abcd");
		int result = svr.updateUserInfo(updateValue, searchValue);
		
		assertTrue(result >= 0);
		
	}

	@Test
	public void testUpdatePasswd() throws Exception {
		
		int result = svr.updatePasswd("5678", "12345", "abcde");
		
		assertTrue(result >= 0);
	}

	@Test
	public void testDeleteUser() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserid("abcd");
		int result = svr.deleteUser(user);
		assertTrue(result >= 0);
	}

	@Test
	public void testSelectUserOne() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserno(14);
		List<ModelUser> result = svr.selectUserOne(user);
		assertNotNull(result);
	}

	@Test
	public void testSelectUserList() throws Exception {
		ModelUser user = new ModelUser();
		user.setUserno(14);
		List<ModelUser> result = svr.selectUserList(user);
		assertNotNull(result);
		ModelUser rs = result.get(0);
		assertEquals("abcd", rs.getUserid());
	}

	@Test
	public void testCheckuserid() throws Exception {
		String id = "abcd";
		int result = svr.checkuserid(id);
		assertTrue(result >= 0);
	}

}
