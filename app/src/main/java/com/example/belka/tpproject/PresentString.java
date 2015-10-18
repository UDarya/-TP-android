package com.example.belka.tpproject;

import android.util.Log;

/**
 * Created by belka on 16.10.15.
 */
public class PresentString {
    public static String present(int number) {
        Log.d("CREATE", Integer.toString(number));
        int counter = 1, i = 0;
        int di = 0, ptr = number;
        int part_number, pref = 0;
        while (ptr / 10 != 0) {
            ptr /= 10;
            ++counter;
        }
        Log.d("CREATE counter", Integer.toString(counter));
        String array = null;

        String[] numbers= {
                "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять",
                "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать",
                "0", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто",
                "0", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот",
                "0", "тысяча"
        };
//        String []decades = {"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемдесят", "девяносто"};
//        String[] hundreds = {"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот", "тысяча"};

        int[] parts = new int[counter];

        if (number <= 20) {
            array = numbers[number - 1];
        } else {
            di = counter - 1;
            for (int j = 0; j < counter; ++j) {
                parts[j] = (int) ((number - pref) / Math.pow(10, di));
                Log.d("CREATE parts = ", Integer.toString(parts[j]) );
                pref += parts[j] * Math.pow(10, (di));
                --di;
            }
            int dec = 10 * counter;
//            Log.d("CREATE dec = ", Integer.toString(dec));
            for (int n = 0; n < counter; ++n) {
                Log.d("CREATE dec = ", Integer.toString(dec));
                if (array != null && parts[n] != 0) {
                    array += numbers[parts[n] + dec - 1];
                    array += ' ';
                } else if (parts[n] != 0) {
                    array = numbers[parts[n] + dec - 1];
                    array += ' ';
                }
                Log.d("CREATE arr = ", array);
                dec = dec - 20;
                if (dec < 0) {
                    dec = 0;
                }
            }
        }
        Log.d("CREATE", array);
        return array;
    }
}