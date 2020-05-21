package com.javarush.task.task20.task2017;

import java.io.*;

/* 
Десериализация
*/
public class Solution {
    public  A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException {

        A a = null;
        try {
            a = (A) objectStream.readObject();
        } catch (NotSerializableException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return a;



    }

    public  class A implements Serializable {
    }

    public  class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) throws  IOException, ClassNotFoundException {
//        File file = File.createTempFile("task.task20.task2017",null);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//        B b = new B();
//        objectOutputStream.writeObject(b);
//        System.out.println(getOriginalObject(objectInputStream) instanceof A);
//        objectOutputStream.flush();
//        objectOutputStream.close();
//        objectInputStream.close();
    }
}
