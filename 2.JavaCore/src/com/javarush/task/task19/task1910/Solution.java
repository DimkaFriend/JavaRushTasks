package com.javarush.task.task19.task1910;

/* 
Пунктуация

[\p{P},\n]

*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedReader = new BufferedReader(fileReader);

        String s;
        while ((s=bufferedReader.readLine())!=null)
        {
            String[]ss = s.split("[\\p{P},\\n]");

            for(String b: ss){
            bufferedWriter.write(b);}
        }



        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
    }
}
