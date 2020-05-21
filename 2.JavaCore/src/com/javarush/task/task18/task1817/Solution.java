package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //C:/Users/Dimka/Documents/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task17/task1721/File2.txt

        FileInputStream stream = new FileInputStream(args[0]);
        int count = stream.available();
        int space = 0;
        while (stream.available()>0)
        {
            if(' '==(char)stream.read())
            {
                space++;
            }


        }

        stream.close();

        System.out.printf("%.2f",((float)space/count)*100);


    }
}
