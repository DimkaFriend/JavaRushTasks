package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String str =reader.readLine();
            if(str==null){break;}
            else
                {
                    Movie movie = MovieFactory.getMovie(str);
                    if(movie==null){break;}
                    System.out.println(movie.getClass().getSimpleName());
                }
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) throws Exception {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();

            }else
                {
                    if ("cartoon".equals(key)) {
                        movie = new Cartoon();

                    }
                    else{
                        if ("thriller".equals(key)) {
                            movie = new Thriller();

                        }else return null;
                    }
                }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    public static class Cartoon extends Movie
    {}

    public static class Thriller extends Movie
    {}

}
