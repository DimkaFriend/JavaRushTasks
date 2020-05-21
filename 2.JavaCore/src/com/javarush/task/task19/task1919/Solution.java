package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        String s="";
        while (fileReader.ready())
        {
            s+=(char)fileReader.read();
        }
        HashMap<String,Double> hashMap = new HashMap<String, Double>();

        for(int i = 0; i < s.split("\n").length; i ++)
        {
            String key = s.split("\n")[i].split(" ")[0];
            Double value = Double.parseDouble(s.split("\n")[i].split(" ")[1]);
            if (!hashMap.containsKey(key))
            {
                hashMap.put(key,value);
            }else
                {
                    for(Map.Entry<String,Double> map: hashMap.entrySet())
                    {
                        if(map.getKey().equals(key))
                        {
                            value+=map.getValue();
                            map.setValue(value);
                        }
                    }
                }
        }

        List<Map.Entry<String,Double>> list = new LinkedList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for(Map.Entry<String,Double> map: list)
        {
            System.out.println(map.getKey() +" "+ map.getValue());
        }

        fileReader.close();
    }
}
