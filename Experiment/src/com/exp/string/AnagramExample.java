/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kiranmayi.mu
 *
 */
public class AnagramExample {

    public static void main(final String[] args) {

        System.out.println("Enter input here: ");
        final Scanner scanner = new Scanner(System.in);
        final String s = scanner.nextLine();

        System.out.println("Enter input here: ");
        final Scanner scanner2 = new Scanner(System.in);
        final String s2 = scanner.nextLine();

        final String str = s.replaceAll(" ", "");
        final String str1 = s2.replaceAll(" ", "");

        if (str.length() != str1.length()) {
            System.out.println("Provided strings are not anagram");
        }

        else {
            final char[] ch1 = str.toCharArray();
            final char[] ch2 = str1.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                System.out.println("Provided strings are anagram");
            } else {
                System.out.println("Provided strings are not anagram");
            }
        }

    }

}
