package com.javarush.task.task20.task2007;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Как сериализовать JavaRush?
*/
public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(File.createTempFile("task20.task2007", null)));
        JavaRush jr = new JavaRush();
        jr.users.add(new User());
        objectOutputStream.writeObject(jr);
        objectOutputStream.close();
    }
}
