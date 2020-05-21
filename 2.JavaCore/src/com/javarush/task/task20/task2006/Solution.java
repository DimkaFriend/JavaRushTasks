package com.javarush.task.task20.task2006;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Как сериализовать?
*/
public class Solution {
    public static class Human implements Serializable {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
    }

    public static void main(String[] args)throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(File.createTempFile("object.txt", null)));
        Human h = new Human();
        h.name="Public Name";
        h.assets.add(new Asset("Asset Name"));
        objectOutputStream.writeObject(h);
        objectOutputStream.close();

    }
}
