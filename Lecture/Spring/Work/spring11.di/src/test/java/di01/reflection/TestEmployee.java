package di01.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestEmployee {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test_Make_Instance_With_New() {
		
		di01.model.Employee emp1 = new di01.model.Employee();
		emp1.setAddr("emp1 addr");
		emp1.setName("emp1 name");
		emp1.setSalary(10000);
		emp1.setRrn("emp1 rrn");
		assertEquals("emp1 addr", emp1.getAddr());
		
		di01.model.Employee emp2 = new di01.model.Employee("emp2 name","emp2 addr",20000,"emp2 rrn");
		assertEquals("emp2 addr", emp2.getAddr());
		
		
	}
	@Test
	public void test_Make_Instance_With_reflection() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//reflection을 이용하여 인스턴스 만들기
		//new di01.model.Employee("emp2 name","emp2 addr",20000,"emp2 rrn"); 코드 만들기
		Class klass = Class.forName("di01.model.Employee");  //class 로딩
		
		//생성자 메서드의 매개변수 타입 선언.
		Class [] paraTypes = {String.class, String.class, int.class, String.class};
		
		//매개변수 값설정
		Object[] objs      = {"emp2 name",   "emp2 addr",  20000,          "emp2 rrn"};
		
		//생성자 메서드 가져오기
		java.lang.reflect.Constructor cons = klass.getConstructor( paraTypes );
		
		//인스턴스 만들기
		Object instance = cons.newInstance( objs );
		
		//출력
		System.out.println( instance.toString() );
		assertEquals("emp2 addr", ((di01.model.Employee)instance).getAddr());
		
		/*
		 * setter를 이용하여 필드값 바꾸기
		 */
		java.lang.reflect.Method m = klass.getMethod("setName", String.class);
		
		//매개변수 값 설정
		Object [] params = {"Hello"};
		
		//메서드 호출
		m.invoke(instance, params);  // Employee.setName("Hello"); 가 실행된다.
		
		System.out.println( instance.toString() );
		assertEquals("Hello", ((di01.model.Employee)instance).getName());
		
		/*
		 * getter를 이용하여 필드값 가져오기
		 */
		m = klass.getMethod("getName"); //매개변수가 없어서 뒤는 생략
		Object result = m.invoke(instance);
		assertEquals("Hello", result);
	}
}
