package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.IOException;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        File file= null;


        System.out.println(FileUtils.isExist(new File(args[0],args[1])));
        if(!FileUtils.isExist(new File(args[0],args[1])))
        {
            file = new File(args[0],args[1]);
            file.createNewFile();
        }
        if(!FileUtils.isExist(new File(file.getParent()+"/allFilesContent.txt")))
        {
            FileUtils.renameFile(file, new File(file.getParent()+"/allFilesContent.txt"));
        }



//        if(!FileUtils.isExist(new File(args[0],args[1])))
//        {
//            file = new File(args[0],args[1]);
//
//            file.createNewFile();
//            File fileDest = new File("allFilesContent.txt");
//
//            if(!FileUtils.isExist(new File(file.getParent(),"allFilesContent.txt")))
//            {
//                System.out.println(file.getParent()+" "+file.getName());
//                FileUtils.renameFile(file,fileDest);
//                System.out.println(file.getParent()+" "+file.getName());
//            }
//        }


    }
}
