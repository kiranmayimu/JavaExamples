/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2017 EVRY. ALL RIGHTS RESERVED
 */
package com.exp.numbers;

public class ReverseNumber {

    public static void main(final String[] args) {
        System.out.println(reverseNumber(123));
    }

    public static int reverseNumber(int number) {

        int reverse = 0;

        while (number != 0) {

            reverse = (reverse * 10) + (number % 10);

            number = number / 10;
        }

        return reverse;
    }
}
