package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> mass = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scan = new Scanner(System.in);
        int min = 0, max = 0;
        for (int i = 0; i < 10; i++) {
            mass.add(reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                if ((mass.get(i).length() <= mass.get(i + 1).length())) {
                    min = i;
                    max = i + 1;
                } else {
                    max = i;
                    min = i + 1;
                }
            } else {
                if (mass.get(i).length() < mass.get(min).length()) {
                    min = i;
                } else {
                    if (mass.get(i).length() > mass.get(max).length()) {
                        max = i;
                    }
                }
            }
        }
        if (min < max)
            System.out.println(mass.get(min));
        else
            System.out.println(mass.get(max));
    }
}
