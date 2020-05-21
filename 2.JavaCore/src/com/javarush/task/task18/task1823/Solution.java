package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public volatile static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        String s;
        while(!(s=new BufferedReader(new InputStreamReader(System.in)).readLine()).equals("exit"))
        {
            ReadThread readThread = new ReadThread(s);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private InputStream file1InputStream = null;
        private int[] b = new int[256];
        private int max=0;
        private int maxi=0;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
            try {
                file1InputStream = new FileInputStream(this.fileName);

                while(file1InputStream.available()>0)
                {

                    b[file1InputStream.read()]++;
                }
                file1InputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            for(int i = 0 ; i < b.length; i++)
            {
                if(b[i]>max){max=b[i];maxi = i;}
            }
            synchronized (resultMap){
                resultMap.put(fileName,maxi);}

        }
        // implement file reading here - реализуйте чтение из файла тут

    }
}
