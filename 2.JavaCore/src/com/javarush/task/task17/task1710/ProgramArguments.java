package com.javarush.task.task17.task1710;

import com.javarush.task.task17.task1711.Sex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ProgramArguments {
    private static ProgramArguments instance = null;

    private static ArrayList<String> programArguments = null;
    private static String key =null;
    private static ArrayList<String> id = new ArrayList<String>();
    private static ArrayList<String> name =  new ArrayList<String>();
    private static ArrayList<String> sex = new ArrayList<String>();
    private static ArrayList<String> birthDate = new ArrayList<String>();

    private static Iterator<String> iteratorId;
    private static Iterator<String> iteratorName;
    private static Iterator<String> iteratorSex;
    private static Iterator<String> iteratorBirthDate;



    private  ProgramArguments(String[] args) throws NumberFormatException
    {
        switch (args[0])
        {
            case "-c" :
                {
                    if(args.length%3 == 1)
                    {


                        for(int i = 1; i< args.length; i+=3)
                        {
                            if(!args[i].equals(null)&!args[i+1].equals(null)&!args[i+2].equals(null))
                            {
                                this.key = args[0];
                                this.name.add(args[i]);
                                if(args[i+1].equals(Sex.MALE)){this.sex.add("м");}else{this.sex.add("ж");}
                                this.birthDate.add(args[i+2]);
                            }

                        }
                    }

                };break;
            case "-u" :
                {
                    if(args.length%4==1)
                    {


                        for(int i = 1; i< args.length; i=+4)
                        {
                            if(!args[i+1].equals(null)&!args[i+2].equals(null)&&!args[i+3].equals(null))
                            {
                                this.key = args[0];
                                this.id.add(args[i]);
                                this.name.add(args[i+1]);
                                if(args[i+1].equals(Sex.MALE)){this.sex.add("м");}else{this.sex.add("ж");}
                                this.birthDate.add(args[i+3]);
                            }

                        }

                    }
                };
            case "-d" :
                {


                    for(int i = 1; i< args.length; i++)
                    {
                        this.id.add(args[i]);
                    }
                };break;
            case "-i" :
                {


                    for(int i = 1; i< args.length; i++)
                    {
                        this.id.add(args[i]);
                    }
                };break;
            default: new IllegalAccessException("error");
        }

    }

    public static ProgramArguments initialization(String[] args)
    {

            if (instance == null)
            {
                instance = new ProgramArguments(args);
            }
            return instance;

    }

    private static String getKey()
    {
        return instance.key;
    }

    private static String[] getObjectCreationParameters()
    {
        String[]s = null;


        iteratorName = name.iterator();
        iteratorSex =sex.iterator();
        iteratorBirthDate = birthDate.iterator();

        if(iteratorName.hasNext()&iteratorSex.hasNext()&iteratorBirthDate.hasNext()) {
            String s1 =  iteratorName.next();
            String s2 = iteratorSex.next();
            String s3 = iteratorBirthDate.next();
            s = new String[]{s1, s2, s3};
        }
        return s;
    }

    private static String[] getObjectUpdationParameters()
    {
        iteratorId = id.iterator();
        iteratorName = name.iterator();
        iteratorSex =sex.iterator();
        iteratorBirthDate = birthDate.iterator();
        String[]s = null;
        if(iteratorId.hasNext()&iteratorName.hasNext()&iteratorSex.hasNext()&iteratorBirthDate.hasNext())

            s = new String[]{iteratorId.next(),iteratorName.next(),iteratorSex.next(),iteratorBirthDate.next()};
        return s;
    }

    private static String[] getIdOperateObject()
    {
        iteratorId = id.iterator();
        String[]s = null;
        if(iteratorId.hasNext())
            s = new String[]{iteratorId.next()};
        return s;
    }

//    public static boolean hasNext(Iterator<String>...arg)
//    {
//        switch (getKey())
//        {
//            case "-c":{return arg.hasNext()&arg.hasNext()&arg.hasNext();}
//            case "-u":{}
//            case "-d":{}
//            case "-i":{}
//
//            default:  {return false;}
//        }
//    }

    public static String[] getNextParametersForObject()
    {

        switch (getKey())
        {
            case "-c":{return getObjectCreationParameters();}
            case "-u":{return getObjectUpdationParameters();}
            case "-d":{return getIdOperateObject();}
            case "-i":{return getIdOperateObject();}

            default:  {return null;}
        }


    }
}
