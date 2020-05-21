package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        while(true)
        {
            InputStream file1InputStream =null;
            String filename =new BufferedReader(new InputStreamReader(System.in)).readLine();

            try {
                file1InputStream  = new FileInputStream(filename);
                file1InputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(filename);
                return;
            }finally {
               // file1InputStream.close();
            }
        }
    }
}
