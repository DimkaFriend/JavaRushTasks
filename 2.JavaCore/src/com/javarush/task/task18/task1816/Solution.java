package com.javarush.task.task18.task1816;

/* 
Английские буквы
System.out.println((int)'a');97
System.out.println((int)'z');122
System.out.println((int)'A');65
System.out.println((int)'Z');90
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        //C:/Users/Dimka/Documents/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task17/task1721/File2.txt

        int count=0;

            FileInputStream stream = new FileInputStream(args[0]);

            while (stream.available()>0)
            {
                int j = stream.read();
                if(0<=(j-65))
                {
                    if((65 <= j)&&(j <= 90))
                    {
                        count++;
                    }
                    if((97 <= j)&&(j <= 122))
                    {
                        count++;
                    }
                }
            }
        stream.close();
        System.out.println(count);


    }
}
