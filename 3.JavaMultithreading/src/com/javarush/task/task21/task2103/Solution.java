package com.javarush.task.task21.task2103;

import java.util.ArrayList;

/*
Все гениальное - просто!
*/
public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        //return (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);//исходная
        //return (a && b && c && !d) || (!a && !b && c) || (c && d);//вариант 1
        //return (a && b && c && !d) || (!a && !b ) || (c && d);//вариант 2
        //return ((a && b && !d) && c) || ((!a || !b ||d )&& c );//вариант 3
        return c ;//вариант 4



    }

    public static void main(String[] args) {


        System.out.println(calculate(false, false, false, false));
        System.out.println(calculate(false, false, false,true));
        System.out.println(calculate(false, false,true, false));
        System.out.println(calculate(false, false,true,true));
        System.out.println(calculate(false,true, false, false));
        System.out.println(calculate(false,true, false,true));
        System.out.println(calculate(false,true,true, false));
        System.out.println(calculate(false,true,true,true));
        System.out.println(calculate(true, false, false, false));
        System.out.println(calculate(true, false, false,true));
        System.out.println(calculate(true, false,true, false));
        System.out.println(calculate(true, false,true,true));
        System.out.println(calculate(true,true, false, false));
        System.out.println(calculate(true,true, false,true));
        System.out.println(calculate(true,true,true, false));
        System.out.println(calculate(true,true,true,true));

//        int bytes = 2;
//        int nBits = bytes * 2;
//        int maxNumber = 1 << nBits; //this equals 2^nBits or in java: Math.pow(2,nbits)
//        ArrayList<String> binaries = new ArrayList<>();
//        for (int i = 0; i < maxNumber; i++) {
//            String binary = Integer.toBinaryString(i);
//            while (binary.length() != nBits) {
//                binary = "0" + binary;
//            }
//            binaries.add(binary);
//            System.out.println(binary);
//
//        }
//        //System.out.println(binaries+" "+binaries.size());
    }
}
