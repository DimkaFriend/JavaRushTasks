package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter((new FileOutputStream(read.readLine()))));
        String str;
        do{
            str = read.readLine();
            write.write(str);
            write.newLine();

        }while(!str.equals("exit"));

        write.close();
        read.close();
    }
}
