package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceAuth;
import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelAuth;
import java24.mybatis.svr.ServiceAuth;
import java24.mybatis.svr.ServiceBook;

public class TestServiceAuth {
	private static ServiceAuth svr = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		// classpath를 이용한 설정 파일 로딩
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

		// di를 이용한 servicebook인스턴스 생성
		svr = context.getBean("serviceauth", ServiceAuth.class);
	}

	@Test
	public void testGetCount() throws Exception {
		ModelAuth auth = new ModelAuth();
		int rs = svr.getCount(auth);
		assertEquals(3, rs);
	}

	@Test
	public void testGetMaxAuthid() throws Exception {
		
		int rs = svr.getMaxAuthid();
		
		assertEquals(7, rs);
	}

	@Test
	public void testSelectAll() throws Exception {

		List<ModelAuth> result = svr.selectAll();
		int rs = result.size();
		
		assertEquals(3, rs);
	}

	@Test
	public void testSelectLike() throws Exception {
		ModelAuth auth = new ModelAuth();
		auth.setName("%b%");
		auth.setBirth(null);
		List<ModelAuth> result = svr.selectLike(auth);
		
		assertSame(1, result.size());
		
		auth.setName(null);
		auth.setBirth("%1980.%");
		result = svr.selectLike(auth);
		
		assertSame(1, result.size());

	}

	@Test
	public void testSelectEqual() throws Exception {
		ModelAuth auth = new ModelAuth();
		auth.setAuthid(1);
		auth.setName(null);
		auth.setBirth(null);
		List<ModelAuth> result = svr.selectEqual(auth);
		assertSame(1, result.size());
		
		auth.setAuthid(null);
		auth.setName("kim");
		auth.setBirth(null);
		result = svr.selectEqual(auth);
		assertSame(1, result.size());
		
		auth.setAuthid(null);
		auth.setName(null);
		auth.setBirth("1980.05.01");
		assertSame(1, result.size());
	}

	@Test
	public void testInsertAuth() throws Exception {
		ModelAuth auth = new ModelAuth();
		auth.setAuthid(100);
		auth.setName("lee");
		auth.setBirth("2017.06.24");
		int result = svr.insertAuth(auth);
		
		assertTrue(result == 100);
	}

	@Test
	public void testUpdateAuth() throws Exception {
		
		ModelAuth whereauth = new ModelAuth();
		whereauth.setAuthid(100);
		ModelAuth setauth = new ModelAuth();
		setauth.setName("kang");
		setauth.setBirth("2017.02.05");
		int result = svr.updateAuth(whereauth, setauth);
		assertTrue(result >= 0);
	}

	@Test
	public void testDeleteAuth() throws Exception {
		ModelAuth auth = new ModelAuth();
		auth.setAuthid(100);
		auth.setName(null);
		auth.setBirth(null);
		int result = svr.deleteAuth(auth);
		assertTrue(result >= 0);
		
/*		auth.setAuthid(null);
		auth.setName("koo");
		auth.setBirth(null);
		result = svr.deleteAuth(auth);
		assertTrue(result >= 0);
		
		auth.setAuthid(null);
		auth.setName(null);
		auth.setBirth("2017.02.06");
		result = svr.deleteAuth(auth);
		assertTrue(result >= 0);   */
	}

}
