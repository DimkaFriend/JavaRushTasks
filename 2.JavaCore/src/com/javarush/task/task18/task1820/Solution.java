package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream file1InputStream  = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        OutputStream file2InputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());


        StringBuilder strBuild = new StringBuilder();

        while(file1InputStream.available()>0)
        {
            char chBuff = (char) file1InputStream.read();
            if(chBuff!=' ')
            {
                strBuild.append(chBuff);
            }else
                {
                    file2InputStream.write(Integer.toString(Math.round(Float.parseFloat(strBuild.toString()))).getBytes());
                    file2InputStream.write(new String(" ").getBytes());
                    strBuild.delete(0,strBuild.length());

                }
        }
        file2InputStream.write(Integer.toString(Math.round(Float.parseFloat(strBuild.toString()))).getBytes());
        file1InputStream.close();
        file2InputStream.close();
    }
}
