package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.awt.event.ItemListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        InputStream inStream = new FileInputStream(s);
        ArrayList<Integer> ch= new ArrayList<>();
        String t="";
        while (inStream.available() > 0)
        {

            int data = inStream.read();

            if(((char)data!='\n'))
            {
                t+=(char)data;

            }else{
                if(Integer.parseInt(t.trim())%2==0){

                ch.add(Integer.parseInt(t.trim()));
                }

                t="";
            }


        }
        if((t!="\n")&&(t!=""))
        {
            if(Integer.parseInt(t.trim())%2==0){

                ch.add(Integer.parseInt(t.trim()));
            }
        }

        inStream.close();
        reader.close();

       Collections.sort(ch);

        for(int i: ch)
        {
            System.out.println(i);
        }
    }

}
