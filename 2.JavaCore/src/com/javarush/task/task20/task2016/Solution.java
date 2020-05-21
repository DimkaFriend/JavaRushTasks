package com.javarush.task.task20.task2016;

import java.io.*;

/*
Минимум изменений
*/
public class Solution {
    public  class A implements Serializable {
        String name = "A";

        public A(String name) {
            this.name += name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public  class B extends A {
        String name = "B";

        public B(String name) {
            super(name);
            this.name += name;
        }
    }

    public  class C extends B {
        String name = "C";

        public C(String name) {
            super(name);
            this.name = name;
        }
    }

    public static void main(String[] args)throws IOException, ClassNotFoundException {
        //для проверки решения
//        File file = File.createTempFile("task.task20.task2016",null);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        C c = new C("a");
//        B b = new B("b");
//        A a = new A("a");
//        objectOutputStream.writeObject(a);
//        objectOutputStream.writeObject(b);
//        objectOutputStream.writeObject(c);
//        objectOutputStream.writeObject(a);
//        objectOutputStream.writeObject(b);
//        objectOutputStream.writeObject(c);
//        objectOutputStream.flush();
//        objectOutputStream.close();
//        objectInputStream.close();

    }
}
