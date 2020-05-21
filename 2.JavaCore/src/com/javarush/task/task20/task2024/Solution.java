package com.javarush.task.task20.task2024;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

//    protected void writeObject(ObjectOutputStream outputStream) throws IOException {
//
//        outputStream.writeObject(this.edges.size());
//        for(Solution s : edges)
//        {
//            outputStream.writeObject(s);
//        }
//    }
//
//    protected void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
//
//        int size =(int)  inputStream.readObject();
//        this.edges.clear();
//        for(int i =0 ; i < size; i++)
//        {
//            System.out.println((Solution) inputStream.readObject());
//            this.edges.add( ((Solution) inputStream.readObject()).edges.get(i));
//        }
//    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
//        File file = File.createTempFile("task.task20.task2024","txt");
//        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);
//
//        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
//        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);
//
//        Solution s1 = new Solution();
//        s1.node =1;
//        Solution s2 = new Solution();
//        s2.node =2;
//        Solution s3 = new Solution();
//        s3.node =3;
//        Solution s4 = new Solution();
//        s4.node =4;
//        Solution s5 = new Solution();
//        s5.node =5;
//        Solution s6 = new Solution();
//        s6.node =6;
//
//        s1.edges.add(s2);
//
//        for(Solution s : s1.edges)
//        {
//            System.out.println("56 "+s1.node);
//        }
//
//        s2.edges.add(s2);
//        s2.edges.add(s4);
//        s2.edges.add(s5);
//
//        s4.edges.add(s1);
//        s4.edges.add(s5);
//
//        s5.edges.add(s4);
//
//        s6.edges.add(s3);
//
//        s2.writeObject(oos);
//
//        s2.readObject(ois);
//
//        for(Solution s : s2.edges)
//        {
//            System.out.println("77 "+s2.node);
//        }
//
//        oos.flush();
//        oos.close();
//        ois.close();

    }
}
