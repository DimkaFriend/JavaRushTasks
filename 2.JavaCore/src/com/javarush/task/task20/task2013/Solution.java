package com.javarush.task.task20.task2013;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements  Externalizable{
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(){}

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(mother);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

                firstName =(String) in.readObject();
                lastName =(String) in.readObject();
                father = (Person)in.readObject();
                mother = (Person)in.readObject();
                age = in.readInt();
                children = (List)in.readObject();


        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Person grandmotherMom = new Person("grandmother","Mom",51);
        Person grandfatherMom = new Person("grandfather","Mom",52);
        Person mama = new Person("Mam", "mama",30);
        mama.setFather(grandfatherMom);
        mama.setMother(grandmotherMom);


        Person grandmotherDad = new Person("grandmother","Dad",53);
        Person grandfatherDad = new Person("grandfather","Dad",54);
        Person dad = new Person("Dad", "Dad",31);
        dad.setFather(grandfatherDad);
        dad.setMother(grandmotherDad);

        Person son = new Person("Son", "Son",5);
        son.setFather(dad);
        son.setMother(mama);

        Person daughter = new Person("Daughter","Daughter",8);
        daughter.setFather(dad);
        daughter.setMother(mama);

        mama.setChildren(Arrays.asList(son, daughter));
        dad.setChildren(Arrays.asList(son, daughter));

        Person person = new Person("3", "3", 25);
        person.setFather(new Person("1", "1", 45));
        person.setMother(new Person("2", "2", 43));
        person.setChildren(Arrays.asList(new Person("4", "4", 2), new Person("5", "5", 1)));

        File file = File.createTempFile("task.task20.task2013",null);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        son.writeExternal(outputStream);
        mama.writeExternal(outputStream);
        outputStream.close();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        Person oldSon =son;
        mama.readExternal(inputStream);
        son.readExternal(inputStream);

        inputStream.close();

        System.out.println(oldSon.equals(son));

    }
}
