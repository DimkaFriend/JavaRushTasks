package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file = bf.readLine();
        bf.close();
        try(BufferedReader fr = new BufferedReader(new FileReader(file)))
        {

            while (fr.ready())
            {
                StringBuilder sb = new StringBuilder();
                sb.append(fr.readLine());
                System.out.println(sb.reverse());

            }
        }
    }
}
