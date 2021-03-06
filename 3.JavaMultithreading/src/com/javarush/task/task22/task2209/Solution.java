package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Составить цепочку слов
/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/dubl.txt

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(new File(s1)));
        String s;

        while ((s = reader.readLine()) != null) {
            list.addAll(Arrays.asList(s.split(" ")));
        }
        String[] words = new String[list.size()];
        words = list.toArray(words);


        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, words);
        StringBuilder sb = new StringBuilder();
        if (strings.size() == 0) {
            return new StringBuilder();
        }

        sb.append(strings.get(0));
        strings.remove(0);

        while (strings.size() > 0) {
            for (int i = 0; i < strings.size(); i++) {
                String a = strings.get(i).toUpperCase().toLowerCase();
                String b = sb.toString().toUpperCase().toLowerCase();
                if (a.charAt(0) == b.charAt(sb.length() - 1)) { // в конец
                    sb.append(" ").append(strings.get(i));
                    strings.remove(i);
                    continue;
                }

                if (b.charAt(0) == a.charAt(a.length() - 1)) { //в начало
                    sb.insert(0, " ");
                    sb.insert(0, strings.get(i));
                    strings.remove(i);
                }
            }
        }
        return sb;
    }
}
