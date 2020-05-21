package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл

 /\d{0,}$/i

 /home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/file.txt.part
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Set<String> set = new TreeSet<>((o1, o2) -> {
                int first = Integer.parseInt(o1.substring(o1.lastIndexOf(".part") + 5));
                int second = Integer.parseInt(o2.substring(o1.lastIndexOf(".part") + 5));
                return first - second;
            });
            String fileName;

            while (!(fileName = reader.readLine()).equals("end")) {
                set.add(fileName);
            }

            String outputFile = ((TreeSet<String>) set).first();
            try (FileOutputStream fos = new FileOutputStream(outputFile.substring(0, outputFile.lastIndexOf(".part")))) {
                for (String file : set) {
                    try (FileInputStream fis = new FileInputStream(file)) {
                        byte[] bytes = new byte[fis.available()];
                        fis.read(bytes);
                        fos.write(bytes);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        ArrayList<String> filenames = new ArrayList<>();
//        String filename;
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while(!(filename =bufferedReader.readLine()).equals("end"))
//        {
//
//            filenames.add(filename);
//        }
//        bufferedReader.close();
//
////        ArrayList<String> filenames = new ArrayList<>();
////        filenames.add("/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/file.txt.part2");
////        filenames.add("/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/file.txt.part1");
////        filenames.add("/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/file.txt.part3");
////        filenames.add("/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/file.txt.part5");
////        filenames.add("/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/file.txt.part4");
////        filenames.add("/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/file.txt.part6");
//        Collections.sort(filenames);
//
//
//        OutputStream f = new FileOutputStream("/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1825/file.txt");//filenames[0].split(".")[0]+"."+ filenames[0].split(".")[1]
//        for(String file: filenames)
//            {
//            InputStream fBuff = new FileInputStream(file);
//            while(fBuff.available()>0)
//            {
//                byte[] buffer = new byte[fBuff.available()];
//                fBuff.read(buffer);
//                f.write(buffer);
//            }
//            f.write("\n".getBytes());
//            fBuff.close();
//            f.close();
//        }

    }
}
