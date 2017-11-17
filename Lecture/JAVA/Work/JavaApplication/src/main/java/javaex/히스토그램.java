package javaex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class 히스토그램 {
    
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<String, String>();

        String s = "This was a great help. I applied this method to similiar problem and rather than concat a SELECT statement I created an event scheduled every couple hours to rebuild a view that pivots n amount of rows from one table into n columns on the other. It's a big help because before I was rebuilding the query using PHP on every execution of the SELECT. Even though views can't leverage Indexes, I'm thinking filtering performance won't be an issue as the pivoted rows->columns represent types of training employees at a franchise have so the view won't ever break a few thousand rows.";

        s = s.toUpperCase();

        String key, val = "";

        for (int i = 0; i < s.length(); i = i + 1) {

        key = s.substring(i, i + 1);

        if (map.get(key) == null) {
        val = ":";
        }

        else {
        val = map.get(key);
        }

        if ((key.charAt(0) >= 'A') && (key.charAt(0) <= 'Z')) {

        map.put(key, val + "*");
        }
        }

        for (Entry<String, String> e : map.entrySet()) {

        System.out.println(String.format("%s%s", e.getKey(), e.getValue()));
        }

        }
    }

