package com.javarush.task.task17.task1710;


import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static String parametr="-c Миронов м 15/04/1990";
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IllegalArgumentException{
        switch(args[0])
        {
            case "-c":
                {
                    switch(args[2]) {
                        case "м":{
                            allPeople.add(allPeople.size(),Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3], new ParsePosition(0))));
                            System.out.println(allPeople.size()-1);};
                            break;
                        case "ж": {
                            allPeople.add(allPeople.size(), Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3], new ParsePosition(0))));
                            System.out.println(allPeople.size()-1);};
                            break;
                        default: System.out.println( new IllegalArgumentException("error").getMessage());
                    }
                };break;

            case "-u":
                {
                    allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                    switch(args[3]) {
                        case "м":
                            allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                            break;
                        case "ж":
                            allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                            break;
                        default:
                            System.out.println(new IllegalArgumentException("error").getMessage());
                    }
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate( new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4], new ParsePosition(0)));
                };break;
            case "-d":
                {
                    allPeople.get(Integer.parseInt(args[1])).setName(null);
                    allPeople.get(Integer.parseInt(args[1])).setSex(null);
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                };break;
            case "-i":
                {

                    System.out.println( allPeople.get(Integer.parseInt(args[1])).getName()+" "+
                            (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE ? "м" : "ж")  +" "+
                            new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));

                };break;

        }
    }
}
