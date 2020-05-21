package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();//{name=Ivanov, country=Ukraine, city=Kiev, age=null}
//        map.put("name","Ivanov");
//        map.put("country","Ukraine");
//        map.put("city","Kiev");
//        map.put("age",null);

        map.put(null,null);
        map.put(null,null);
        map.put(null,null);
        map.put(null,null);

        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        if(params==null)
        {
            return "";
        }

        String result=null;
        for (Map.Entry m: params.entrySet()) {
            if(result==null)
            {
                if((m.getKey()!=null)&&(m.getValue()!=null))
                {
                    result= String.format("%s = '%s'",m.getKey(),m.getValue());
                }
            }
            else
                {
                    if((m.getKey()!=null)&&(m.getValue()!=null))
                    {
                        result+= String.format(" and %s = '%s'",m.getKey(),m.getValue());
                    }

                }
        }

        return result!=null?result:"";
    }
}
