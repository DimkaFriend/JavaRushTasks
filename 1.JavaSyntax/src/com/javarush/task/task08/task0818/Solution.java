package com.javarush.task.task08.task0818;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("K",1000);
        map.put("D",500);
        map.put("V",1000);
        map.put("G",499);
        map.put("A",1000);
        map.put("R",500);
        map.put("E",1000);
        map.put("W",1000);
        map.put("Q",1000);
        map.put("X",499);
        return  map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Integer> map_out = iterator.next();
            if(map_out.getValue()<500)
            {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}