package javaex;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class 히스토 {
    
    public static void main(String[] args) {
        
        String x = "This was a great help. "
                + "I applied this method to similiar problem and rather than concat a SELECT statement "
                + "I created an event scheduled every couple hours to rebuild a view that pivots n amount"
                + " of rows from one table into n columns on the other. It's a big help because before "
                + "I was rebuilding the query using PHP on every execution of the SELECT."
                + " Even though views can't leverage Indexes, I'm thinking filtering performance "
                + "won't be an issue as the pivoted rows->columns represent types of training employees at a"
                + " franchise have so the view won't ever break a few thousand rows.";
        Map<String, String> map = new HashMap<>();
        
        for (int i = 0; i <= x.length() - 1; i++) {
            
            x = x.toUpperCase();
            
            String ch = x.substring(i, i + 1);
            
            if ('A' <= ch.charAt(0) && ch.charAt(0) <= 'Z') {
                
                if (map.get(ch) == null) {
                    map.put(ch, "");
                } else {
                    map.put(ch, map.get(ch) + "-");
                    
                }
            }
        }
        TreeMap<String, String> treemap = new TreeMap<>();
        
        treemap.putAll(map); // hashmap --> treemap으로 변환
        
        for (Map.Entry<String, String> e : treemap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
            
        }
    }
    
}
