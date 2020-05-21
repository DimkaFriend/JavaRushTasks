package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
    static
    {
        try {
            firstFileName =reader.readLine();
            secondFileName=reader.readLine();
        }catch (IOException e){}
    }

    public static void main(String[] args) throws InterruptedException,IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException,IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface
    {
        String FileName;
        String FileContent = "";

        @Override
        public void setFileName(String fullFileName) {

            FileName = fullFileName;

        }

        @Override
        public String getFileContent() throws IOException {


            return this.FileContent;
        }

        @Override
        public void run() {
            try(BufferedReader reader = new BufferedReader(new FileReader(new File(FileName)))) {
                String str;
                while ((str=reader.readLine())!=null){
                    FileContent+=str+" ";
                }
                reader.close();

            }catch (FileNotFoundException e){}
            catch (IOException e){}

        }
    }
}
