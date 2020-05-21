package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Отслеживаем изменения

/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1916/file1.txt
/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1916/file2.txt
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();//"/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1916/file1.txt";
        String file2 = bufferedReader.readLine();//"/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1916/file2.txt";
        bufferedReader.close();
        List<String> file1String;
        List<String> file2String;
        try(BufferedReader fr1 = new BufferedReader(new FileReader(file1));
            BufferedReader fr2 = new BufferedReader(new FileReader(file2));)
        {

            file1String = getStringMass(fr1);
            file2String = getStringMass(fr2);
        }

        while(true)
        {
            if(file1String.isEmpty())
            {
                for(String s:file2String)
                {
                    lines.add( new LineItem(Type.ADDED,s));
                }
                break;
            }
            if(file2String.isEmpty())
            {
                for(String s:file1String)
                {
                    lines.add( new LineItem(Type.REMOVED,s));
                }
                break;
            }
            if(file1String.get(0).equals(file2String.get(0)))
            {
                lines.add(new LineItem(Type.SAME,file1String.get(0)));
                file1String.remove(0);
                file2String.remove(0);
            }else
            {
                if(file1String.get(0).equals(file2String.get(1)))
                {
                    lines.add(new LineItem(Type.ADDED,file2String.get(0)));
                    file2String.remove(0);
                }else
                {
                    if(file1String.get(1).equals(file2String.get(0)))
                    {
                        lines.add(new LineItem(Type.REMOVED,file1String.get(0)));
                        file1String.remove(0);
                    }
                }
            }
        }


        for(LineItem obj: lines)
        {
            System.out.println(obj.type+" "+obj.line);
        }
        System.out.println(lines.size());


    }

    public static  List<String> getStringMass(BufferedReader fr) throws IOException {
        List<String> strings = new ArrayList<>();
        while (fr.ready())
        {
            strings.add(fr.readLine());
        }

        return strings;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
