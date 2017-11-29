package java18;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.SystemPropertyUtils;

public class ex_05_Date2 
{
    
    public static void main(String[] args)
    {
        
        Date now = new Date();
        
        //현재 날짜와 시간출력
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //HH        
        String fo = sp.format(now);
        System.out.println(fo);
        
        //현재 년도 출력
        System.out.println(now.getYear()+1900);
        
        sp = new SimpleDateFormat("yyyy");
        System.out.println(sp.format(now));
        
        //현재 월만 출력
        sp = new SimpleDateFormat("MM");
        System.out.println(sp.format(now));
        
        //현재 일만 출력
        System.out.println(now.getDate());
        
        //현재 시간만 출력
        System.out.println(now.getHours());
        
        //현재 분만 출력
        System.out.println(now.getMinutes());
        
        //현재 초만 출력
        System.out.println(now.getSeconds());
        
        sp = new SimpleDateFormat("yyyy-MM-dd");
        
        now.setYear (now.getYear()  +3);       
        now.setMonth(now.getMonth() -4);
        now.setDate (now.getDate()   +2);
        
        System.out.println(sp.format(now));
        
        now.setHours  (now.getHours()      +4);
        now.setMinutes(now.getMinutes() -30);
        now.setSeconds(now.getSeconds() +10);
        
        sp = new SimpleDateFormat("HH:mm:ss a");
        System.out.println(sp.format(now));
    }
    
}
