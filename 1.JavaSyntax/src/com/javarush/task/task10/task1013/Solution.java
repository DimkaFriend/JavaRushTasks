package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {


            private String name;
        private Boolean sex;
        private Integer age;
        private Human father;
        private Human mother;
        private ArrayList<Human> children = new ArrayList<Human>();

            public Human( String name, Boolean sex, Integer age)
            {

            }
            public Human( String name, Boolean sex, Integer age, Human ... children)
            {

            }
            public Human( String name, Boolean sex, Integer age, Human mother, Human father)
            {

            }

            public Human( String name, Boolean sex, Integer age,Human mother, Human father,Human ... children)
            {

            }
            public Human( Human mother, Human father,Human ... children)
            {

            }
        public Human( String name)
        {

        }
        public Human(  Boolean sex)
        {

        }
        public Human( Integer age)
        {

        }
        public Human( String name, Boolean sex)
        {

        }
        public Human(  Boolean sex, Integer age)
        {

        }

    }
}
