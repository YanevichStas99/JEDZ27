package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        System.out.println(Arrays.toString(getUnicWords(A, B)));
    }

    private static String[] getUnicWords(String a, String b) {
        a = a + " " + b;
        String[] strings = a.split(" ");
        List<String> result1 = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    count++;
                }
            }
            if (count == 1) {
                result1.add(strings[i]);
            }
        }
        String[] result = new String[result1.size()];
        int count = 0;
        for (String s : result1) {
            result[count] = s;
            count++;
        }
        return result;
    }
}
