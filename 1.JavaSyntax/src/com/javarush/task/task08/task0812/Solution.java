package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> mass = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scan = new Scanner(System.in);
        int k=1,l=0;
        for (int i = 0; i < 10; i++) {
            mass.add(Integer.parseInt(reader.readLine()));

        }
        for (int i = 0; i < 10; i++)
        {
            if(i!=9){
            if(mass.get(i)==mass.get(i+1))
            {
                k++;
            }else
                {
                    if(l<k)
                    {
                        l=k;
                        k=1;
                    }
                    k=1;
                }
            }else
                {
                    if(l<k)
                    {
                        l=k;
                        k=1;
                    }
                }
        }

        System.out.print(l);
    }
}
