package com.exp.string;

import java.util.HashMap;

class EachCharCountInString {

    static void characterCount(final String inputString) {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {

            if (charCountMap.containsKey(c)) {

                charCountMap.put(c, charCountMap.get(c) + 1);

            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println(charCountMap);
        System.out.println(charCountMap.get('A'));
    }

    public static void main(final String[] args) {

        characterCount("All Is Well");

    }
}