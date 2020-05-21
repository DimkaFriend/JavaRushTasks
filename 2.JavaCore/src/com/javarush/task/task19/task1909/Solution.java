package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        bufferedReader.close();
        bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String s;
        while (( s =bufferedReader.readLine())!=null)
        {

//            byte[] b = s.getBytes();
//            for(int i = 0 ; i < b.length; i++)
//            {
//                if(b[i]==46)
//                {
//                    b[i]=33;
//                }
//                bufferedWriter.write(b[i]);
//            }
            s.replaceAll("\\.","!");
            bufferedWriter.write(s);



        }
        bufferedWriter.close();
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();

    }
}
