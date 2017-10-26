package java18;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class java_09_LocalDateTime
{
    
    public static void main(String[] args) 
    {
        //현재날짜
        LocalDateTime today = LocalDateTime.now();
        
        System.out.println(today);
        
        System.out.println(today.get(ChronoField.YEAR));
        
        System.out.println(today.get(ChronoField.MONTH_OF_YEAR));
        
        System.out.println(today.get(ChronoField.DAY_OF_MONTH));
 //------------------------------------------------------------------------
        LocalTime curtime = LocalTime.now();

        System.out.println(curtime);
        
        System.out.println(curtime.get(ChronoField.HOUR_OF_DAY));
        
        System.out.println(curtime.get(ChronoField.HOUR_OF_AMPM));
        
        System.out.println(curtime.get(ChronoField.MINUTE_OF_HOUR));
        
        System.out.println(curtime.get(ChronoField.SECOND_OF_MINUTE));
        
        LocalDateTime dt = LocalDateTime.now();
        
        dt = dt.plusYears( 3 );
        dt = dt.minusMonths( 4 );
        dt = dt.plusDays( 2 );
        dt = dt.plusHours( 4 );
        dt = dt.minusMinutes( 30 );
        dt = dt.plusSeconds( 10 );
        
        String s = dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd   HH:mm:ss"));
        System.out.println(s);
        
        LocalDateTime dt2 = LocalDateTime.now();
        
        dt2 = dt2.plus(+3,  ChronoUnit.YEARS  );
        dt2 = dt2.plus(-4,  ChronoUnit.MONTHS );
        dt2 = dt2.plus(+2,  ChronoUnit.DAYS   );
        dt2 = dt2.plus(+4,  ChronoUnit.HOURS  );
        dt2 = dt2.plus(-30, ChronoUnit.MINUTES);
        dt2 = dt2.plus(+10, ChronoUnit.SECONDS);
       
        s = dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd   HH:mm:ss"));
        System.out.println(s);
        
        System.out.println(dt2.toString());
    }
    
}
