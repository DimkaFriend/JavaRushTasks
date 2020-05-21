package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        String s ="";
        while(fileReader.ready())
        {
            s +=Character.toString((char)fileReader.read());
        }

        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher = pattern.matcher(s);
        int i = 0;

        while (matcher.find())
        {
            i++;
        }
        System.out.println(i);
        fileReader.close();
        bufferedReader.close();
    }
}
