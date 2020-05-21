package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try(BufferedReader bf = new BufferedReader(new FileReader(args[0])))
        {
           while (bf.ready())
           {
               String buff = bf.readLine();
               String name ="";
               for(int i = 0; i<(buff.split(" ").length-3);i++)
               {
                   name+= buff.split(" ")[i]+ " ";
               }
               name = name.trim();

               Person p = new Person(name,
                       new Date(Integer.parseInt(buff.split(" ")[buff.split(" ").length-1])+"/"+
                       Integer.parseInt(buff.split(" ")[buff.split(" ").length-2])+"/"+
                       Integer.parseInt(buff.split(" ")[buff.split(" ").length-3])));
               PEOPLE.add(p);
           }
        }

//        for(Person p : PEOPLE)
//        {
//            System.out.println(p.getBirthDate().toString());
//        }
    }
}
