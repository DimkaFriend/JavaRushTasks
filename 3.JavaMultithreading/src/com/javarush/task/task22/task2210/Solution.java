package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

        for(int i = 0; i < getTokens("task.task22.task2210",".").length;i++)
        {
            System.out.println(getTokens("task.task22.task2210",".")[i]);
        }

    }
    public static String [] getTokens(String query, String delimiter) {
        if(query.isEmpty()||delimiter.isEmpty())
        {
            return null;
        }

        StringTokenizer stringTokenizer =new StringTokenizer(query,delimiter);
        int i =0;

        String[] strings =new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreElements())
        {
            strings[i] = stringTokenizer.nextToken();
            i++;
        }
        return strings;
    }
}
