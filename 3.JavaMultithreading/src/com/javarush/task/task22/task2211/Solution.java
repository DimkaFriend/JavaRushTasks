package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        Charset Windows1251 = Charset.forName("Windows-1251");
        Charset utf8 =Charset.forName("UTF-8");

        System.out.println(args[0]);
        FileReader bufferedReader = new FileReader(args[0]);
        BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(args[1]));





        while (bufferedReader.ready())
        {
            int b = bufferedReader.read();

            bufferedWriter.write(b);


        }


        bufferedReader.close();

    }
}
