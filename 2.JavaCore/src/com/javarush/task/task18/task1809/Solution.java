package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import javafx.print.Collation;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // C:\Users\Dimka\Documents\JavaRushHomeWork\JavaRushHomeWork_2_0\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1801\File1.txt
        // C:\Users\Dimka\Documents\JavaRushHomeWork\JavaRushHomeWork_2_0\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1801\File2out.txt
        FileInputStream file1InputStream = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream file2InputStream = new  FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());


        ArrayList<Byte> b = new ArrayList<>(file1InputStream.available());
        while(file1InputStream.available()>0)
        {
            b.add((byte)file1InputStream.read());
        }
        Collections.reverse(b);

        for(int i = 0 ; i < b.size() ; i ++)
        file2InputStream.write(b.get(i));

        file1InputStream.close();
        file2InputStream.close();
    }
}
