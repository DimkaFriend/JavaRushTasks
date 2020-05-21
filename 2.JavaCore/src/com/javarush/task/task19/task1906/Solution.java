package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        int i = 0;
        while(fileReader.ready())
        {
            i++;
            if(i%2==0)
            {
                fileWriter.write(fileReader.read());
            }else
                {
                    fileReader.read();
                }
        }
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
