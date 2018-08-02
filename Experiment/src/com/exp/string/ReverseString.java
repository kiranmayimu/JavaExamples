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
public class ReverseString {

    public static void main(final String[] args) {

        System.out.println("Enter the input: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        char[] array = str.toCharArray();

        String reversedStr = "";

        for (int i = array.length - 1; i >= 0; i--) {

            reversedStr = reversedStr + array[i];
        }

        System.out.println("reverse string is = " + reversedStr);
    }
}
