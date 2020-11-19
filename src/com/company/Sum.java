package com.company;

public class Sum {

    public static void main (String[] args) {
        sum(55);

    }

    public static void sum (int a) {
        int summa =0;
        for (int i = 0; i < a; i++) {
            summa = summa + i;
        }
        System.out.println(summa);

        return;

    }
}
