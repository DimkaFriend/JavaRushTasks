package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова

/home/dmitriy/Документы/JavaRushHomeWork/JavaRushHomeWork_2_0/JavaRushTasks/dubl.txt
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = bufferedReader.readLine();
        File file = new File(path);
        bufferedReader.close();
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String string = new String();
        while(bufferedReader.ready())
        {
            if(string.length()==0)
            {
                string+=bufferedReader.readLine();
            }
            string+=(" "+bufferedReader.readLine());

        }

        for(int i =0; i < string.split(" ").length;i++)
        {
            if((!string.split(" ")[i].equals(" "))&&(!string.split(" ")[i].equals("")))
            {
                StringBuilder stringBuilder = new StringBuilder(string.split(" ")[i]).reverse();

                for(int j =i; j < string.split(" ").length;j++)
                {
                    if(string.split(" ")[j].length()>1)
                    {
                        if(string.split(" ")[j].equals(stringBuilder.toString()))
                        {
                            Pair pair = new Pair();
                            pair.first= string.split(" ")[i];
                            pair.second = string.split(" ")[j];
                            if(!result.contains(pair))
                            {
                                result.add(pair);
                            }

                        }
                    } else
                    {
                        j++;

                        while (j<string.split(" ").length)
                        {
                            if(j<string.split(" ").length)
                            {
                                if(string.split(" ")[j].equals(stringBuilder.toString()))
                                {
                                    Pair pair = new Pair();
                                    pair.first= string.split(" ")[i];
                                    pair.second = string.split(" ")[j];
                                    if(!result.contains(pair))
                                    {
                                        result.add(pair);
                                    }

                                }
                                j++;
                            }else{return;}

                        }
                    }


                }
            }


        }
        bufferedReader.close();

        for(Pair pair:result)
        {
            System.out.println(pair.first+" "+pair.second);
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}

//        int positon =0;
//        while(stringBuilder.length()>0)
//        {
//            StringBuilder revers= new StringBuilder(stringBuilder.substring(0,stringBuilder.indexOf(" "))).reverse();
//
//            int positionRevers = stringBuilder.indexOf(revers.toString());
//
//            if(positionRevers>=0)
//            {
//
//                Pair pair = new Pair();
//                pair.first = stringBuilder.substring(0,stringBuilder.indexOf(" "));
//                pair.second = revers.toString();
//                if(!result.contains(pair))
//                {
//                    result.add(pair);
//                }
//                while(revers.length()>0)
//                {
//                    stringBuilder= stringBuilder.delete(positionRevers,positionRevers+revers.length()+1);
//                }
//
//                stringBuilder = stringBuilder.delete(0,stringBuilder.indexOf(" ")+1);//.delete(positionRevers,positionRevers+revers.length()+1)
//            }else
//                {
//                    stringBuilder = stringBuilder.delete(0,stringBuilder.indexOf(" ")+1);
//                }