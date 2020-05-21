package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream  fileInputStream = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Byte> arr = new ArrayList<>();



        while(fileInputStream.available()>0)
        {
            arr.add((byte)fileInputStream.read());
        }
        fileInputStream.close();

        Collections.sort(arr);
        Set<Byte> set = new HashSet<>(arr);
        //Collections.sort(arr);

        for(byte b: set)
        {
            System.out.print(b+" ");
        }
    }
}
