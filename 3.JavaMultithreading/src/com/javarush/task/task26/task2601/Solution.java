package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
https://ru.wikipedia.org/wiki/%D0%9C%D0%B5%D0%B4%D0%B8%D0%B0%D0%BD%D0%B0_(%D1%81%D1%82%D0%B0%D1%82%D0%B8%D1%81%D1%82%D0%B8%D0%BA%D0%B0)
Размер массива может быть четный или не четный
Arrays.sort - отсортировал массив
Нашел медиану
Collections.sort - отсортировал массив еще раз, создав компаратор:
есть объекты меньше медианы и больше медианы
 if((o1-median)<(median-o2)) сравниваемые  числа всегда обного знака.
*/
public class Solution {




    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[]{1,3,5,7,9,9,11})));

        System.out.println(Arrays.toString(sort(new Integer[]{13, 8, 15,15, 5, 17})));
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        int median;
        Arrays.sort(array);
        if(array.length%2==0)
        {

            median = (array[array.length/2 - 1] + array[array.length/2])/2;
            Collections.sort(Arrays.asList(array), (o1, o2) -> {
                if((o1-median)<(median-o2))
                {
                    return -1;
                }else
                {
                    return 1;
                }
            });

        }else
            {

                median = array[array.length/2];

                Collections.sort(Arrays.asList(array), (o1, o2) -> {
                    if((o1-median)<(median-o2))
                    {
                        return -1;
                    }else
                        {
                            return 1;
                        }

                });
            }
        return array;
    }
}
