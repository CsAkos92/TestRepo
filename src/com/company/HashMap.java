package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

class Hashmap {
    public static void main (String[] args) {
        HashMap<Integer, String> tomb = new HashMap<Integer, String>();
        tomb.put(97, "a");
        tomb.put(98, "b");
        tomb.put(99, "c");
        tomb.put(65, "A");
        tomb.put(66, "B");
        tomb.put(67, "C");

        tomb.put(68, "D");
        System.out.println(tomb.size());
        System.out.println(tomb.get(99));
        tomb.remove(97);
        System.out.println(tomb.get(100));
        tomb.clear();
        System.out.println(tomb.size());
    }
}
