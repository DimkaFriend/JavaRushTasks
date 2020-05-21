package com.javarush.task.task18.task1806;

import java.io.*;

/* 
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("/tmp/data.txt");
        //BufferedInputStream inputStream = new BufferedInputStream( new FileInputStream("/home/dmitriy/data.txt"));
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("/tmp/result.txt");
        //BufferedOutputStream outputStream = new BufferedOutputStream( new FileOutputStream("/home/dmitriy/result.txt"));
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }



        inputStream.close();
        outputStream.close();
    }
}
