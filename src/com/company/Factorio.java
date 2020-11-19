package com.company;

public class Factorio {
    public static void main (String[] args) {
        factorio(4);

    }

    public static void factorio(int number) {

        System.out.print(number + " = ");
        for (int j = number; j > 1; j--) {
            System.out.print(j + "*");
        }
        System.out.print(1);
    }
}
