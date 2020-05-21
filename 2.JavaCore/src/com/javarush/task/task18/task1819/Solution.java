package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {

        File f1 = new File(new BufferedReader(new InputStreamReader(System.in)).readLine());
        File f2 = new File(new BufferedReader(new InputStreamReader(System.in)).readLine());
        InputStream file1InputStream = new FileInputStream(f1);
        byte[] f1buff = new byte[file1InputStream.available()];
        file1InputStream.read(f1buff);
        file1InputStream.close();
        OutputStream file1OutputStream = new FileOutputStream(f1);
        InputStream file2InputStream = new FileInputStream(f2);
        while(file2InputStream.available()>0)
        {
            file1OutputStream.write(file2InputStream.read());
        }
        file1OutputStream.write(f1buff);

        file1OutputStream.close();
        file2InputStream.close();


//        InputStream file1InputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        OutputStream file2InputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        while (file1InputStream.available() > 0) {
//            file2InputStream.write(file1InputStream.read());
//        }
//        file1InputStream.close();
//        file2InputStream.close();
//        int i = file2InputStream.;
    }
}
