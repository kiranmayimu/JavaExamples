/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2018 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.string;

import java.util.Scanner;

/**
 * @author kiranmayi.mu
 *
 */
public class PalindromeExample {

    public static void main(final String[] args) {

        System.out.println("Enter input here: ");
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversedStr = reversedStr + str.charAt(i);

        }

        if (reversedStr.equalsIgnoreCase(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
