package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        switch (args[0])
        {
            case"-e":crypto(args[1],args[2]);break;
            case"-d":decrypto(args[1],args[2]);break;
        }
    }

    public static void crypto(String fileName, String fileOutputName) throws FileNotFoundException {
        InputStream fileNameForCrypto = new FileInputStream(fileName);
        OutputStream fileOutputNameToCrypto = new FileOutputStream(fileOutputName);

        byte[] buffer = new byte[1000];

        try
        {
            while (fileNameForCrypto.available()>0)
            {
                fileOutputNameToCrypto.write(fileNameForCrypto.read()+1);
//                int count = fileNameForCrypto.read(buffer);
//                fileOutputNameToCrypto.write(buffer,0,count);
            }
            fileNameForCrypto.close();
            fileOutputNameToCrypto.close();
        }catch(IOException e)
        {

        }
    }

    public static void decrypto(String fileName, String fileOutputName) throws FileNotFoundException {
        InputStream fileNameForDeCrypto = new FileInputStream(fileName);
        OutputStream fileOutputNameToDeCrypto = new FileOutputStream(fileOutputName);

        byte[] buffer = new byte[1000];

        try
        {
            while (fileNameForDeCrypto.available()>0)
            {
                fileOutputNameToDeCrypto.write(fileNameForDeCrypto.read()-1);
//                int count = fileNameForDeCrypto.read(buffer);
//                fileOutputNameToDeCrypto.write(buffer,0,count);
            }
            fileNameForDeCrypto.close();
            fileOutputNameToDeCrypto.close();
        }catch(IOException e)
        {

        }
    }

}
