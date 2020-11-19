package com.company;

import java.util.ArrayList;

public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
     //   System.out.println(url.replace("bots", "odds"));

        ArrayList<String> firstArray = new ArrayList<>();
        System.out.println(firstArray.size());
        firstArray.add("William");
        System.out.println(firstArray.isEmpty());
        firstArray.add("John");
        firstArray.add("Amanda");
        System.out.println(firstArray.size());
        System.out.println(firstArray.get(2));
        for (int i = 0; i < firstArray.size(); i++) {
            System.out.println(firstArray.get(i));
        }
        firstArray.remove(1);
        for (int i = firstArray.size() - 1; i >= 0; i--) {
            System.out.println(firstArray.get(i));
        }
        System.out.println("-------------------------------------");
        for (int i = firstArray.size() - 1; i >= 0; i--) {
            firstArray.remove(i);
        }
        System.out.println(firstArray);

    }
}
