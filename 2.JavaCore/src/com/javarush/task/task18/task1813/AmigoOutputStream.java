package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";

    private FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = fileOutputStream;
    }


    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }


    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }


    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }


    public void flush() throws IOException {
        fileOutputStream.flush();
    }


    public void close() throws IOException {
        //super.flush();
        //this.flush();
        fileOutputStream.flush();
        String and = "JavaRush © All rights reserved.";

        fileOutputStream.write(and.getBytes());
        fileOutputStream.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

//    public static void main(String[] args) throws FileNotFoundException {
//        AmigoOutputStream s =
//                new AmigoOutputStream(new FileOutputStream(fileName));
//        try {
//            s.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


}
