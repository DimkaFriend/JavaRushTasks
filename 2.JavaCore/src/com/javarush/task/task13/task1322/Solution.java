package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       SimpleObject<String> stringObject = new StringObject<Object>();
    }



    static class StringObject<T> implements SimpleObject<String> {
        @Override
        public String getInstance() {
            return null;
        }
    }

    interface SimpleObject<T>
    {
        T getInstance();



    }

}
