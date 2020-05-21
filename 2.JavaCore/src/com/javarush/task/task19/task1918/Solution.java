package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1;
        try( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));)
        {
             file1 = bufferedReader.readLine();
        }
        StringBuilder sb = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));)
        {
            while (bufferedReader.ready())
            {
                sb.append((char) bufferedReader.read());
            }
        }


    }
}
