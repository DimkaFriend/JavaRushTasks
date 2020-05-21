package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException  {
        while(true)
        {

            try
            {
                FileInputStream r =new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
                if(r.available()<1000)
                {
                    r.close();
                    throw  new DownloadException();
                }
                r.close();
            }catch(IOException e)
            {

            }

        }
    }

    public static class DownloadException extends Exception {

    }
}
