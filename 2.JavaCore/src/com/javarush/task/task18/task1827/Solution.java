package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static String fileName;
    public static String productName;
    public static String price;
    public static String quantity;
    public static void main(String[] args) throws Exception {
        if(((args[1].getBytes().length>30)|(args[2].getBytes().length>8)|(args[3].getBytes().length>4)))
        {
           throw new IOException("Error");
        }

        if(((args[1].getBytes().length<30)|(args[2].getBytes().length<8)|(args[3].getBytes().length<4)))
        {
            productName = args[1];
            price = args[2];
            quantity = args[3];
            addSpaceToEnd();
        }

        if(productName==null&price==null&quantity==null)
        {
            productName = args[1];
            price = args[2];
            quantity = args[3];
        }
        fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        switch(args[0])
        {
            case"-c":insert();break;
        }
    }

    public static String generationID() throws IOException
    {
        FileInputStream buffFile = new FileInputStream(fileName);
        FileReader buffFile1 = new FileReader(fileName);
        File file = new File(fileName);

        byte[] buff = new byte[50];
        while(buffFile.available()>0)
        {
            buffFile.read(buff);
        }

        buffFile.close();
        int result = Integer.parseInt(new char[]{(char)buff[0], (char)buff[1], (char)buff[2], (char)buff[3], (char)buff[4], (char)buff[5], (char)buff[6], (char)buff[7]}.toString());
        return Integer.toString(result++);
    }

    public static void insert() throws IOException
    {
        OutputStream outFile = new FileOutputStream(fileName);
        String ID = generationID();
        outFile.write(13);
        outFile.write(10);
        outFile.write(ID.getBytes());
        outFile.write(productName.getBytes());
        outFile.write(price.getBytes());
        outFile.write(quantity.getBytes());

    }

    public static void addSpaceToEnd()
    {
        if(productName.getBytes().length<30)
        {
            for(int i = productName.getBytes().length-1; i <=30; i++)
            {
                productName+=" ";
            }
        }
        if(price.getBytes().length<30)
        {
            for(int i = price.getBytes().length-1; i <=8; i++)
            {
                price+=" ";
            }
        }
        if(quantity.getBytes().length<30)
        {
            for(int i = quantity.getBytes().length-1; i <=4; i++)
            {
                quantity+=" ";
            }
        }

    }
}
