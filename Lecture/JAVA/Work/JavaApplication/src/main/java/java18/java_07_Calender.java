package java18;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class java_07_Calender 
{
    
    public static void main(String[] args)
    {
        
        Calendar cal = Calendar.getInstance();
        
        System.out.println(cal);
        System.out.println("년  >> " + cal.get(Calendar.YEAR ));
        System.out.println("월  >> " + cal.get(Calendar.MONTH));
        System.out.println("일  >> " + cal.get(Calendar.DATE));
        System.out.println("시  >> " + cal.get(Calendar.HOUR));
        System.out.println("분  >> " + cal.get(Calendar.MINUTE));
        System.out.println("초  >> " + cal.get(Calendar.SECOND));
        
        cal.set(Calendar.YEAR,  2000);
        cal.set(Calendar.MONTH,    4);
        cal.set(Calendar.DATE,    13);
        cal.set(Calendar.HOUR,    12);
        cal.set(Calendar.MINUTE,  13);
        cal.set(Calendar.SECOND,  15);
        
        System.out.println(cal.toString());
        
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");
        String formatted = sp.format(cal.getTime());
        System.out.println(formatted);
        
        
    }
    
}
