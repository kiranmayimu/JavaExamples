/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.string;

/**
 * @author kiranmayi.mu
 *
 */
public class CountOccurances {

    static int countOccurences(final String str, final String word) {

        String a[] = str.split("\\s");

        int count = 0;

        for (String element : a) {

            if (word.equals(element)) {
                count++;
            }

        }

        return count;
    }

    public static void main(final String args[]) {
        String str = "computer is computer and computer";
        String word = "computer";
        System.out.println(countOccurences(str, word));
    }
}
