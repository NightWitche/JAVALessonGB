package org.example;

/*
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2*/

import java.util.Arrays;
import java.util.Random;
public class HW1 {
    public static void main(String args[]) {
        int i = new Random(0).nextInt(2000);
        int n = Integer.toBinaryString(i).length();


        int c = 0;
        for (int j = i; j<Short.MAX_VALUE;j++) {
            if (j % n == 0) c++;

        }
        int [] m1 = new int[c];
        c=0;
        for (int j = i; j<Short.MAX_VALUE;j++) {
            if (j % n == 0) m1[c++] = j;
        }


        int с = 0;
        for (int j =Short.MIN_VALUE; j>i;j++) {
            if (j % n != 0) c++;

        }
        int [] m2 = new int[c];
        c=0;
        for (int j =Short.MIN_VALUE; j>i;j++) {
            if (j % n != 0) m2[c++] = j;
        }

        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));


        System.out.println(i);
        System.out.println(n);






    }
}
