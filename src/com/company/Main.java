package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
        // - Írasd ki a konzolra a `numbers` tömb összes elemének összegét

        int[] numbers = {3, 4, 5, 6, 7};
        //System.out.println(numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]);

        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[4, 5, 6, 7]`
        // - Fordítsd meg az elemek sorrendjét a `numbers` tömbben
        // - Írasd ki a konzolra a `numbers` tömb megfordított sorrendű elemeit

        for (int i = numbers.length - 1; i >= 0; i--) {
            //           System.out.println(numbers[i]);
        }
        greetFunction();
        System.out.println(baseNum());
    }

    public static void greetFunction() {
        System.out.println("Hello");
    }

    public static int baseNum() {
        int a = 123;
        int multiply = a * 2;
        return multiply;

    }

}
