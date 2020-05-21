package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fis = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        String result;
        while (true)
        {
            result= fis.readLine();
            try {
                if(Integer.parseInt(args[0]) ==Integer.parseInt(result.split(" ")[0]))
                {
                    System.out.println(result);
                    fis.close();
                    return;
                }
            }catch (NullPointerException e)
            {
                fis.close();
                return;
            }


        }


    }
}
