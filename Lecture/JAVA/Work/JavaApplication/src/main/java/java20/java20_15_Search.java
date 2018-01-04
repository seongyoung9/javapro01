package java20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class User{
	private String name;
	private Integer number;
	private Boolean ischeck;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Boolean getIscheck() {
		return ischeck;
	}
	public void setIscheck(Boolean ischeck) {
		this.ischeck = ischeck;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", number=" + number + ", ischeck=" + ischeck + "]";
	}
	
	public User() {
		super();
	}
	public User(String name, Integer number, Boolean ischeck) {
		super();
		this.name = name;
		this.number = number;
		this.ischeck = ischeck;
	}
	//Predicate를 사용하기 위해서는  compile 'commons-collections:commons-collections:3.2' 를 gradle에 추가해야 한다.
	public static class MyPredicateContains implements Predicate{

		private Object expected;
		private String fieldname;
		
		public MyPredicateContains(String fieldname , Object expected) {
			super();
			this.expected = expected;
			this.fieldname = fieldname;
		}
		
		@Override
		public boolean evaluate(Object object) {
			if( fieldname.equals( "name" ) ) {
				return ( (User)object ).getName().contains( expected.toString() );
			}
			else if( fieldname.equals( "number" ) ) {
				return ( (User)object ).getNumber().equals( expected );
			}
			else if( fieldname.equals( "ischeck" ) ) {
				return ( (User)object ).getIscheck().equals( expected );
			}
			else {
			return false;
			}
		}
		
	}
	
	
}

public class java20_15_Search {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		users.add(new User( "User A", 1, true ) );
		users.add(new User( "User B", 2, false ) );
		users.add(new User( "User C", 3, true ) );
		
		// lamda를 이용한 searching : java8부터 지원
		// equal searching 
		List<User> result = users.stream()
				                          .filter( e->e.getName().equals("User B") )
										  .collect( Collectors.toList() );
		System.out.println( result.toString() );
		
		//Contains Searching
		result = users.stream()
                			   .filter( e->e.getName().contains("A") )
                			   .collect( Collectors.toList() );
		System.out.println( result.toString() );
		
		// predicate 를 이용한 searching
		// 1. User.MyPredicateContains 인스턴스 만들기
		// 2. CollectionUtils.select() 실행
		// 3. print
		User.MyPredicateContains predicate = new User.MyPredicateContains("name", "B");
		result = (List<User>)CollectionUtils.select(users, predicate);
		System.out.println( result.toString() );
		
		predicate = new User.MyPredicateContains("ischeck", true);
		result = (List<User>)CollectionUtils.select(users, predicate);
		System.out.println( result.toString() );
		
	}
	
}
