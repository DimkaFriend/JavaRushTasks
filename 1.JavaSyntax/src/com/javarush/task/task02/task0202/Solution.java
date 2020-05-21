package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/
public class Solution {
    public static void main(String[] args) {

        Person person =new Person();
        person =new Person("Dima",1,2,3);
        person =new Person("Dima",1,2,3);
        person =new Person("Dima",1,2,3);
        person =new Person("Dima",1,2,3);
        person =new Person("Dima",1,2,3);

    }

    public static class Person {

        String name;
        int age;
        int weight;
        int money;

        public Person()
        {
        }

        public Person(String name,
                      int age,
                      int weight,
                      int money)
        {
            this.name=name;
            this.age=age;
            this.weight=weight;
            this.money=money;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public int getMoney() {
            return money;
        }


    }
}
