package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> mass = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            mass.add(reader.readLine());

            if(i!=0)
            {
                if(mass.get(i).length()<mass.get(i-1).length())
                {
                    System.out.print(i);break;
                }
            }
        }


    }
}

