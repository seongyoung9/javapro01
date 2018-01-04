package java20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Movie implements Comparable<Movie> {
	
	private double rating;
	private String name;
	private int year;
	
	

	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]" ;
	}



	public Movie() {
		super();
	}



	public Movie( String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}



	@Override
	public int compareTo(Movie o) {
		
		// year를 기준으로 오름차순으로 정렬
		// +일때
		// 0일때
		// -일때
		return this.year - o.year;
	}
	
	// rating값으로 오름차순 정렬.  true추가시 내림차순
	public static class RatingCompare implements Comparator<Movie>{
		// 오름차순 정렬 :  1
		// 내림차순 정렬 : -1
		int mode = 1;  
		
		public RatingCompare() {
			super();
			mode = 1;
		}
		public RatingCompare(boolean desc) {
			super();
			if( desc == true ) { mode = -1; }
		
		}

		@Override
		public int compare(Movie o1, Movie o2) {

			// +일때 : 바꾼다.
			// 0일때 : 바꾸지 않는다.
			// -일때 : 바꾸지 않는다.
			
			if( o1.getRating() < o2.getRating() ) {
				return -1 * mode;
			}
			else if( o1.getRating() > o2.getRating() ) {
				return 1 * mode;
			}
			else {
				return 0 * mode; 
			}
		}
	}
	
	// name을 기준으로 오름차순 정렬. true추가시 내림차순
	public static class NameCompare implements Comparator<Movie>{

		int mode = 1;

		public NameCompare() {
			
			super();
			mode = 1;
			
		}
		public NameCompare(boolean desc) {
			
			super();
			if( desc == true )  mode = -1; 
		
		}
		
		@Override
		public int compare(Movie o1, Movie o2) {
			
			// +일때 : 바꾼다.
			// 0일때 : 바꾸지 않는다.
			// -일때 : 바꾸지 않는다.
			
			return o1.getName().compareTo( o2.getName() ) * mode;
		}
		
	}
	
	
}

public class java20_11_Comparable_Comparator {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<>();
		
		list.add( new Movie( "Force", 8.3 , 2015 ) );
		list.add( new Movie( "Start", 8.7 , 1977 ) );
		list.add( new Movie( "Emper", 8.8 , 1990 ) );
		list.add( new Movie( "Retur", 8.4 , 2000 ) );
		
		// year를 기준으로 정렬 : Comparable
		Collections.sort( list );   //Movie.compareTo()를 사용하여 정렬한다.
		System.out.println( list );            //year를 기준이로 함
		System.out.println( list.toString() );
		
		// rating를 기준으로 정렬 : Comparator
		// 1. Movie.RatingCompare 인스턴스 만들기
		// 2. Collections.sort(  ) 실행
		// 3. print
		Movie.RatingCompare ratingCompare = new Movie.RatingCompare();
		Collections.sort( list, ratingCompare );
		System.out.println( "rating올림 : " + list.toString() );
		
		// name을 기준으로 정렬 : Comparator
		// 1. Movie.NameCompare 인스턴스 만들기
		// 2. Collections.sort(  ) 실행
		// 3. print
		Movie.NameCompare namecompare = new Movie.NameCompare();
		Collections.sort( list, namecompare );
		System.out.println( "name올림   : " +  list.toString() ); 
		
		// 문제. rating을 기준으로 내림차순 정렬 : Comparator    
		// 생성자를 만들어 true값을 반환할시 -1을 곱하게해줌
		
		ratingCompare = new Movie.RatingCompare( true );
		Collections.sort( list, ratingCompare );
		System.out.println( "rating내림 : " +  list.toString() );
		
		// 문제. name을 기준으로 내림차순 정렬 : Comparator
		
		namecompare = new Movie.NameCompare();
		Collections.sort( list, namecompare );
		System.out.println( "name내림   : " + list.toString() ); 
		
	}
}
