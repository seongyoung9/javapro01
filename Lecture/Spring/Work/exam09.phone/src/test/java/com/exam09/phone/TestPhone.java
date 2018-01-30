package com.exam09.phone;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@FixMethodOrder(org.junit.runners.MethodSorters.NAME_ASCENDING)
public class TestPhone {

	private static ApplicationContext context = null;
    private static IServicePhone service = null;
        
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        service = context.getBean( IServicePhone.class );
    } 

	@Test
	public void testGetPhoneList() {

		List<ModelPhone> result = service.getPhoneList();
		
		assertNotNull( result );
		assertTrue( result.size() > 0 );
		
	}

	@Test
	public void testInsertPhone() {
		ModelPhone phone = new ModelPhone( "aaa" , "bbb" , 100 );
		
		int result = service.insertPhone( phone );
		
		assertNotNull( result );
		assertTrue( result == 1 );
	}
}
