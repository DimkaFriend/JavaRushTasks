package com.javarush.task.task20.task2009;

import java.io.*;

/*
Как сериализовать static?
*/
public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ClassWithStatic classWithStatic = new ClassWithStatic();
        classWithStatic.i=5;
        classWithStatic.j=6;
        System.out.println(ClassWithStatic.staticString+" "+classWithStatic.i+" "+classWithStatic.j);
        File file = File.createTempFile("task.task20.task2009",null);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(classWithStatic);
        objectOutputStream.close();
        classWithStatic.i=0;
        classWithStatic.j=0;
        System.out.println(ClassWithStatic.staticString+" "+classWithStatic.i+" "+classWithStatic.j);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        classWithStatic = (ClassWithStatic) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(ClassWithStatic.staticString+" "+classWithStatic.i+" "+classWithStatic.j);
    }
}
