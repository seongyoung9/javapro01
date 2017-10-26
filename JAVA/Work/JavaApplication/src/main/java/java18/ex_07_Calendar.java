package java18;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex_07_Calendar 
{
    
    public static void main(String[] args)
    {

        Calendar cal = Calendar.getInstance();
        
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");
        String formatted = sp.format(cal.getTime());
        System.out.println(formatted);
        
        
    }
    
}
