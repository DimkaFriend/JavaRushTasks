package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // C:\Users\Dimka\Documents\JavaRushHomeWork\JavaRushHomeWork_2_0\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1801\File1.txt
        // C:\Users\Dimka\Documents\JavaRushHomeWork\JavaRushHomeWork_2_0\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1801\File2.txt
        // C:\Users\Dimka\Documents\JavaRushHomeWork\JavaRushHomeWork_2_0\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1801\File3.txt
        FileInputStream file1InputStream = new  FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());// C:\Users\Dimka\Documents\JavaRushHomeWork\JavaRushHomeWork_2_0\JavaRushTasks\2.JavaCore\src\com\javarush\task\task18\task1801\File1.txt
        FileOutputStream file2InputStream = new  FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream file3InputStream = new  FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int size = file1InputStream.available();
        int i=0;
        if(size%2==1)
        {

            while(file1InputStream.available()>0)
            {
                if(i<((size/2)+1))
                {
                    file2InputStream.write(file1InputStream.read());
                    i++;
                }else
                    {
                        file3InputStream.write(file1InputStream.read());
                        i++;
                    }

            }
        }else
            {
                while(file1InputStream.available()>0)
                {
                    if(i<(size/2))
                    {
                        file2InputStream.write(file1InputStream.read());
                        i++;
                    }else
                    {
                        file3InputStream.write(file1InputStream.read());
                        i++;
                    }
                }
            }

        //закрыли  потоки
        file1InputStream.close();
        file2InputStream.close();
        file3InputStream.close();
    }
}
