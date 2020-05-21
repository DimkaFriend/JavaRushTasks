package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        OutputStream file1InputStream = new  FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        InputStream file2InputStream = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        InputStream file3InputStream = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        byte[] buff = new byte[1000];
        while (file2InputStream.available() > 0)
        {
            int count = file2InputStream.read(buff);
            file1InputStream.write(buff,0, count);
        }
        while (file3InputStream.available() > 0)
        {
            int count = file3InputStream.read(buff);
            file1InputStream.write(buff,0, count);
        }
        file1InputStream.close();
        file2InputStream.close();
        file3InputStream.close();
    }
}
