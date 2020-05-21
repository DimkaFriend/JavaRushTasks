package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
C:/tmp/first.txt
C:/tmp/name.1.part3.txt
C:/tmp/file.txt.exe
*/

public class TxtInputStream extends FileInputStream {


    public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException {
        super(fileName);
        if(!fileName.substring((fileName.length()-4),fileName.length()).equals(".txt"))
        {

            try {
                super.close();
                throw new UnsupportedFileNameException();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedFileNameException {
       // new TxtInputStream("C:/tmp/name.1.part3.txt");
    }
}

