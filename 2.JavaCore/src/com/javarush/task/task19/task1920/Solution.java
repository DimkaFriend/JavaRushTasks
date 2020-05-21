package com.javarush.task.task19.task1920;

/* 
Самый богатый
/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1920/file.txt
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String,Double> map = new HashMap<>();
        try(BufferedReader bf = new BufferedReader(new FileReader(args[0])))
        {
            while (bf.ready())
            {  String buff = bf.readLine();
                try
                {
                    if(!map.containsKey(buff.split(" ")[0]))
                    {
                        map.put(buff.split(" ")[0], Double.parseDouble(buff.split(" ")[1]));
                    }else
                        {
                            map.put(buff.split(" ")[0],(map.get(buff.split(" ")[0])+ Double.parseDouble(buff.split(" ")[1])));
                        }
                }catch (NumberFormatException e)
                {
                    System.out.println(buff.split(" ")[1]);
                    System.out.println(e);
                }
            }
        }
        Double maxEntry = Double.valueOf(0);

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            if (maxEntry == 0 || entry.getValue().compareTo(maxEntry)  > 0)
            {
                maxEntry = entry.getValue();
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            if(maxEntry.equals(entry.getValue()))
            {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);

        list.forEach(e ->{System.out.println(e);});

    }
}
