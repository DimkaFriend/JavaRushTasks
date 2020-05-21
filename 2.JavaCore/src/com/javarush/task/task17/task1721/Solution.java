package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

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

    public static void main(String[] args) throws CorruptedDataException {
        Solution sol = new Solution();
        readFile(firstFileName);
        readFile(secondFileName);
        sol.joinData();

    }

    public static void readFile(String fileName)
    {
        if(allLines.size()==0)
        {
            try(BufferedReader reader = new BufferedReader(new FileReader(new File(firstFileName)))) {

                String str;
                while ((str=reader.readLine())!=null){
                    allLines.add(str);

                }

                reader.close();

            }catch (FileNotFoundException e){}
            catch (IOException e){}
        }else
            {
                try(BufferedReader reader = new BufferedReader(new FileReader(new File(secondFileName)))) {

                    String str;
                    while ((str=reader.readLine())!=null){
                        forRemoveLines.add(str);

                    }

                    reader.close();

                }catch (FileNotFoundException e){}
                catch (IOException e){}
            }

    }

    public void joinData() throws CorruptedDataException {
        for(int i = 0; i < forRemoveLines.size(); i++)
        {
            if(!allLines.remove(forRemoveLines.get(i))&!allLines.isEmpty())
            {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }

    }
}
