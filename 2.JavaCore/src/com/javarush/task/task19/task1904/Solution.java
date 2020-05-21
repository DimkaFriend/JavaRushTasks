package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if (fileScanner.hasNext()) {
                String s = fileScanner.nextLine();
                String[] parts = s.split(" ");

                String firstName = parts[1];
                String middleName = parts[2];
                String lastName = parts[0];

                Calendar calendar = new GregorianCalendar(Integer.parseInt(parts[5]),
                        Integer.parseInt(parts[4])-1,
                        Integer.parseInt(parts[3]));

                person = new Person(firstName, middleName, lastName, calendar.getTime());
            }
            return person;

//            String[] person=this.fileScanner.nextLine().split(" ");
//            String s = person[3]+"/"+person[4]+"/"+person[5];
//
//            return  new  Person(person[1],person[2],person[0],new Date(Integer.parseInt(person[5]),Integer.parseInt(person[4]),Integer.parseInt(person[3])));
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
