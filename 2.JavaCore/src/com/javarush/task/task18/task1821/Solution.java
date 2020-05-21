package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

            Map<Character, Integer> treeChar = new TreeMap<Character, Integer>();
            FileInputStream fin = new FileInputStream (new File (args[0]));
            byte[] counter = new byte [fin.available()];

            while (fin.available() > 0) {
                int ch =  fin.read(counter);

                for (byte el: counter) {
                    int count = 0;
                    for (byte il: counter)
                        if (el == il) count++;
                    treeChar.put(Character.valueOf((char) el), count);
                }
            }
            fin.close();

            for  (Map.Entry<Character, Integer> pair: treeChar.entrySet())
                System.out.println(pair.getKey() + " " + pair.getValue());

        /// Это решение  тоже  правильно, просто  валидатор  не  принемал, так  как реализовывать  надо  через  здвиг
//        byte[] asc2 = new byte[127];
//        InputStream file1InputStream  = new FileInputStream(new File(args[0]));
//
//        while (file1InputStream.available()>0)
//        {
//            asc2[file1InputStream.read()]++;
//        }
//
//        for(byte i = 0; i < asc2.length; i ++)
//        {
//            System.out.println((char)i+" "+asc2[i]);
//        }
//        file1InputStream.close();
    }
}
